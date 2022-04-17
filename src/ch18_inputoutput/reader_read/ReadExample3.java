package ch18_inputoutput.reader_read;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

import lombok.Cleanup;

public class ReadExample3 {

	public static void main(String[] args) {

//		try {
//			Charset utf8 = Charset.forName("utf8");
//
//			@Cleanup // 자원객체를 담고있는 참조변수 위에, 들어있는 블록 끝에서 닫아준다.
//			Reader reader = new FileReader("C:/Temp/test.txt", utf8);
//			char[] cbuf = new char[4];
//			int readCharNO = reader.read(cbuf, 0, cbuf.length);
//			System.out.println(Arrays.toString(cbuf)); // 배열 찍기
//			
////			for (int i = 0; i < cbuf.length; i++) {
////				System.out.println(cbuf[i]);
////			} // for
//	
//		} catch (IOException e) {
//			e.printStackTrace();
//		} // try-catch

//		-----
		Charset utf8 = Charset.forName("utf8");
		
		try {

			@Cleanup // 자원객체를 담고있는 참조변수 위에, 들어있는 블록 끝에서 닫아준다.
			Reader reader = new FileReader("C:/Temp/test.txt", utf8);

			try (reader;){
				char[] cbuf = new char[4];
				int readCharNO = reader.read(cbuf, 0, cbuf.length);
				System.out.println(Arrays.toString(cbuf));
				
//				for (int i = 0; i < cbuf.length; i++) {
//					System.out.println(cbuf[i]);
//				} // for
			} // try-with-resources
				
		} catch (IOException e) {
			e.printStackTrace();
		} // try-catch

	} // main
} // end class
