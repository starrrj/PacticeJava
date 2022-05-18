package ch18_inputoutput.bufferedinputstream;

import java.io.FileInputStream;

public class BufferedInputStreamExample {
	
	public static void main(String[] args) throws Exception {
		
		long start = 0;
		long end = 0;
		
		// 1. 성능향상 보조스트림을 사용하지않고, 직접 바이트기반의 입력스트림으로 파일을
		// 		읽어내었을 때의 실행 소요 시간 측정
		FileInputStream fis1 = new FileInputStream(
				"C:/app/TTT.zip");
		
		start = System.currentTimeMillis();
		
//			while (fis1.read() != -1) {;;}
			while (fis1.read() != -1);
		end = System.currentTimeMillis();
		
		System.out.println("사용하지 않았을 때: " + (end - start) + "ms");
		fis1.close();
		
//		---

//		//2. 성능향상 보조스트림을 연결해서, 동일 파일을 읽어내었을 때의 소요시간 측정
//		FileInputStream fis2 = new FileInputStream(
//				"C:/Users/Twinkle/Downloads/thisisjava-sourcefile.zip");
//		
//		// 성능향상 보조스트림 연결
//		BufferedInputStream bis = new BufferedInputStream(fis2);
//		
//		start = System.currentTimeMillis();
//		
//			while (bis.read() != -1) {}
//		end = System.currentTimeMillis();
//		
//		System.out.println("사용했을 때: " + (end - start) + "ms");
//		bis.close();
//		fis2.close();
	}
}