package exceptionEx.runtime_exception;


public class NumberFormatatExceptionExample {
	
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		// parseInt("문자열") ----> 정수타입으로 바꿔주는 메소드
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println(data1 + "+" + data2 + "=" + result);
	}

}
