package ch18_network.io.tcp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

import lombok.extern.log4j.Log4j2;


@Log4j2
public class MultiChatClient {
	// 채팅서버의 연결정보 선언
	private static final String host = "localhost"; // Loopback address
	private static final int port = 7777; 			// 서버의 Listen Port
	
	public static void main(String[] args) throws IOException, InterruptedException {
		log.debug("main({}) invoked.", Arrays.toString(args));
		
		try(Socket sock = new Socket(host, port)) {	// 채팅서버 연결
			log.info("Connected to the server addr: {} , port: {}", host,port);
			
			Thread R = new Receiver(sock.getInputStream());	// 메세지 수신 쓰레드 생성 및 시작
			R.start();
			Thread S = new Sender (sock.getOutputStream());// 메세지 수신 쓰레드 생성 및 시작
			S.start();
			
//			-----------------------
			
			R.join();	// R 스레드가 종료될때까지 기다림
			S.join();	// S 스레드가 종료될때까지 기다림
		} finally {
			log.info("Disconnected");
		} // try-with-resources
			
//		--------------------------
		
		// 메소드 블록 안에서 선언된 클래스를 "로컬class"라고 한다!!!
//		class Message {
//			String name;
//			int age;
//		} // end class
//		Message messaget = new Message(); // 객체는 힙에 저장
//		send(message);   // 잠시 사용할 때
		
		
		} // main
	
	
//	---------------------
	
	// 멤버클래스, 접근제한자 사용가능(default), static 사용이유-> 메인메소드에서 사용하려고
	// 이 클래스와 밀접한 관계가 있고, 이 클래스 블록 안에서만 사용된다.
	static class Sender extends Thread {
		private final OutputStream os;
		
		Sender(OutputStream os) {
			log.trace("constructor({}) invoked. ", os);
			
			this.os = os;
		} // constructor
		
		@Override
		public void run() {
			log.trace("run() invoked.");
			Scanner scanner = new Scanner(System.in);
			
			try(this.os; scanner;) {
				log.debug("Sender started.");
				
				int CR =13, LF=12;
				
				String line = null;
				while((line=scanner.nextLine())!= null) { // null == EOF
//					log.info("line : {}, line");
					
					String message = line.trim();
					os.write(message.getBytes("UTF-8"));
					
					// Sent CRLF(***) : 메시지의 끝임을 나타내는 경계로 정함
					os.write(CR);
					os.write(LF);
					
					os.flush();
					
//					log.info("SENT: {}", message);
					log.info(message);
				} // while
			} catch(IOException | IllegalStateException | NoSuchElementException e) {
				e.printStackTrace();
			} finally {
				log.debug("Sender stopped.");
			} // try-with-resources

		} // run

	} // end class : Sender
	
//	--------------------------
	
	static class Receiver extends Thread {
		private final InputStream is;

		
		Receiver(InputStream is) {
			log.trace("constructor({}) invoked.", is);
			
			this.is = is;
		} // constructor
		
		@Override
		public void run() {
			log.trace("run() invoked.");
			
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			
			try (this.is; baos;) {
				log.debug("Receiver started.");
				
				int ch;
				int CR=13, LF=10;
				
				while((ch=is.read()) != -1) {
//					log.info("ch: {}", ch);
					
					if(ch != CR && ch != LF) {
						baos.write(ch);
					} else {
//						log.info("\t+ excluded: {}", ch);
						
						if(ch == LF) {
							String recv = baos.toString("UTF-8");
//							log.info("RECV: {}", recv);
							log.info(recv);
							
							baos.reset();
						} // if
					} // if-else
				} // while
				
			} catch(IOException e) {
				e.printStackTrace();
			} finally {
				log.debug("Receiver stopped.");
			} // try-with-resources

		} // run

	} // end class : Receiver

} // end class

