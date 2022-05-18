package ch18_inputoutput.file_writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import lombok.Cleanup;

public class FileWriterExample {

	public static void main(String[] args) {

		try {
			File file = new File("C:/Temp/file.txt");
			
			@Cleanup
			FileWriter fw = new FileWriter(file, true);
			
			fw.write("FileWriter는 한글로된 " + "\r\n");
			fw.write("문자열을 바로 출력할 수 있다." + "\r\n");
			
			fw.flush();
			
			System.out.println("파일에 저장되었습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		} // try-catch-resource

	} // main

} // end class
