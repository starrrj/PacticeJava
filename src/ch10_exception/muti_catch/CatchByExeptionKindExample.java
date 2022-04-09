package ch10_exception.muti_catch;

public class CatchByExeptionKindExample {

	public static void main(String[] args) {
		try {
			// ArrayIndexOutOfBoundsException 예외가 발생가능한 코드 #1
			String data1 = args[0];
			String data2 = args[1];
//			---
			// NumberFormatException 예외가 발생가능한 코드 #2
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1+"+"+data2+"="+ result);
			
		} catch (ArrayIndexOutOfBoundsException e) {				// 예외처리 #1
			System.out.println("실행 매개 값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java  ArrayindexOutBoundExeptionExample  num1  num2");
			
		} catch(NumberFormatException e) {							// 예외처리 #2
			System.out.println("숫자로 변환할 수 없습니다.");
			
		} finally {													// (optional) 항상 실행할 코드
			System.out.println("다시 실행하세요.");	
		} // try-catch-finally
	} // main

} // end class
