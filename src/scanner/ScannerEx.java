package scanner;

import java.util.Scanner;

import lombok.Cleanup;

public class ScannerEx {

	public static void main(String[] args) {		// Scanner 객체 생성
		@Cleanup("close")
		Scanner scanner = new Scanner(System.in);	// 입력유도 프롬프트 메시지 출력
		
		System.out.println("문자열 입력>");			// 문자열 입력받음
		String inputString = scanner.nextLine();
		System.out.println(inputString);
		System.out.println();
		
		System.out.println("정수 입력>");			// 정수 입력받음
		String inputInt = scanner.nextLine();
		System.out.println(inputInt);
		System.out.println();
		
		System.out.println("실수 입력>");			// 실수 입력받음
		String inputDouble = scanner.nextLine();
		System.out.println(inputDouble);
		System.out.println();
		
//		 scanner.close();
	}

}
