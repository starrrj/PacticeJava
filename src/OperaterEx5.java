
public class OperaterEx5 {

	// 문자타입(char)을 이용해서, 연산수행 예제
	public static void main(String[] args) {
	
		// 1. 대전제1 - 정수연산식의 결과는 int타입
		// 2. 대전제2 - 리터럴(상수)은 형변환을 하지 않는다. 타입을 따지지 않는 다.
		// char = 2byte , int = 4byte
		
		char c1 = 'A' + 1; 		// 65+1
		char c2 = 'A'; 
		int c3 = c2 + 1; 		// 컴파일에러 Type mismatch: cannot convert from int to char
								// 변수는 int라서 타입을 따진다.
				
		System.out.println("c1:"+ c1); // 66
		System.out.println("c2:"+ c2);
		System.out.println("c3:"+ (char) c3);
		
	}//main
			
} // end class	

