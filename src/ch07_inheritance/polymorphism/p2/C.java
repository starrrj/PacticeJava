package ch07_inheritance.polymorphism.p2;

import ch07_inheritance.polymorphism.p1.A;

public class C {

	public void method() {
		A a;				// A 는 가능
//		a = new A();		// XX : A 클래스는 public으로 접근이 가능하나
							// 		생성자는 protect로 다른패키지에서는 접근이 불가능하다.
//		a.field = "java";	// 필드 사용 불가
//		a.method();			// 메소드 사용 불가
		//
	} // method

} // end class
