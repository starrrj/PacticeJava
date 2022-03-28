package interfaceEx.abstract_method;

public class /*abstract*/Dog extends Animal{
	
	
	public Dog() {
		this.kind = "포유류";
//		super.kind = "포유류";
	} // default constructor
	
	// 부모인 추상클래스에 선언된, 추상메소드(강제규격)를 구현(재정의)
	@Override
	public void sound() {
		System.out.println("멍멍");
	} // sound

}
