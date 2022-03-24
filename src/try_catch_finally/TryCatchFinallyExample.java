package try_catch_finally;


public class TryCatchFinallyExample {
	
	
	public static void main(String[] args) {
		
		try { // happy path
			Class clazz = Class.forName("java.lang.String2");	 // 1. 예외 발생X try 블럭 실행
			System.out.println("클래스를 찾았습니다."); 
			
		} catch(ClassNotFoundException e) {				// 2. 예외가 발생한다면 catch 블럭 실행
			System.out.println("클래스가 존재하지 않습니다."); 
		} finally {										// 3. 예외 유무 상관없이 finally 블럭 실행
			System.out.println("프로그램을 안전하게 종료합니다."); 
		}
		
	} // main
	
	
} // end class
