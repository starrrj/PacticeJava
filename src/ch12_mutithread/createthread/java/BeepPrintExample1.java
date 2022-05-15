package ch12_mutithread.createthread;

import java.awt.Toolkit;

// 이 예제는, Single thread 하나로(즉, main thread), 2가지 일을 하는 예제
// 쓰레드가 하나이기 때문에, 2가지 일(작업, task)를 순차적으로 수행할 수 밖에 없음
public class BeepPrintExample1 {

	public static void main(String[] args) {
// 		"자식"객체를 빠르게 만드는 방법 사용
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++) {			// 1st. Task
			toolkit.beep();					// '띵' 소리 출력
			try { Thread.sleep(500); }		// 밀리초 단위로, 쓰레드의 실행흐름을
			catch(Exception e) {;;}			// 지정된 시간동안 잠시 멈춤.
		} // for
		
		
		for(int i=0; i<5; i++) {			// 2nd. Task
			System.out.println("띵");		// 콘솔로 출력하는 '띵' 문자
			
			try { Thread.sleep(500); }
			catch(Exception e) {;;} 
		} // for
		
	} // main

} // end class
