package ch18_inputoutput.inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;


public class ReadExample22 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/temp/TTT.txt");
		int readByteNo;	// read메소드가 읽은 바이트 수를 저장
		byte[] readBytes = new byte[3]; // 읽은 데이터 저장 배열
		String data = ""; // 읽은 문자열을 저장할 변수

//	while((readByteNo = is.read(readBytes)) != -1) {
//			System.out.println(readByteNo);
//		} // while

		while(true) { // 바가지로 한번에 3개 바이트를 읽는다.
			readByteNo = is.read(readBytes);
			if(readByteNo == -1) {	// EOF(-1)이면 탈출
				break;
			}
//				//String 클래스의 다양한 생성자를 꼭 훈련하세요
//				Charset ms949 = Charset.defaultCharset(); //  운영체제의 문자집합 생성(MS949), 정적메소드
//				Charset utf8 = Charset.forName("UTF-8"); //  운영체제의 문자집합 생성(UTF-8)
//				Charset utf8_2 = StandardCharsets.UTF_8; // static final 상수
//				
//				SortedMap<String, Charset> charsets = Charset.availableCharsets();
//				
//				Set<String> keys = charsets.keySet();
//				System.out.println(keys);
				
				data += new String(readBytes, 0,readByteNo); // offSet, length
		} // while
		System.out.println(data); // 문자열 출력
		is.close();
	} // main

} // end class
