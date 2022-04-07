package ch18_inputoutput.outputStream_write;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

public class WriteExample3 {

	public static void main(String[] args) /*throws Exception */{
		OutputStream os = null;	// 지역변수는 반드시 초기화! , try블럭에서는 되었지만, 
								// finally-try블럭에서는 초기화되지 않았으므로 기본값넣어 초기화!
		try {
			os = new FileOutputStream("C:/Temp/test.txt");
			
			byte[] data = "ABC".getBytes(); 
			os.write(data,1,2);  // "BC"를 한 번에 모두 출력 (offset, length)
			os.flush();
			
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try { os.close(); } 
			catch (IOException e) { ;; } // try-catch 단점 : 기계적인 다중블럭
		}	// 자원해제
	}// main
}// class
