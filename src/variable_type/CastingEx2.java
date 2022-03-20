package variable_type;

public class CastingEx2 {
	
	public static void main(String[] args) {
		
		byte byteValue1 = 10; // 1010
		byte byteValue2 = 20; // 0001 0100
		
//		byte byteValue3 = (byte)(byteValue + byteValue2); // 컴파일 에러
		int intValue = byteValue1 + byteValue2; 
		
		System.out.println(intValue);  // 30 <= 정수연산결과물 int !!
		
		/*
		 * 정수 연산(+,-,*,/)의 결과물은 크던작던 int로 가정한다. 
		 * 단, 정수연산결과물이 int타입보다 더 큰숫자는 long으로 가정
		 *  byteValue cannot be resolved to a variable int -> byte 불가능
		 */
		
	} // main
	
} // end class

