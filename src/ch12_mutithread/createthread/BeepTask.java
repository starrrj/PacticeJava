package ch12_mutithread.createthread;

import java.awt.Toolkit;

import lombok.NoArgsConstructor;

//함수적 인터페이스인 Runnable을 구현하는 구현 클래스 선언
@NoArgsConstructor
public class BeepTask implements Runnable {	
	
	@Override
	public void run() {		
		System.out.println("BeepTask::run() invoked.");
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			
			try { Thread.sleep(500); } 
			catch(Exception e) {}
		} //for
	}	// run
	
} // end class
