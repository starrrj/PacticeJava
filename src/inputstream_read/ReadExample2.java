package inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/temp/TTT.txt");
		int readByteNo;	// read메소드가 읽은 바이트 수를 저장
		byte[] readBytes = new byte[8]; // 읽은 데이터 저장 배열
		readByteNo = is.read(readBytes, 2, 3);
		for(int i=0; i<readBytes.length; i++) {
			System.out.println(readBytes[i]);
		}
		
	} // main

} // end class
