
public class OperaterEx6 {

	public static void main(String[] args) {
		
		double number1 = 100;
		int number2 = 3;
		double result = number1 /number2 ;
		
		System.out.println(result); // 33 , 33.333336.. 근사치
		
//------	
		
		int number11 = 100;
		int number22 = 3;	
		double result2 = (double)number11 /number22 ;
		
		System.out.println(result2); // 33.333336.. 근사치
		
//------
	
		int number111 = 100;
		int number222 = 3;
		double result3 = number111 /(double)number222 ;
		
		System.out.println(result3); // 33 , 33.333.. 무리수
		
//	강제 형변화는 리소스가 큰 작업 -> 최대한 조금 써야함 -> 변수 타입을 변경하는 게 효율
		
		int number1111 = 100;		
		int number2222 = 3;
		int result4 = number1111 /number2222 ;
		
		System.out.println(result); // 33 무리수
		
	} // main
	
} // end class
