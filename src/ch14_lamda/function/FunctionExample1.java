package ch14_lamda.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	// 여러 요소를 목록으로 보관하는 타입: List
	private static List<Student> list = Arrays.asList( // list 가 컬렉션
			new Student("홍길동", 90, 96),
			new Student("김자바", 95, 93)
	);
	
	// Function 인터페이스의 목적 : 매핑(A->B)
	public static void printString(Function<Student, String> function) { // 문자열을 print한다.
		for(Student student : list) {	// 학생객체 1,2 를 루프 -> 총 2번(홍길동, 김자바)
			// R apply(T t);
			System.out.println(function.apply(student) + " ");
		} // enhanced for
		System.out.println();	// 개행
	} // printString
	
	
	public static void printInt(ToIntFunction<Student> function) { //매개값 Student를 받아 int로 매핑
		for(Student student : list) {	// int 값을 루프
			System.out.println(function.applyAsInt(student) + " ");
		} //enhanced for
		System.out.println();	// 개행
	} //printString
	
	public static void main(String[] args) {
		System.out.println("[학생 이름]");
		// R apply(T t);
		FunctionExample1.
			printString( t -> t.getName()); // = (t)->{return t.getName();} 괄호 생략
											// 람다식으로 익명구현객체 생성하여 전달(전달인자)
//		---
		System.out.println("[영어 점수]");
		
		FunctionExample1.printInt(t -> t.getEnglishScore()); // return이 생략된 문장
		
//		---
		System.out.println("[수학 점수]");
		FunctionExample1.
			printInt(t -> t.getMathScore());
	
////		---
		//int applyAsInt(T value);
		ToIntFunction<Student> mapping = s -> s.getMathScore();
		
		for(Student s : list) {
//			System.out.println(s.getMathScore());			//(1) : NOT recommended.
			System.out.println(mapping.applyAsInt(s)); 		//(2) : From now on
		}
		
		

	}
	
	
}
