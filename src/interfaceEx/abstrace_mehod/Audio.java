package interfaceEx.abstrace_mehod;

import lombok.ToString;

@ToString
public class Audio implements RemoteControl{
	//1. 필드
	private int volume;
	

//-------------인터페이스의 규격을 구현 (재정의)---------------//
		
		// 2. turnOn() 추상 메소드의 실체 메소드
		public void turnOn() {
			System.out.println("Audio를 켭니다.");
		}
		
		// 2. turnOff() 추상 메소드의 실체 메소드
		public void turnOff() {
			System.out.println("Audio를 끕니다.");
		}
		
		//2. setVolum() 추상 메소드의 실체메소드
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
			
				System.out.println("현대 Audio 볼륨: " + volume);
		}
//		--- default 메소드(setMute) 재정의 ------
		
		@Override
		public void setMute(boolean mute) {
			System.out.println("Audio::setVolume() invoked.");
		} // setVolum


		

} //calss
