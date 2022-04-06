package ch18;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.util.Arrays;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ServerSocketEx {
	
	public static void main(String[] args) throws IOException{
		log.debug("main({}) invoked", Arrays.toString(args));
		
		int listenPort = 7777;
		int backLog = 100;
		
//		---------
		
		// 1. 클라이언트의 연결요청을 특정 포트로 받아서, 연결을 수락하고
		//    그 결과로 Socket 객체까지 만들어 내는데 핵심역할을 하는 객체 생성
		ServerSocket serverSocket = new ServerSocket();
		
		// 2. 서버가 특정포트로 Listen 할 수 있도록, Port Binding 수행
		serverSocket.bind(new InetSocketAddress(listenPort));
//		serverSocket.bind(new InetSocketAddress(InetAddress.getLocalHost(), listenPort));
//		serverSocket.bind(new InetSocketAddress(InetAddress.getLocalHost(), listenPort), backLog);
//		serverSocket.bind(new InetSocketAddress("0.0.0.0",listenPort), backLog);
		
//		-----------------------
		
//		ServerSocket serverSocket = new ServerSocket(listenPort);
		
//		----------------------
		
//		ServerSocket serverSocket = new ServerSocket(listenPort, backLog);
		
//		----------------------
		
//		ServerSocket serverSocket = new ServerSocket(listenPort, backLog, InetAddress.getLocalHost());
		
//		----------------------
		
		log.info("1. serverSocket : {}", serverSocket);
		
	}

}
