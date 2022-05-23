package ch14_lamda.return_;


@FunctionalInterface
public interface MyFunctionalInterface {
	
	public abstract int method3(int x, int y);	//case #4 매개변수O 리턴타입O

//		public abstract void method(); 		//case #1 매개변수X 리턴타입X
//		public abstract void method2(int x); 	//case #2 매개변수O 리턴타입X		
//		public abstract int method3(); 			//case #3 매개변수X 리턴타입O
//		public abstract int method4(int age);	//case #4 매개변수O 리턴타입O
		
}	// end interface
