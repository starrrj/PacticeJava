package variable_type;

public class VariableEx2 {

	public static void main(String[] args) {
		// 10을 변수 value의 초기값으로 저장
		int value = 10;
			
		//변수 valu 값을 읽고 10을 더하는 산술 연산을 수행
		//연산의 결과값을 변수 result의 초기값으로 저장
		//value + 10; -> 대입연산자가 없어서 오류
		int result = value + 10;
			
			
		//변수 result 값을 읽고 콘솔에 출력
		System.out.println(result); // 위에서 result변수가 정의되어서 사용가능
		//println 메인과같은 메소드, 이것도 Lvalue,Rvalue 존재 대입연산자가 없어도 됨
			
			
	}// main
	
} // end class
