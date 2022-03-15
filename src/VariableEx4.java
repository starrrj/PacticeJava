
public class VariableEx4 {

	public static void main(String[] args) {
			
		int age = 40;           	//main블록 안의 사용자정의블록 age변수가 중복(충돌), 
	                           		//사용자정의블록 오류발생	
		{
			int age1 = 23; 			// 정의됨
			System.out.println(age1);
		} // 사용자 정의 블록 (User-defined block) #1 	
		
		{
			int age1 = 23; 			// 정의됨
	    System.out.println(age1);	
		} // 사용자 정의 블록 (User-defined block) #2
		
			
		System.out.println(age); // 범위를 벗어나면 사용X -> 40

	} // main

} // class
