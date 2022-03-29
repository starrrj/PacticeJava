package lamdaEx.lacal_variable;

public class UsingLocalVariable {
	void method(int arg) {
		int localVar = 40;		// 필드값 final 특성
		
//		arg = 31;				
//		localVar = 40;			
		//값 변경시 에러 발생
		// Local variable arg defined in an enclosing scope must be final or effectively final
		
		MyFunctionalInterface fi = () -> {
			System.out.println("arg: " + arg);
			System.out.println("localVar: " + localVar);
		};
		fi.method();
	}	
}
