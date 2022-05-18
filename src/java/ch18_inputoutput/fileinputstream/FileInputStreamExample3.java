package ch18_inputoutput.fileinputstream;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

import lombok.Cleanup;

public class FileInputStreamExample3 {

	public static void main(String[] args) {
//		
//		String info = "한글테스트";
//
//		byte[] source = info.getBytes("UTF-8");
//		String remake = new String(source,"UTF-8");

		
		try {
	         
	         Charset cs = Charset.forName("utf-8");
	         
//	         System.out.println(File.separator);
//	         System.out.println(File.pathSeparator);
	      
	         @Cleanup
	         FileInputStream fis = 
	            new FileInputStream("C:/app/workspace/jse/project1/src/file/TTT.java");
	      
	         InputStreamReader is = new InputStreamReader(fis,cs);
	         
	         int data;      // 데이터를 바이트 기반으로 읽어 들인다.
	         
	         // 버퍼 생성
	         StringBuffer sb = new StringBuffer();
	      
	         
	         while ( (data = is.read() ) != -1 ) {   // 탈출조건식 : EOF(-1) 만날때까지, 반복해서 읽음
	            
//	            System.out.write(data);
	            sb.append((char)data);
	            
	         } // while
	         
	         String source = sb.toString();
	         System.out.println(source);
	         
	      } catch(Exception e) {
	         e.printStackTrace();
	      } // try-catch
		
	} // main

} // end class
