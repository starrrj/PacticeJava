package variable_type;

public class DataTypeEx2 {

	public static void main(String[] args) {
		
		// byte 타입의 표현범위 : -128~ +127
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		
		int var6 = 128; // byte는 컴파일 에러 -> 보통 int로 하라
		// 순수한 수 리터럴은 형변환X, 지정한대로 집어넣음
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
	} // main
	
} // end class

