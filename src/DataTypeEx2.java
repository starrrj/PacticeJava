
public class DataTypeEx2 {

	public static void main(String[] args) {
		long var1 = 10; // int 정수리터럴 자동형변환
		long var2 = 20L; // 정석
			 
//		long var3 = 1000000000000; // 컴파일 에러,The literal 1000000000000 of type int is out of range
		long var4 = 1000000000000L; // 'L'을 꼭 붙이기
			 
			 
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
			 
	} // main
} // end class
