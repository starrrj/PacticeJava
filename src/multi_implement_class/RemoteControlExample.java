package multi_implement_class;


public class RemoteControlExample {

	public static void main(String[] args) {
		//그냥 구현객체 생성
		SmartTelelvision tv = new SmartTelelvision();
		
		//다형성-1 수행
		RemoteControl rc = tv;			// 첫번째 인터페이스 타입(부모) 참조변수에 대입가능
		Searchable searchable = tv;		// 두번째 인터페이스 타입(부모) 참조변수에 대입가능
		
		//다형성-2 수행
		rc.turnOn();
		searchable.search("http://www.naver.com");
		
		// 디폴트 메소드 호출
		rc.setMute(false);
	} // main

}
