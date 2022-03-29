package polymorphism.p1;

public class A {
	
	protected 
	String field;		// 인스턴스 필드
	
	protected A() {					// 실무에선 주로 생성자에만 protected 붙임
		;;
	} // default constructor
	
	protected
	void method() {	// 인스턴스 메소드 
		System.out.println("A::method() invoked.");
	} // method
} // emd class
