package ch12_mutithread.createthread;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	
	// 이전 예제의 2가지 작업 (비프음출력, 띵 문자출력)을
	// Worker Thread를 만들어서, 동시에 수행시키자!!
	public static void main(String[] args) {
		
		// 1. 작업쓰레드(Worker Tread)를 만드는 첫번째 방법
//		Runnable beepTask = new BeepTask(); // run() 로 실행
//		Thread thread = new Thread(beepTask);
//		
//		thread.start();
		
//		---
		
		// 2. 작업쓰레드(Worker Thread)를 만드는 두번째 방법
//		Thread thread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				
//				Toolkit toolkit = Toolkit.getDefaultToolkit();	
//				
//				for(int i=0; i<5; i++) {		
//					toolkit.beep();
//					try { Thread.sleep(500); }
//					catch(Exception e) {;;}
//				}
//			}
//		});
		
//		-----
		
		// 3. 작업쓰레드(Worker Thread)를 만드는 두번째 방법, 가장 효율적
		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			
			for(int i=0; i<5; i++) {	
				System.out.println("띵");	
				
				try { Thread.sleep(500); }
				catch(Exception e) {;;} 
			}// for
		}); // 람다식을 이용한, 익명구현객체 생성
		
//		--------
		
		thread.start();
		
//		------------
		
		// 각자 실행이라 순서는 상관없다. 맨위로 올려도 됨.
		for(int i=0; i<5; i++) {	
			System.out.println("띵");	
			
			try { Thread.sleep(500); }
			catch(Exception e) {;;}
	
		}
	} // main
} // end class
