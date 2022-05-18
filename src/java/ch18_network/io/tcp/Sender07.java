package ch18_network.io.tcp;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Sender07 extends Thread {
	private Socket sock;
	private OutputStream os;
	
	Sender07(String threadName, Socket sock) {
		log.debug("Constructor({})", sock);

		this.sock = sock;

		super.setName(threadName + "-" + super.getName());

		try {this.os = this.sock.getOutputStream();} 
		catch (IOException e) {;;}
	} // Constructor
	
	@Override
	public void run() {			// 데이터 송신 쓰레드의 실행진입점
		log.debug("run() invoked.");
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(this.os);
			
			try(oos){
				for(int i=0; i<10; i++) {
					String message = "서버가 보내는 메시지-"+i;
					
					oos.writeObject(message);	// 객체의 직렬화를 통한 
					oos.flush();
					
					log.info("SENT: {}",message);
					
					Thread.sleep(1000*1);
				} // for
			} // try-with-resources
		} catch (Exception e) {	
			e.printStackTrace();
			
		} finally {
			try { this.os.close(); } catch(IOException e) {;;;}
			try { this.sock.close(); } catch(IOException e) {;;;}
		} // try-catch-finally
		
		log.info("Done.");
	} // run
	
} // end class
