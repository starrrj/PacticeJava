package inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class ReadExample3 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/temp/TTT.txt");
		byte[] readBytes = new byte[8]; // 읽은 데이터 저장 배열
		
		int readByteNo;	// read메소드가 읽은 바이트 수를 저장

		readByteNo = is.read(readBytes, 0, 3);
		
		System.out.println(Arrays.toString(readBytes));
		
//		for(int i=0; i<readBytes.length; i++) {
//			System.out.println(readBytes[i]);
//		} // for
		is.close();
	} // main
} // end class
