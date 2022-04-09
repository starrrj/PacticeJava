package ch14_lamda.argument_method_references;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferences {

	public static void main(String[] args) {
		ToIntBiFunction<String, String> function; // 두 개의 매개변수를 받아 매핑후 int리턴
		
//		function = (a, b) -> { return a.compareToIgnoreCase(b); }; // 실행구에 리턴문 한개만 있을경우 생략
		function = (a, b) -> a.compareToIgnoreCase(b); 
		// A의 인스턴스 메소드를 호출해서 B를 매개값으로 사용.
		// A, B를 대소문자 상관없이 비교 <- Ignore
		// 사전순으로 A가 b보다 빠르면 음수, 같으면 0, 느리면 양수
		
		print(function.applyAsInt("Java8", "JAVA8"));
		
//		----
		
		function = String::compareToIgnoreCase; // a 변수의 타입이 String
		print(function.applyAsInt("Java8", "JAVA8"));

	}
	
	public static void print(int order) { // 값이 int 값으로 int로 받는다.
		if(order<0) { System.out.println("사전순으로 먼저 옵니다."); }
		else if(order ==0) {System.out.println("동일한 문자열입니다.");}
		else {System.out.println("사전순으로 나중에 옵니다.");}
	}
}
