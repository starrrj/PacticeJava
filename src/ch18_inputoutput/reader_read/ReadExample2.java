package ch18_inputoutput.reader_read;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test.txt");
		
		int readCharNo;
		char[] cbuf = new char[2];
		String data = "";
		while(true) {
			readCharNo=reader.read(cbuf);
			
			if(readCharNo == -1) break;
			
			data += new String(cbuf, 0, readCharNo);
		} // while
		System.out.print(data);
		reader.close();
	} // main

} // end close
