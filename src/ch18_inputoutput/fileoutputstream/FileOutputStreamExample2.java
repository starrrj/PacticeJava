package ch18_inputoutput.fileoutputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import lombok.Cleanup;

public class FileOutputStreamExample2 {
	
	static final String source = "C:/Users/Twinkle/Pictures/KakaoTalk_20220301_173806250.jpg";
	static final String target = "C:/Temp/peakpx.jpg";

	public static void main(String[] args) {
		
		
		try {
			@Cleanup
			FileInputStream fis = new FileInputStream(source);
			@Cleanup
			FileOutputStream fos = new FileOutputStream(target);	// For target file.
			
			int readByteNo;
			
			byte[] readBytes = new byte[100];								// 바가지 생성
			
			while ( ( readByteNo = fis.read(readBytes) ) != -1 ) {			// 바가지를 이용해서 한꺼번에 최대 100바이트
				fos.write(readBytes, 0, readByteNo);						// 바가지에 읽은 바이트들을 한번에, 출력버퍼에
			} // while
			
			fos.flush();
			
			System.out.println("복사가 잘 되었습니다.");
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}	// For source file.
		
		
	} // main
} // end class
