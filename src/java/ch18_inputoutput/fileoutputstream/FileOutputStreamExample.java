package ch18_inputoutput.fileoutputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) throws Exception {
		String originalFileName = "C:/Users/Twinkle/Pictures/KakaoTalk_20220301_173806250.jpg";
		String targetFileName = "C:/Temp/peakpx.jpg";
		
		FileInputStream fis = new FileInputStream(originalFileName);	// For source file.
		FileOutputStream fos = new FileOutputStream(targetFileName);	// For target file.
		
		int readByteNo;
		
		byte[] readBytes = new byte[100];								// 바가지 생성
		
		while ( ( readByteNo = fis.read(readBytes) ) != -1 ) {			// 바가지를 이용해서 한꺼번에 최대 100바이트
			fos.write(readBytes, 0, readByteNo);						// 바가지에 읽은 바이트들을 한번에, 출력버퍼에
		} // while
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었습니다.");
	} // main
} // end class
