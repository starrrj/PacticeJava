package ch08_interface.abstract_class;

public abstract class Phone {

	//1. 공통 필드
	public String owner;
	
	//2.ㅈ 생성자
	public Phone(String owner) {
		this.owner = owner;
	} // constructor 부모객체부터 생성해야하기 때문에 
	
	// 3. 공통 메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	} // turnOn
	
	// 4. 공통 메소드
	public void turnOff() {
		System.out.println("폰 전원을 켭니다.");
	} //turnOff
}
