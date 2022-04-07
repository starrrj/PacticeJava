package ch18_network;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ObjectSingleThread {

	try (serverSocket) {
		
		while(true) {
			log.info("-------------------------------------------------------------------");
			log.info("2. listening on port {} and addr{} ...", listenPort,serverSock.getInetAddress() );
			log.info("-------------------------------------------------------------------");
		
			try(socket) {
				// Recv
				InputStream is = socket.getInputStream();
				
				// 객체의 직렬화/역직렬화를 이용한 입력/출력을 위해,
				// Object 기반의 입력 보조스트림 생성
				ObjectInputStream ois = new ObjectInputStream(is);
				
				//객체를 읽어드림(이때, readObject 메소드의 리턴타입은 'Object'임
				// 따라서, 리턴값이 다형성-1에 의해서 조상품에 안겨서 반환되기 때문에,
				// 실제 객체의 역직렬화를 통해서 받은, 객체를 강제형변환시켜, 부모품에서
				// 빼내야함.
				Member member = (Member) ois.readObject();
				log.info("4. Received a member from client : {}", member);
				
//				-------------------------------------
				
				//Sent
				ObjectOutputStream os = socket.getOutputStream();
				
				// 객체의 직렬화/역직렬화를 이용한 입력/출력을 위해,
				// Object .기반의 출력 보조스트림 생성
				ObjectOutputStream ods = new ObjectOutputStream(os);
			}
			
		
		}
		
		
	}
	
}
