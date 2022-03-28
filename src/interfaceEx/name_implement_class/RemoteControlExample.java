package interfaceEx.name_implement_class;


public class RemoteControlExample {

	
	public static void main(String[] args) {
		
		RemoteControl rc = new RemoteControl() {
			
			String name = "Java";
			int age = 23;
			
			public void instanceMethod() {
				System.out.println("instanceMethod");
			}

			@Override
			public void turnOn() {
				System.out.println("turnOn. name" + this.age );
				instanceMethod();
			}//turnOn

			@Override
			public void turnOff() {
				System.out.println("turnOff. age" + age);
				
				System.out.println("\t + this: " + this);
				
			} //turnOff

			@Override
			public void setVolume(int volume) {
				System.out.println("setVolume");
				
			} // setVolume
			
	};// 익명구현객체 생성

	rc.turnOn();
	rc.turnOff();
	rc.setVolume(RemoteControl.MAX_VOLUME);
	
	System.out.println("rc: "+rc);
	
	// 익명구현객체 선언시, 배무에 선언한 추가적인 필드와 메소드는 참조변수명. 필드/메소드 식으로
	// 사용불가! -> 오로지 익명구현객체 블록 내부에서만 사용하라!!!
//	System.out.println(name);

		
	} // main
	
}// class
