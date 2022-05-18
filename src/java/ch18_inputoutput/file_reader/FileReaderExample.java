package ch18_inputoutput.file_reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {
		FileReader fr;
		try {
			fr = new FileReader("C:/app/workspace/jse/project1/src/file/TTT.java");
			
			int readCharNo;
			
			char[] cbuf = new char[100]; 	// 바가지가 byte[] 아니라, char[]로 바뀐다!
			
			while( (readCharNo=fr.read(cbuf)) != -1 ) {
				String data = new String(cbuf, 0, readCharNo);
				
				System.out.println(data);
			} // while

		} catch (IOException e) {	
			e.printStackTrace();
		}

	} // main

} // end class
