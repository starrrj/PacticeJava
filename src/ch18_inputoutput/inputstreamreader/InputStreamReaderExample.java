package ch18_inputoutput.inputstreamreader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		
		//1. 문자변환 보조스트림 : InputStream -> Reader 변환
		Reader reader = new InputStreamReader(is);	// 그전의 스트림을 보조스트림의 매개변수로
		
		int readCharNo;
		
		char[] cbuf = new char[100];	// 바가지
		
		while((readCharNo= reader.read(cbuf)) != -1) {		// EOF(-1)
			String data = new String(cbuf, 0, readCharNo);	// offset, length
			
			System.out.println(data);
		} // while

		reader.close();
	} // main

} // end class
