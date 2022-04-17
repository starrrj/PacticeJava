package ch12_mutithread.createthread;

import java.awt.Toolkit;

import lombok.NoArgsConstructor;

//Thread 클래스를 상속받는 자식클래스를 만들고,
// 물려받은 메소드인 run() 메소드를 재정의함으로써,
// 새로운 쓰레드 객체를 생성
@NoArgsConstructor
public class BeepTherad extends Thread {	
	
	@Override
	public void run() {		
		System.out.println("BeepTherad::run() invoked.");
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			
			try { Thread.sleep(500); } 
			catch(Exception e) {}
		} //for
	}	// run
	
} // end class
