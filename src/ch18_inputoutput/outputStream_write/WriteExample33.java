package ch18_inputoutput.outputStream_write;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample33 {

	public static void main(String[] args) /*throws Exception */{
	
		try (OutputStream os = new FileOutputStream("C:/Temp/test.txt");){
			byte[] data = "ABC".getBytes(); 
			
			os.write(data,1,2);  // "BC"를 한 번에 모두 출력 (offset, length)
			os.flush();
			os.close(); 
			
		} catch (Exception e) {
			e.printStackTrace();

		}	// 자원해제
	}// main
}// class
