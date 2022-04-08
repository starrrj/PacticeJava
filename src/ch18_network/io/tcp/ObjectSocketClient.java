package ch18_network.io.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Arrays;

import ch18_network.domain.Member;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ObjectSocketClient {
	
	// ObjectInput/OUtputStream 보조스트림을 이용한 통신 구현 예제(서버)
	public static void main(String[] args) throws IOException,ClassNotFoundException {
		
		log.debug("main({}) invoked", Arrays.toString(args));

//		-------------------------------------
		
		Member member = new Member();
		member.setId(0);
		member.setName("Star");
		member.setAge(24);
		
//		-------------------------------------
		
		String serverAddress = "localhost";
		int backLog = 7777;
		int connectTimeout = 1000*1; // milliseconds
		
//		-------------------------------------

		Socket socket = new Socket();
		socket.connect(new InetSocketAddress(serverAddress, backLog),connectTimeout); // Blocking I/O
		log.info("1. Connected to server, socket : {}", socket);
		
//		--------------------------------------
		
		try (socket) {
			
			OutputStream os = socket.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			oos.writeObject(member);	// 전송
			oos.flush();
			
			log.info("2. Sended a member to server : {}", member);
			
			InputStream is = socket.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			
			member = (Member) ois.readObject();
			
			log.info("3. Recebied a member from server : {}", member);
			
		} // try-with-resources
	
	} // main
	
} // end class
