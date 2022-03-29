package polymorphism.p1;

public class Child1 extends Parent {

	Child1() {
		super(); // OK		
		
		System.out.println("Child1:: default constructor invoked");
		System.out.println("\t + name : " + this.name);
		this.parentMethod();
		super.parentMethod();
	} // default constructor
	
	void childMethod() {
		System.out.println("Child1:: method invoked");
										// 같은 패키지에 있을 땐
		Parent parent = new Parent();	// 메소드 블록에서 사용관계 부모객체가 필요하여 호출했을 때 가능
		System.out.println(parent);
		System.out.println("\t + name : " + this.name);
		parent.parentMethod();
		super.parentMethod();
	} // method
	
	
	{
		Parent parent = new Parent();
		System.out.println(parent.name);
		parent.parentMethod();
		this.parentMethod();
		super.parentMethod();
	}
	
	
//	----------------------
	
	public static void main (String[] args) {
		Child1 child = new Child1();	// Child1 호출 -> 부모생성자호출(super)-> child 생성자 호출
		System.out.println("-------------------------------");
		child.childMethod();
		 
	
	
}
}