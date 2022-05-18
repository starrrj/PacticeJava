package ch18_inputoutput.inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample1 {

	public static void main(String[] args) throws Exception { // 예외발생가능성이 있음
	
		// 입력스트림 객체를 생성하는 순간 -> 실제 타켓과 연결이 됨
		InputStream is = new FileInputStream("C:/temp/TTT.txt");
		int readByte; // 읽을 바이트를 저장할 변수 설정
		
		while(true) {	// 파일의 끝(EOF)이 언제 도달할지 모르기 때문에, 무한루프돌림
			readByte = is.read();	// 바이트를 손가락으로 하나씩 읽어 변수에 저장
			
			// 무한루프의 "탈출조건"
			if(readByte == -1) {	// 파일의 끝 (EOF, End-Of-File)인 -1
				break;
			}
			System.out.print((char) readByte); // byte -> char 강제형변환(출력위해)
		}// while
		
		is. close();	// 자원해제

		}// main
} // end class
