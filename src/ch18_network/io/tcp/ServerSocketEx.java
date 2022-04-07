package ch18_network.io.tcp;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ServerSocketEx {
	
	public static void main(String[] args) throws IOException, InterruptedException{
		log.debug("main({}) invoked", Arrays.toString(args));
		int listenPort = 7777;
		int backLog = 100;		// 연결요청Q
		
//		---------
		
		// 1. 클라이언트의 연결요청을 특정 포트로 받아서, 연결을 수락하고
		//    그 결과로 Socket 객체까지 만들어 내는데 핵심역할을 하는 객체 생성
		ServerSocket serverSocket = new ServerSocket();
//		log.info("1. serverSocket : {}", serverSocket);
		
		// 2. 서버가 특정포트로 Listen 할 수 있도록, Port Binding 수행
		// InetAddress = HostName + IP address
		// InetSocketAddress = InetAddress + Port
		serverSocket.bind(new InetSocketAddress(listenPort)); // 자주 사용한다.
//		serverSocket.bind(new InetSocketAddress(InetAddress.getLocalHost(), listenPort));
//		serverSocket.bind(new InetSocketAddress(InetAddress.getLocalHost(), listenPort), backLog); // backLog:int-type
//		serverSocket.bind(new InetSocketAddress("0.0.0.0",listenPort), backLog);
		
//		-----------------------
		
//		ServerSocket serverSocket = new ServerSocket(listenPort);
		
//		----------------------
		
//		ServerSocket serverSocket = new ServerSocket(listenPort, backLog); // backLog는 보여주지않는다.
		
//		----------------------
		
//		ServerSocket serverSocket = new ServerSocket(listenPort, backLog, InetAddress.getLocalHost());
		
//		----------------------
		
		log.info("1. serverSocket : {}", serverSocket);
		

		
		try(serverSocket) { // 여러개의 자원을 이용할 때는 try-with-resources 블록을 사용. @CleanUp은 순서가 없어 애매
			log.info("2. Server listeming on port {} and addr {} ...",
					listenPort, serverSocket.getInetAddress()); // Host,IP주소 추출, 한번만 수행하게 바깥쪽에 위치
			
			while(true) {	// 서버는 계속 받아들여야 하기에 While로 반복
				Socket socket = serverSocket.accept();		// Block I/O : 연결요청이 없으면 멈춘다.
				
//				----------------------
//				Thread.sleep(1000*60);	// 60초 동안 실행을 멈춰라!! (blocking)
//				----------------------
				try (socket) {
					log.info("3. socket : {}", socket);
					log.info("\t+ getInetAddress: {}, getPort: {}, getLocalPort: {}",
							socket.getInetAddress(), socket.getPort(), socket.getLocalPort());
					
					log.info("\t+ getRemoteSocketAddress : {}", socket.getRemoteSocketAddress());
				} // try-with-resources
			} // while
		}	// try-with-resources
		
	}	// main

}// end class
