package try_catch_finally;


public class TryCatchFinallyRuntimeExample {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;		
		
		try {
			data1 = args[0];	// 값은 argument에서 입력해주기
			data2 = args[1];
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java TryCatchFinallyRuntimeExample  num1  num2");
		
			return;		// 이 문장을 만나는 즉시, 메소드의 실행을 종료시키고,
						// 만일 뒤에 값(리터럴, 변수, 표현식 등)이 오면, 호출자에게 반환한다.
		} // try-catch
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data1 + "=" + result);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행해주세요.");
		} // try-catch-finally
		
	} // main

} // end class
