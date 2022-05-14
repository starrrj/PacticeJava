package ch10_exception.muti_catch;


public class CatchOrdeExample {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			
			int result = value1 + value2;
			
			System.out.println(data1+"+"+data2+"="+ result);
		} catch (ArrayIndexOutOfBoundsException|NumberFormatException e) {			
			System.out.println("실행 매개 값의 수가 부족하거나 숫자로 변환 할 수 없습니다.");
			
		} catch(Exception e) {						
			System.out.println("알수 없는 예외 발생");
			
		} finally {									// (optional) 항상 실행할 코드
			System.out.println("다시 실행하세요.");	
		} // try-catch-finally
	} // main

} // end class
