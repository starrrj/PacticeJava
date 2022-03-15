
public class VariableEx1 {
	public static void main(String[] args) {
		
		int age = 1+2+3+4; // age이름의 변수를 "정의"한다!
		String name = "Star";
			
		age = 23;
		name = "트윙클1";
		name = "트윙클2";
		name = "트윙클3";
		name = "트윙클4";
		name = "트윙클1";// 마지막 선언된 변수만 존재, 초기값으로 돌려도 노상관, 변수의 사용

		// 1: 남성, 2: 여성
		final int gender = 1; //final 상수 마지막 최종적인 랩을씌웠다.
		//gender = 2; 상수를 변경하려하면 컴파일오류
		
		// 문자열 = 여러개의 문자들을 엮어놓은 것
		System.out.println(name);
			
	} // main
} // end class
