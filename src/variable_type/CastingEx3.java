package variable_type;

public class CastingEx3 {
	
	public static void main(String[] args) {
		
		double number1 = 10.23;   // 8byte 실수타입
		byte number2 = 20;        // 1byte -> double 자동변환 ok
		
//		int result = number1 + number2; 
//		컴파일오류 :Type mismatch: cannot convert from double to int
//		실수타입은 int로 자동변환 X 
	
		double result = number1 + number2; 

		System.out.println(result);
		
//		------
		
		byte number3 = 10;
		byte number4 = 20;
		
		int result2 = number3 + number4;
		
		double result3 = number3 + number4; // double로 promotion ->30.0 소수점발생
											// Rv 연산이 끝난 뒤 Lv에 넣을 때 타입을 고려한다.
		System.out.println(result2); // 30
		System.out.println(result3); //30.0
		
//		------
		
		double number5 = 10.5;
		double number6 = 3.14159;
		
		int result4 = (int) (number5 + number6); // 30.0
		System.out.println(result3); // 소수점없앨 때 int로 강제 형변환
		
	} // main
	
}// end class

