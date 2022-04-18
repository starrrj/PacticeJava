package project1;

public class Television {  // static block

	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	double price;
	
	static {
		info = company + "-" + model;
	} // static initializer
	
	
	void instancMethod1() {						 // 인스턴스 메소드
		System.out.println(this.price);  		// OK : 인스턴스 필드 사용
		System.out.println(Television.model);   // OK : 정적 필드 사용
		
		this.instancMethod2(); 					// OK :인스턴스 메소드 사용
		Television.staticMethod();				 // OK :정적메소드
		
		//다른 클래스의 메소드를 호출
		TT.tt= new TT();
		TT.staticMethod2();
		
	} // iinstancMethod1
	
	void instancMethod2() { 					// 인스턴스 메소드
		System.out.println(this.price);
					

	} // iinstancMethod2
	
	
	static void staticMethod() {				// 정적 메소드
		System.out.println(Television.model);
		
		Television obj = new Television();
		System.out.println(obj.price);
	}
	
}
// end class


class TT {
	public static TT tt;
	void instanceMethod2() {;;}
	static void staticMethod2(){;;}
	
}
