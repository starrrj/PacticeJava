package polymorphism.p2;

import polymorphism.p1.Parent;

public class Other2 extends Parent{

//	다른 패키지(상자)에 있기 때문에 모든 멤버는 사용 불가
	
	Other2() {
//		Parent parent 선언가능 - > public 클래스여서
//		new Parent 값으로 객체를 생성 XX -> 생성자를 호출 불가하기 때문
		
//		Parent parent = new Parent(); 	// XX : not visible
//		parent.name;					// XX : 객체가 없는 데, 인스턴스 필드 사용불가 
//		parent.parentMethod)();			// XX : 객체가 없는 데, 인스턴스 메소드 사용불가 
	} // default constructor
//	
//	void childMethod() {
//		// 
//		Parent parent = new Parent();  
//	} // method
//	
//	
//	{
//		Parent parent = new Parent();
//	}
//	
} // end class