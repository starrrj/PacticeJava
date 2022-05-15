package ch12_mutithread.createthread;

import java.awt.Toolkit;
 
public class BeepPrintExample3 {
	public static void main(String[] args) {
		//how1 - 자식 쓰레드 클래스를 이용해서, 쓰레드 객체 생성
//		Thread thread = new BeepTherad();
		
		
		//how2 - 익명자식객체 코딩기법으로, Thread 클래스의
		// 		"자식"객체를 빠르게 만드는 방법 사용
		Thread thread = new Thread() {
			
			@Override
			public void run() {		
				Toolkit toolkit = Toolkit.getDefaultToolkit();	
				
				for(int i=0; i<5; i++) {		
					toolkit.beep();
					
					try { Thread.sleep(500); }
					catch(Exception e) {;;}
				}
			}
		}; // 익명자식객체 생성
	
//		------------
		
		thread.start();		
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); } 
			catch(Exception e) {;;}
		} // for
	} // main
} // end class

