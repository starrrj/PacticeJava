package outputStream_write;


import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		
		byte[] data = "ABC".getBytes(); // 기본문자셋으로 인코딩
		
		os.write(data); // 바가지채로 출력버퍼(8KB)에 고속출력(부어버림)
		
		os.flush();
		os.close();
	}// main
}// class
