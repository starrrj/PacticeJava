package ch18_inputoutput.printstream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("C:/Temp/file.txt");
			PrintStream ps = new PrintStream(fos);
			
			try (fos; ps;) {
					ps.println("[프린트 보조 스트림]");
					ps.print("마치 ");
					ps.println("프린트가 출력하는 것처럼");
					ps.println("데이터를 출력합니다.");
					
//					ps.printf("이름 : %s  나이: %d", "Star", 24);
					
					ps.flush();
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}			

		

		
	} // main

} // end class
