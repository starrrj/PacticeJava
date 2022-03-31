package inputstream_read;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import lombok.Cleanup;

public class ReadExample111 {

	public static void main(String[] args) {
		
		try {
			@Cleanup("close")
			InputStream is = new FileInputStream("C:/temp/TTT.txt");
			
			while(true) {	// 파일의 끝(EOF)이 언제 도달할지 모르기 때문에, 무한루프돌림
				int readByte = is.read();	// 입력스트림으로 들어오는 바이트를 손가락으로 하나씩 읽음
					
				// 무한루프의 "탈출조건"
				if(readByte == -1) {	// 파일의 끝 (EOF, End-Of-File)인 -1
					break;
				}
				System.out.print((char) readByte); // byte -> char 강제형변환(출력위해)
			}// while
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// main

} // end class
