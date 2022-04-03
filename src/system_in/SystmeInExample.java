package system_in;

import java.io.InputStream;

public class SystmeInExample {

	public static void main(String[] args) throws Exception {
		System.out.println("== 메뉴 ==");
		System.out.println("1. 예금 조회");
		System.out.println("2. 예금 출금");
		System.out.println("3. 예금 입금");
		System.out.println("4. 종료 하기");
		
		System.out.println("메뉴를 선택하세요: ");
		
		InputStream is = System.in; // 키보드 입력.
		char inputChar = (char) is.read(); 	// 1 바이트를 읽는다.리턴은 4바이트 ,문자로 읽으려고 강제형변환( 키코드값이 들어있다)
											// blocking 사용자가 입력하기 전까지 프로그래밍 실행을 기다린다
		
		switch (inputChar) {
		case '1': 
			System.out.println("예금 조회를 선택하셨습니다.");
			break;
		case '2': 
			System.out.println("예금 출금을 선택하셨습니다.");
			break;
		case '3': 
			System.out.println("예금 입금을 선택하셨습니다.");
			break;
		case '4': 
			System.out.println("종료 하기를 선택하셨습니다.");
			break;
		}// switch
	} // main
} // end class
