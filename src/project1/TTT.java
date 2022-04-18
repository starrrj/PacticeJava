package project1;

public class TTT {
	String name = "Yoseph";
	static int age = 23;
		
;	void method1() {
		System.out.println("method1() invoked.");
		System.out.println("name: " + this.name);   // <--- static 없을 때
		System.out.println("age: " + TTT.age);		// <----static 있을 때 
		
		String name = "trinity";
		method2();	//	다른 메소드 호출
	} // method1
	
	void method2() {
		System.out.println("method1() invoked.");
		
		method3();	//	다른 메소드 호출
	} //method2
	
	void method3() {
		System.out.println("method1() invoked.");
	} //method3
	
} // end class
