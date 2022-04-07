package ch18_network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;
import lombok.extern.log4j.Log4j2;


@Log4j2
public class SingleThreadSocketClient {
	// 키보드의 엔터키를 눌렀을 때에 발생하는 키코드 2개를 상수로 선언
	// Mac/Linux/ ... 등 다른 운영체제에서는, LF만 발생
	private static final int CR = 13;
	private static final int LF = 10;

	public static void main(String[] args) throws UnknownHostException, IOException {
		log.debug("main({}) invoked.", Arrays.toString(args));

//		----------------------------
//		String serverAddress = "111.222.333.444"
//		// IP주소가 다를경우 -> java.net.UnknownHostException

		String serverAddress = "localhost"; // Loopback Address(127.0.0.1)'s domain name
		int serverPort = 7777;
		int connectTimeout = 1000; // milliseconds

//		-----------------------------
//		1st method: Socket 객체 생성시, 바로 서버로 연결시도
//		-----------------------------

//		Socket socket = new Socket(serverAddress, serverPort);
//		Socket socket = new Socket(InetAddress.getByName(serverAddress), serverPort);
//		log.info("1. socket : {}", socket);

//		-----------------------------
//			2nd method: Socket 객체 생성시, 바로 서버로 연결시도를 분리수행 , connect
//		-----------------------------

		Socket sock = new Socket();

//		sock.connect(new InetSocketAddress(serverAddress, serverPort)); // 연결하려면 server주소,port번호 둘다 있어야 연결가능
		sock.connect(new InetSocketAddress(serverAddress, serverPort), connectTimeout); // timeout 반드시 지정.
		// 서버가 연결이 끊기면 바로 거절됨 <- Connection refused

		log.info("1. socket : {}", sock);

//			------------------------------

		log.info("\t1-1. getLocalSocketAddress", sock.getLocalSocketAddress());
		log.info("\t1-2. getRemoteSocketAddress", sock.getRemoteSocketAddress());

//			-----------------------------
//			SENT
//			-----------------------------

		try (sock) {
			try {
				String sendLine = "Hello, World!!!";
				
				// Socket 객체에서, 데이터를 보내고/받을 수 있는 InputStream/OutputStream 객체를
				// 얻어낼 수 있음.
//				InputStream is = sock.getInputStream(); // 미리 얻어도 되지만, 당장사용하지않을 것이라서 생성X
				OutputStream os = sock.getOutputStream(); // 단방향, Socket은 양방향
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os)); 

				bw.write(sendLine); // Block I/O

				// Enter 키 코드값 전송
//				bw.write(CR);
//				bw.write(LF);

				bw.flush();

				log.info("2. sendLine : {}", sendLine);
			} catch (Exception e) {
				log.error("*Exception : {} - {}", e.getClass().getName(), e.getMessage());
			} finally {
//				sock.shutdownInput();	// 입력기능만 close 하겠다
//				sock.shutdownOutput();	// 출력기능만 close 하겠다
			} // try-catch-finally
			
//			--------------
//			RECV
//			--------------
			
			try {
				InputStream is = sock.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				
				String recvLine = br.readLine();		// Block I/O
				
				log.info("3. recvLine : {}", recvLine);
			}catch(Exception e) {
				log.error("* Exception : {} - {}", e.getClass().getName(), e.getMessage());
			} finally {
//				sock.shutdownInput();
			} // try-catch-finally 
			
		} // try-with-resources
		
		log.info("4. Client Disonnected");

	}

}
