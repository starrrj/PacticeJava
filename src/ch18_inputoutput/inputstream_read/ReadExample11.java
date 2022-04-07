package ch18_inputoutput.inputstream_read;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample11 {

	public static void main(String[] args) /*throws Exception*/ {
		
		// 지역변수는 선언만으로 끝내지 말고, 적절한 초기값으로 초기화 정의하라!
		InputStream is = null;
		
		try {
			
		// 입력스트림 객체를 생성하는 순간 -> 실제 타켓과 연결이 됨
			is = new FileInputStream("C:/temp/TTT.txt");
		int readByte;
		
		while(true) {	// 파일의 끝(EOF)이 언제 도달할지 모르기 때문에, 무한루프돌림
			readByte = is.read();	// 입력스트림으로 들어오는 바이트를 손가락으로 하나씩 읽음
			
			// 무한루프의 "탈출조건"
			if(readByte == -1) {	// 파일의 끝 (EOF, End-Of-File)인 -1
				break;
			}
			System.out.print((char) readByte); // byte -> char 강제형변환(출력위해)
		}// while
		
//		is. close();	// 자원해제
		
	} catch(IOException e) {
		e.printStackTrace();  
	} finally { // try block에서 예외가 발생하든/안하든 반드시 실행되는 블록
		// 자원해제코드 작성
		try {
			is. close();
		} catch (IOException e) {
			e.printStackTrace();
		}	// 자원해제
		
	} // try-catch-finally
		
		}// main

} // end class
