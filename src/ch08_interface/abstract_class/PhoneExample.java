package ch08_interface.abstract_class;

public class PhoneExample {

	public static void main(String[] args) {
		// 추상클래스로부터, 객체를 직접 생성할 수 없음.
		// 왜? 추상이니까.. 실체가 아니니까!
//		Phone phone = new Phone(); // XXX 
		
		//1. 자식객체 생성
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		//2. 부모(추상클래스)로부터 물려받은 메소드 호출
		smartPhone.turnOn();
		smartPhone.internetSerach();
		smartPhone.turnOff();
	}

}
