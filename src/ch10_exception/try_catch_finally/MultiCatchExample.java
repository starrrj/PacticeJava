package ch10_exception.try_catch_finally;


public class MultiCatchExample {
	
	
	public static void main(String[] args) {
		
		try { // happy pass
			Class clazz = Class.forName("java.lang.String2"); 
			
		} catch(ClassNotFoundException e) { // 얼토당토어쩌고 pass
			System.out.println("클래스가 존재하지 않습니다."); 
		} // try-catch
		
	} // main
	
	
} // end class
