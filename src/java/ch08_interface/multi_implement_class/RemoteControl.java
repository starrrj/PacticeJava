package ch08_interface.multi_implement_class;

public interface RemoteControl {
	
	//1. 상수
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
		
		
		
	//2. 추상 메소드 (강제규격) - 자식객체가 반드시 구현해야 할 기능을 선언
	
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	
	// -----@since 8
	//3. 디폴트 메소드 (완전한 인스턴스 메소드이다!) -> 객체없이는 사용불가!!
	// 인터페이스규약을 따르는 자식객체에서 사용
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다.");
		} else {
			System.out.println("무음해제합니다.");
		} // if-else
	} // setMute
	
	// 4. 정적 메소드
	static void changeBatterty() {
		System.out.println("건전지를 교환합니다.");
	}
		
}// end interface