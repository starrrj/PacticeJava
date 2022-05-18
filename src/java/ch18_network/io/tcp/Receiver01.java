package ch18_network.io.tcp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

import lombok.extern.log4j.Log4j2;

// 데이터 수신만 전문으로 하는 Worker Thread 클래스 선언

@Log4j2
public class Receiver01 extends Thread {
	private Socket sock;		// ServerSocket이 생성한 Socket 객체 보관
	private InputStream is;		// Socket 객체에서 얻어낸 입력스트림 보관
	
	public Receiver01 (
			String threadName,	// 데이터 수신 쓰레드의 이름을 받자
			Socket sock			// ServerSocket이 생성한 socket 객체를 받자!
			) {
			
			log.debug("Constructor({}) invoked.", sock);
			
			this.sock = sock;		// 인스턴스 필드 초기화
			
			// Socket으로부터, 데이터 수신을 위한 입력스트림 추출 및 필드에 설정(보관)
			try { this.is = this.sock.getInputStream();}
			catch(IOException e) {;;;}
			
			// 부모 클래스인 Thread가 물려준, run() 메소드를 재정의:
			// 참고로, 부모의 run() 메소드는 하는 일이 없음!!!
			// 이 run() 메소드의 블록 범위가, 새로운 쓰레드의 실행범위가 됨 like JVM main thread.
	}
			@Override
	public void run() {
		log.debug("run() invoked");
		
		// 아래의 타입은, 자바입출력을 위한 보조스트림중에 하나로,
		// 의 데이터를 메모리에 보관할 수 있게 해주는 보조 출력 스트림.
	
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		try (baos) {	// 보조스트림도 자원객체이니, 닫아줘야겠죠!?
			
			int ch;
			int CR=13, LF=10;		// Enter key codes
			
			while((ch=is.read()) != -1) {	// 입력스트림의 EOF(-1)을 만나기 까지는...
//				log.info("ch: {}", ch);
				if(ch!= CR && ch != LF) {	// 수신된 바이트값이, CRLF가 아니면...
					baos.write(ch);			// 보조출력스트림에 저장
				} else {
					log.info("\t+ exclude d: {}", ch);
				
					if(ch == LF) {			// 수신된 바이트값이, CR 또는 LF라면..
						// 현재까지 보조출력스트림에 저장된 모든 바이트열을 문자열로 변환
						String recv = baos.toString("UTF-8");
						log.info("RECV: {}", recv);			// 콘솔에 출력
						
						baos.reset();	// 바이트열 보조스트림 내부를 깨끗하게 지움(공장초기화)
					} // if
				} // if-else
			} // while
		} catch (Exception e) {;;}
		finally {
			try { this.is.close(); } catch(IOException e) {;;}  // sock의 입력스트림먼저 닫고
			try { this.sock.close(); } catch(IOException e) {;;} // so소켓 닫기
		} // try-catch-finally
		
		log.info("Done.");
	} // run
	} // main

