package ch07_inheritance.polymorphism.p2;

import ch07_inheritance.polymorphism.p1.A;


public class D extends A{ // D가 A를 extends 된다.
	
	public D() {
		// protected의 진짜 alpha의 의미임!!
		super();			// 생성자에 붙이기. 생략가능. 자바컴파일러가 자동으로 넣어줌
		
//		---
		
		this.field = "Java";
		this.method();
		
	} // default constructor , 생성자에서 사용가능

	void method2() {
		// A 클래스를 사용해 보세요 (사용관계)
//		A a = new A();			 // XX : protected 접근제한자에 걸림  (객체부터 생성이 안되니까)
								//       자식클래스의 생성자 블록내에서만 부모생성자 호출 가능하다.
								// 		필드와 메소드는 붙인 접근제한자 대로 
								// 		일반 메소드 블럭내에서는 A객체의 이 생성자 호출이 불가능하다.
								//      사용관계에서는 안돼!!!!
//		A a = new D();			// 이건뭐지... 왜지
		
		this.field = "java"; 	// OK 필드와 메소드는 자동으로 사용가능
		this.method();			// OK 객체의 필드와 메소드를 상속받은 걸 내걸로  쓰겠다.
		
//		---
		
		super.field = "java";	// 부모 객체의 필드와 메소드를 그대로 쓰겠다
		super.method();
		
	} // method2 , 메소드에서 사용가능
	
	@Override
	protected
	void method() {	// 인스턴스 메소드 
		System.out.println("D::method() invoked.");
	} // method

	public static void main(String[] args) {
		D d = new D();
		d.method2();
	} // main
	
} // end class
