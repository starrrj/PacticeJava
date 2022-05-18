package ch18_network.io.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

import ch18_network.domain.Member;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ObjectSingleThreadSoketServer {
	
	// ObjectInput/OUtputStream 보조스트림을 이용한 통신 구현 예제(서버)
	public static void main(String[] args) throws IOException {
		
		log.debug("main({}) invoked", Arrays.toString(args));
		
		int listenPort = 7777;
		int backLog = 100; // 연결요청 Queue
		
//		-------------------------------------

		ServerSocket serverSocket = new ServerSocket(listenPort, backLog);
		log.info("1. serverSocket : {}", serverSocket);
		
//		--------------------------------------
		
		try (serverSocket) {

			while (true) { // accept 무한루프 , Blocking IO
				log.info("----------------------------------------------------------------------------");
				log.info("2. listening on port {} and addr{} ...", serverSocket.getLocalSocketAddress());
				log.info("----------------------------------------------------------------------------");

				Socket socket = serverSocket.accept(); // 한번만 생성하면 한번만 처리 -> 반복
				log.info("3. Client connected from address: {}", socket.getRemoteSocketAddress());
				
//		--------------------------------------				
				
				try (socket) {
					// Recv
					InputStream is = socket.getInputStream();

					// 객체의 직렬화/역직렬화를 이용한 입력/출력을 위해,
					// Object 기반의 입력 보조스트림 생성
					ObjectInputStream ois = new ObjectInputStream(is);

					// 모든 객체를 읽을려면 최상위부모의 Object 사용
					// 객체를 읽어드림(이때, readObject 메소드의 리턴타입은 'Object'임
					// 따라서, 리턴값이 다형성-1에 의해서 조상품에 안겨서 반환되기 때문에,
					// 실제 객체의 역직렬화를 통해서 받은, 객체를 강제형변환시켜, 부모품에서
					// 빼내야함.
					Member member = (Member) ois.readObject(); // 자바빈즈 -> Serializable. (다른회사랑 주고받는경우가 있음.) 직렬화, 역직렬화를 이용
					log.info("4. Received a member from client : {}", member);

//				-------------------------------------

					// Sent
					OutputStream os = socket.getOutputStream();

					// 객체의 직렬화/역직렬화를 이용한 입력/출력을 위해,
					// Object .기반의 출력 보조스트림 생성
					ObjectOutputStream oos = new ObjectOutputStream(os);
					
					// 멤버객체의 값을 변경해서 에코
					// 은닉화된 메소드를 수정하여 보내자!
					member.setId(2);
					member.setName("Trinity");
					member.setAge(33);
					
					oos.writeObject(member);	// 전송
					oos.flush();
					
					log.info("5. Sended a modified member to client : {}", member);
					
				} catch (ClassNotFoundException | IOException e) {
					e.printStackTrace();
				} // try-with-resources : 'socket'
				
			} // while
			
		} // try-catch
	
	} // main
	
} // end class
