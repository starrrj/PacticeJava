package ch07_inheritance.polymorphism.p1;

public class Parent {
	
	protected
	String name = "java";
	
	//protected = default + alpha( 다른패키지의 자식 클래스에서도 접근을 허용)
	protected 
	Parent() {
		System.out.println( "Parent:: default constructor invoked" );
	} // default constructor
	
	protected
	void parentMethod() {
		System.out.println( "Parent:: parentMethod invoked" );
	}
	

} // main
