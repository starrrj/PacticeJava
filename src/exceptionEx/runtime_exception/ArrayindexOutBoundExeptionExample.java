package exceptionEx.runtime_exception;

import java.util.Arrays;

public class ArrayindexOutBoundExeptionExample {
	
	// main called by JVM "main" thread
	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
		
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0]:"+ data1);
			System.out.println("args[1]:"+ data2);
		} else {
			System.out.println("[실행 방법]");
			System.out.print("java  ArrayindexOutBoundExeptionExample  ");
			System.out.print("값1 값2");
		} // if-else

	}// main

}// end class
