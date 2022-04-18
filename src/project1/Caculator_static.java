package project1;

public class Caculator_static {

	
		public static void main(String ...args) {
			double radius =  10.0; // 원의 반지름
			
			double result1 = radius * radius * Calculator_static_member.pi;
			
			int result2 = Calculator_static_member.plus(10, 5);
			int result3 = Calculator_static_member.minus(10, 5);
			
			System.out.println("result1 : " + result1);
			System.out.println("result2 : " + result2);
			System.out.println("result3 : " + result3);
			
			
		}
}
