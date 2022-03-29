package polymorphism.p2;

import polymorphism.p1.Parent;

// protected = default + alpha 공식에서,
// 이미 (1) default 접근제한은 통과 못하고(당연히, 패키지가 다르니까)
// (2) alpha 예외조건으로 접근이 가능한가!!??
// 알파는 사용관계 XX , 자식클래스의 생성자가 호출될 때 부모 객체가 먼저 생성되어 초기화가 되어야한다.
public class Child2 extends Parent {
	
	
	Child2() {
//		Parent parent = new Parent();		// XX : not visible, 객체생성 X
		
		// protected 생성자의 의미:
		// 이 클래스에서는, 자식객체의 생성자가 호출될 때,
		// 부모객체의 초기화가 먼저 수행되어야 하는 데, 이때,
		// 부모클래스의 생성자가 protected일 때, 과연 부모생성자 호출이 가능한가!?
		// 결과 : protected = default(x) + alpha(OK)
		
		super(); 	// OK. alpha 조건에서는 super 사용
		
		this.parentMethod();				// OK.
		super.parentMethod();
		
	} // default constructor
	
	void child3Method() {
//		Parent parent = new Parent();		// XX : not visible, 객체생성 X
		
		this.parentMethod();				// OK.
		super.parentMethod();
		
	} // child3Method

}
