package ch08_interface.abstract_class;

public class SmartPhone extends Phone {

	
	//1. 생성자
	public SmartPhone(String owner) {
		super(owner);
	} //SmartPhone
	
	//2. 메소드
	public void internetSerach() {
		System.out.println("인터넷 검색을 합니다.");
	} // internetSearch
	
}// end class
