package ch18_inputoutput.fileinputstream;

import java.io.FileInputStream;

import lombok.Cleanup;

public class FileInputStreamExample2 {

	public static void main(String[] args) {
//		
//		String info = "한글테스트";
//
//		byte[] source = info.getBytes("UTF-8");
//		String remake = new String(source,"UTF-8");

		
		try {
			@Cleanup
			FileInputStream fis = new FileInputStream("C:/app/workspace/jse/project1/src/file/TTT.java");
										// 슬랜트 두개 운영체제마다 경로상 디렉토리, 파일을 구별해주는 구별자 , 경로구분자 \\
										// \t,\n 과 다르게 표기하기 위해 두개!!!
										// Path Separator (경로구분자) - 운영체제마다 다름(윈도우: \,/ mac/Linux/Unix 모든 운영체제: /)
			int data;
			StringBuffer sb = new StringBuffer();
			
			while ((data = fis.read()) != -1) { 	// 탈출조건식 : EOF(-1)을 만날때까지, 반복해서 읽음
				sb.append(data); 				// System.out : PrintStream < InputStream(여기의, write 메소드 호출)
				System.out.write(data);
			} // while
			
			String source = sb.toString();
			System.out.println(source);
			
		} catch (Exception e) {

			e.printStackTrace();
		} // try - catch
		
	} // main

} // end class
