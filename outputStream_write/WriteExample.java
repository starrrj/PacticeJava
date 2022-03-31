package outputStream_write;


import java.io.FileOutputStream;
import java.io.OutputStream;

import lombok.Cleanup;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		// 자원객체
		@Cleanup OutputStream os = new FileOutputStream("C:/Temp/test.txt");

//		try (os;) { // 자원객체는 소괄호 안에 넣어준다.
			// 문자열 인코딩(문자열 => 바이트열)
			byte[] data = "ABC".getBytes(); // ***
			for (int i = 0; i < data.length; i++) {
				os.write(data[i]);
			} // for
			
			os.flush();
//		} // try-with-resources
//		os.close(); // 예외발생시 만나지 못함
	}// main
}// class
