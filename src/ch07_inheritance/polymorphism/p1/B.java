package ch07_inheritance.polymorphism.p1;

public class B {

	// protected = default + alpha (예제는, default 접근제한이 적용)
	// 같은 패키지 내에서는 상속하지않아도 가져다 쓸수있다.
	public void method() {
		A a = new A();
		
		a.field = "Java";
		a.method();
	} // method
	
} // end class
