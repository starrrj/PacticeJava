package ch08_interface.abstrace_mehod;

public class Television implements RemoteControl {
	// 1. 인스턴스 필드
	private int volume;
	
	// 2. turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
			
	// 2. turnOff() 추상 메소드의 실체 메소드
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
			
	@Override
	public void setVolume(int volume) {
	// 인터페이스에 선언된 static final 상수의 활용
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {		
			this.volume = volume;
		} // if-else
		
		System.out.println("현대 Television 볼륨: " + volume);
	} // setVolum

} //calss

