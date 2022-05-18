package ch18_network.io.tcp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class MultiChatServer {
	private static final int port = 7777; 
	
//	private static final Charset charset = StandardCharsets.UTF-8;	// XX
//	private static final Charset charset = Charset.defaultCharset();	// XX
	private static final Charset charset = Charset.forName("UTF-8");	// OK
//	private static final Charset charset = Charset.forName("MS949");	// OK	
	
	
	// Multicast 기반의 채팅을 구현하기 위해서는...
	// 서버의 역할은 오로지 "중개" 역할을 잘 해주면 됨..
	// 이 서버에 연결된 클라이언트 들 끼리, 보내고/받는 메시지 처리만 중앙에서
	// 잘 처리해주면 되는 것임. 그래서, 서버에 연결된 모든 클라이언트 정보를 담을 컬렉션이 필요하고,
	// 이 컬렉션을 Map<K,V>으로 하기로 함.
	private static Map<String, Socket> clients;
	
	public MultiChatServer() {
		log.trace("Default constructor incoked.");
		
		clients = new HashMap<>();	// HashMap 객체 생성
		
		// HashMap은 멀티쓰레드 환경에서 Thread-Unsafe하기 때문에, 이를
		// 다시 Thread-Unsafe 하게 조작할 수 있도록 만들어줘야 하며, 
		// 이를 해주는 것이 바로 아래의 제네릭 정적 메소드임
		clients = Collections.<String, Socket> synchronizedMap(clients);

		log.debug("synchronized client list created. type: {}", clients.getClass(). getName());
	} // Default Constructor
	
	private void start() {
		log.trace("start() invoked.");
		
		try (ServerSocket serverSock = new ServerSocket(port)){ // 자바7까지는 이렇게했다
			log.debug("Server started.");
			
			while(true) {	// 서버소켓의  일
				
				log.debug("listening on {} ......", serverSock);
				
				Socket sock = serverSock.accept();
				log.debug("Client Connercted From {}", sock);
			
//				-----
				
				// 별도의 쓰레드로, 다수의 클라이언트가 보낸 메시지를 수신 할 수 있는
				// Task를 처리하도록 함.
				ServerReceiver receiver = new ServerReceiver(sock); // Worker 쓰레드 객체 생성
				receiver.start();									// Worker 쓰레드 시작
			} // while
			
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				log.info("Server finished.");
			} // try-with-resources
	} // start
		
	
	//멤버클래스
	// lombok annotation을 중첩 클래스에 적용하라면,  static해야한다.
	@Log4j2
	static 
	// 이 Worker Thread는 새로이 연결된 클라이언트 socket 당 하나씩 생성.
	class ServerReceiver extends Thread {	//  Worker 쓰레드, 별도로 해도 상관없으나 중첩한 이유가 있다!
											// 진짜 메세지 중개 역할을 하는 서버측 쓰레드
		final Socket sock;
		final String clientKey;		// 새로운 클라이언트의 닉네임

		ServerReceiver(Socket sock) {
			log.trace("Constructor({}) invoked.", sock);
			
			this.sock = sock;
			this.clientKey = sock.getRemoteSocketAddress().toString();
			
			// 서버가 중개역할에 충실하려면, 새로이 연결된 클라이언트 Socket을 컬렉션으로
			// 관리하게 하고, 후에 publish 하기 위해서 컬렉션에 저장.
			clients.put(this.clientKey, sock);
			log.debug("clients: {}", clients);
			
			try {
				String WELCOME = String.format("<<< Client Key: %s Entered. Welcome !!!", this.clientKey);
				// 현재 연결된 모든 클라이언트에게 동일 메세지 전송해주는 메소드 호출(***)
				publish("SERVER", WELCOME, true);
				
			// Map객체에서 오류발생시키는 그 즉시 삭제.
			} catch (IOException e) {
	//			e.printStackTrace();
				
				// 통신(입/출력)에 문제가 발생한 클라이언트는 Map에서 삭제처리
				clients.remove(this.clientKey);
				log.debug("clients: {}", clients);
				
				try {
					String BYE = String.format(">>>Client Key: %s Exited. Bye !!!", this.clientKey);
					
					// 현재 연결된 모든 클라이언트에게 동일 메세지 전송해주는 메소드 호출
					publish("SERVER", BYE, true);
				} catch(IOException e1) {;;}
			} // try-finally
		} // Constructor 생성자
			
			@Override
			public void run() {
				log.trace("run() invoked.");
				
				try (this.sock) {
					InputStream is = this.sock.getInputStream();
					
					// 이 보조스트림은 기본 스트림에 연결해서 쓰는 보조스트림이 아니라,
					// JVM 메모리에 바이트 데이터를 축적하기 위해서 사용하는 보조스트림임.(마치 금고처럼)
					ByteArrayOutputStream baos = new ByteArrayOutputStream();
					
					try (is; baos;) { // 보조스트림은 기본스트림에 도움을 주는 헬퍼. 오른쪽에서 왼쪽으로 읽는다. 
//						------------------------------------
//						1. RECEIVE MESSAGES FROM ALL CLIENTS
//						------------------------------------
						int CR=13, LF=10;
						
						int ch;
						String RECV = null;
						
						while((ch = is.read()) != -1) {							
//							log.info("ch: {}", ch);							
							if(ch != CR && ch != LF) {
								baos.write(ch);
							} else {
//								log.info("\t+ excluded: {}", ch);
								if(ch == LF) {
									RECV = baos.toString(charset);
//									log.info("RECV: {}", RECV);
									log.info("RECV form {} : {}", this.clientKey, RECV);
									
									baos.reset();
									
//									------------------------------------
//									2. PUBLISH MESSAGES TO ALL CLIENTS
//									------------------------------------
									publish(this.sock.getRemoteSocketAddress().toString(), RECV, false);
								
								} //if						
							} // if-else					
						} // while : is.read() != 1						
					} // try-with-resources : is, baos
					
				} catch(IOException e) {
//					e.printStackTrace();	// 찍어봤자 좋은점이 없어서 주석
				} finally { // 어떤식으로든 끊어져 더이상 메세지를 교환할 수 없는 클라이언트는  Map에서 제거!!
					log.info("Client {} Disconnected", this.sock); // finally블록에 왔다는건 while문이 종료됨을 의미
					
					clients.remove(this.clientKey, this.sock);	// map객체에서 제거
					log.debug("clients: {}", clients);
					
					try {
						String BYE = String.format(">>> Client Key: %s Exited. Bye !!!", this.clientKey);
						publish("SERVER", BYE, true);	// *** 새로운클라이언트 ,새로운 메시지, 기존클라이언트끊어졌을때
					} catch (IOException e1) {;;}
				} // try-with-resources : this.sock
				
			} // run
			
		} // end class
		
	// 현재 Connected all clients 에게 메시지를 전달!!!, Map객체에 남아있는 클라이언트에게
	private static void publish(String fromKey, String message, boolean toSelf) throws IOException {
		log.trace("publish({}, {}) invoked.", fromKey, message);
		
		Set<String> keys = clients.keySet();
		
		for(String key : keys) {	// MAP객체의 key를 traverse..
			
			log.debug("publish to the client key: {}", key);
			
			// 메세지를 받은 클라이언트와 Key 동일하지않거나, toSelf매개변수가 true일때만(나한테도보내라)
			// 받은 메세지를 전송하라!!
			if(!key.equals(fromKey) || toSelf) {
					
				int CR=13, LF=10;

				Socket sock = clients.get(key);
				OutputStream os = sock.getOutputStream();
				
				os.write((fromKey+": "+message).getBytes(charset));
				os.write(CR);
				os.write(LF);
				
				os.flush();
				
//				log.info("SENT: {}", message);
				log.info("SENT from {}: {}", fromKey, message);
				
			} else { // if 조건 and
				log.debug("Excluding client itself key: {} to publish.", fromKey);
			} // if-else			
		} // enhanced for		
	} // publish
	

	public static void main(String[] args) {
		log.trace("main({}) invoked", Arrays.toString(args));
		
//		Charset.availableCharsets().forEach((key, cs) -> {
//			log.debug("{}", key);
//		});

		new MultiChatServer().start();
	} // main

} // end class

	
