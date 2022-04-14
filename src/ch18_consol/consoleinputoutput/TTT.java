package ch18_consol.consoleinputoutput;

import java.io.IOException;

public class TTT {

	public static void main(String[] args) throws IOException {
//		System.in;	// 정적필드 InputStream : 바이트기반 , 표준입력
//		System.out	// PrintStream : 바이트기반 , 표준출력
//		System.err	// PrintStream : 바이트기반 , 표준출력 -> 정상적인 출력, 에러 방식 같음
		
		System.out.println("표준출력");
		System.err.println("표준에러");
		
		int keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
	}

}
