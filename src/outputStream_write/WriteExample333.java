package outputStream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

import lombok.Cleanup;

public class WriteExample333 {

	public static void main(String[] args) /* throws Exception */ {

		try {
			OutputStream os = new FileOutputStream("C:/Temp/test.txt");

			try (os) {
				byte[] data = "ABC".getBytes();

				os.write(data, 1, 2); // "BC"를 한 번에 모두 출력 (offset, length)
				os.flush();
			} // try-with-resourced
		} catch (Exception e) {
			e.printStackTrace();
		} // try-catch
		
//		-----
		
		try {
			@Cleanup // 자원객체를 담고있는 참조변수 위에, 들어있는 블록 끝에서 닫아준다.
			OutputStream os = new FileOutputStream("C:/Temp/test.txt");
			
			byte[] data = "ABC".getBytes();

			os.write(data, 1, 2); // "BC"를 한 번에 모두 출력 (offset, length)
			os.flush();

		} catch (Exception e) {
			e.printStackTrace();
		} // try-catch
		
	}// main
}// class
