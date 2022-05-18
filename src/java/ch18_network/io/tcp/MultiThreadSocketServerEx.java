package ch18_network.io.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MultiThreadSocketServerEx {
	private static final int port=7777;
	
	public static void main(String[] args) throws IOException{
		log.debug("main({}) invoked.", Arrays.toString(args));
		
		ServerSocket serverSock = new ServerSocket(port);
		
		try(serverSock) {
			
			while(true) {
				
				log.info("Listenning on {} ..... ", serverSock);
				
				Socket sock = serverSock.accept();				// Blocking I/O
				log.info("\t+ Client connected from{}", sock);
				
//				-----------------------
				
				// 데이터 수신 Task를 별도의 스레드에서 수행
				new Receiver01("Receiver01", sock).start(); // workThread #1
//				new Receiver02("Receiver02", sock).start();
				
//				---------------------
				
				// 데이터 송신 Task를 별도의 스레드에서 수행
				new Sender01("Sender01", sock).start();		// workThread #2
				
			} // while
			
		} // try-with-resources
	} // main

}
