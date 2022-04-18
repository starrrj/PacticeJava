package project1;

public class Calculator_static_member {
//		static double p1= 3.14159;
		static double p1= Math.PI;
		
		static double pi; // 정적필드 초기화 시에 사용
		
		static {
			System.out.println("static initializer invoked.");
//			pi = 3.14159;
			pi = Math.PI;
		} // static initializer
		
		
		static int plus(int x, int y) {
			return x + y ;
		} // plus
		
		static {
			System.out.println("static initializer2 invoked.");
		} // static initializer2
		
		
		static int minus(int x, int y) {
			return x - y ;
		} // minus
		
		static {
			System.out.println("static initializer3 invoked.");
		} // static initializer3
		
		
		
} // class
