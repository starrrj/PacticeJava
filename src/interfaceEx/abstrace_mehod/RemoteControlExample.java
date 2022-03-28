package interfaceEx.abstrace_mehod;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;			// 부모타입
		
		// 처음보는 타입의 객체는 출력해보면, 의외로 얻는 정보가 많다.
		// 라는 것! 잊지마세요.
		rc = new Television();		// 다형성-1
		System.out.println("rc2: " + rc);
	

		rc.turnOn();				// 다형성 -2
		rc.turnOff();				// 다형성 -2

		rc = new Audio();			// 다형성-1
		System.out.println("rc2: " + rc);
		
		rc.turnOn();				// 다형성 -2
		rc.turnOff();				// 다형성 -2
		
	} // main

} // end class
