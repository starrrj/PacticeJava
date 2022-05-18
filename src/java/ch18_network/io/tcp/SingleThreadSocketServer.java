package ch18_network.io.tcp;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import lombok.extern.log4j.Log4j2;


@Log4j2
public class SingleThreadSocketServer {
	
	// 키보드의 엔터키를 눌렀을 때에 발생하는 키코드 2개를 상수로 선언
	// Mac/Linux/ ... 등 다른 운영체제에서는, LF만 발생
	private static final int CR = 13;
	private static final int LF = 10;

	public static void main(String[] args) throws IOException {
		
		log.debug("main({}) invoked.", Arrays.toString(args));

		int listenPort = 7777;	// 서버의 Listen Port 번호
		int backLog = 100; 		// ServerSocket 의 backlog Q 사이즈
		
//			-----------------------------
		// 지정된 "바인딩 포트(Listen Port)" 번호로 (7777)로, "포트 바인딩"하는 ServerSocket 생성
		ServerSocket serverSock = new ServerSocket(listenPort, backLog);
		log.info("1. serverSock : {}", serverSock);

		try (serverSock) {	// ServerSocket을 자동으로 닫도록 하고,
			
			while(true) {			// 무한 루프... : 왜? 서버의 역할은 지속적으로 새로운 연결을 받고,  Socket을
							// 생성해야 할 역할을 수행하기 위해...
				
				log.info("-------------------------------------------------------------------");
				log.info("2. listening on port {} and addr{} ...", listenPort,serverSock.getInetAddress() );
				log.info("-------------------------------------------------------------------");
				
				// setSoTimeout 메소드의 수행은, accept 메소드 수행 전에 먼저 적용해야함
				// 즉, ServerSocket에 설정을 추가하는 것임: 어떤설정? - 연결 요청을 얼마나 기다릴 것인가! 설정
				serverSock.setSoTimeout(0);			// Infinitely wait for incomming connection
//				serverSock.setSoTimeout(5*1000);	// Finitely wait for Sed connection
				
				// 만일 새로운 연결요청이 들어오면, 수락하고, 새로운Socket 객체 생성
				// 즉 C-S 간에 새로운 연결(=비유: 터널)을 생성
				Socket sock = serverSock.accept();		// Block I/O : Listening and Accepting
				
				//연결된 새로운 클라이언트에 대한 정보를 몇가지 출력해보자!!
				log.info("3. Client Connected.");
				log.info("\t3-1. sock : {}", sock);
				log.info("\t3-2. getLocalSocketAddress() : {}", sock.getLocalSocketAddress());
				log.info("\t3-3. getRemoteSocketAddress() : {}", sock.getRemoteSocketAddress());
				
				String recvLine = null;
				String sendLine = null;
			
				try (sock) {
//					--------------
//					RECV
//					--------------
					
					try {
						// Socket 객체에서, 데이터를 보내고/받을 수 있는 InputStream/OutputStream 객체를
						// 얻어낼 수 있음.
						InputStream is = sock.getInputStream(); 
						BufferedReader br = new BufferedReader(new InputStreamReader(is)); 
						
						recvLine = br.readLine(); // Block I/O
			
						log.info("\t3-4. recvLine : {}", recvLine);
						
					} catch (Exception e) {
						log.error("\t*Exception : {} - {}", e.getClass().getName(), e.getMessage());
					} finally {
//						sock.shutdownInput();
					} // try-catch-finally
					
//					-----------------------------
//					SENT
//					-----------------------------

					
					try {
						sendLine = recvLine;
					
						OutputStream os = sock.getOutputStream(); // 단방향, Socket은 양방향
						BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os)); 
	
						bw.write(sendLine); // Block I/O
	
						// 엔터키를 누를 때 발생하는 2개의 키코드값 전송
	//					bw.write(CR);
	//					bw.write(LF);
	
						bw.flush();
	
						log.info("\t3-5. sendLine : {}", sendLine);
						
					} catch (Exception e) {
						log.error("*Exception : {} - {}", e.getClass().getName(), e.getMessage());
					} finally {
	//					sock.shutdownInput();	// 입력기능만 close 하겠다
	//					sock.shutdownOutput();	// 출력기능만 close 하겠다
					} // try-catch-finally
						
				} // try-with-resources : 'sock'
				
				log.info("4. Client Disonnected");
	
			} // while
			
		} // try-with-resources : 'serverSocket'
		
	} // main 
	
} // end class
				

