package interfaceEx.abstract_method;

public class Cat extends Animal{
	
	
	public Cat() {
		this.kind = "표유류";
	} // default constructor

	//부모인 추상클래스에 선언된, 추상메소드를 반드시 구현(재정의, overriding)해야 함! - 규격, 강제
	//만일, 자식 클래스에서 구현(재정의)하지 않으면, 자식클래스조차 "abstract"키워드로
	// 추상클래스화 해야함 (왜? 강제사항인 규격을 지키지 않았기 때문에...)
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
