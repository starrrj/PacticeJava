package ch18_inputoutput.system_in_out;

import java.io.OutputStream;

public class SystemOutExample {

	public static void main(String[] args) throws Exception {
		OutputStream os = System.out;		// 다형성-1 :PrintStream > OutputStream
		
		for(byte b=48; b<58; b++) { // 0~9까지 나열
//			b += 2;		// 짝수출력
			os.write (b);
		} // for
						// 커서를 맨앞으로 (13) CR:Carriage Return <- 그다음에 아무내용없어서 사용X
		os.write(10);	// 줄바꿈 (10) =  LF : Line Feed 
		os.flush();
		
//		os.close();		// '운영체제가 준 표준' 입력,에러,출력은 프로그램 내에서 닫으면 안된다.
						// 닫는 순간 console이 모두 닫힘. 
		
//		---
//		
		for (byte b=97; b<123; b++) {
			os.write(b);
		} // for
		
		os.write(10);
		
//		----
		
		String hangul = "가나다라마바사아차카타파하";
		byte[] hangulBytes = hangul.getBytes("utf8");	// 문자열을 배열로 인코딩, 매개변수가 없으면 무슨기준? 운영체제의 기본문자체제
														// 이클립스 기본문자체계가 ms949인 경우 출력오류
		
		os.write(hangulBytes); // 임시메모리공간 buffer 가 다차면 오토플러싱 된다. 잔류하면 직접 플러쉬
		
		os. flush();
//		}
	} // main

}	// end class
