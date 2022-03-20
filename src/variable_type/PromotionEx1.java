package variable_type;

public class PromotionEx1 {

	 public static void main(String[] args) {
				
		byte byteValue = 10; // 자바 컴파일러가 자동 형변환 '작은타입-> 큰타입'
		int intValue = byteValue; // 리터럴이 아니라 Lv,Rv 타입이 동일해야 변환가능
				
		System.out.println(intValue);
				
		char charValue = '가'; //문자는 싱글쿼테이션 ','
		intValue = charValue;
				
		System.out.println("가의 유니코드=" + intValue); //문자열 리터럴. 문자열은 더블쿼테이션 ","

//		String(class/참조타입) -> int / 44032 -> 문자열("")로 변경
				
		intValue = 200;
		double doubleValue = intValue;  // 
				
		System.out.println(doubleValue);
				
	} //main

} // emd class
