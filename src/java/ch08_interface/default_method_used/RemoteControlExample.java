package ch08_interface.default_method_used;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null;

		rc = new Television(); // 다형성 -1
		rc.turnOn(); // 다형성 -2
		rc.setMute(true); // 다형성 -2

//		--

		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);

		// 디폴트 메소드 호출

	} // main

}
