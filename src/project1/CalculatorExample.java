package project1;

public class CalculatorExample {

		public static void main(String[] args) {
			
			Calculator myCalc = new Calculator();		// 전자계산기 객체 생성
			myCalc.powerOn();							// 메소드 호출
			
			int result1 = myCalc.plus(5, 6);			// 메소드 호출
			System.out.println("result1: " + result1);
			
			byte x = 10;  // 필드, 객체모델링 
			byte y = 4;
			
			double result2 = myCalc.divide(x, y);		// 메소드 호출-
			System.out.println("result2: "+ result2);
			
			myCalc.powerOff();
			
		}// main
} // end class
