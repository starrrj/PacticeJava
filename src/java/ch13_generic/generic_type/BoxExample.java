package ch13_generic.generic_type;


public class BoxExample {

	
	public static void main(String[] args) {
		// 제네릭타입 클래스로부터 인스턴스 생성
//		Box<String> box1 = new Box<String>();	// @until 7까지는 양쪽 값을 맞춰야했다.
		
		// Rvalue의 <> : 타입추론 연산자
		Box<String> box1 = new Box<>();			// @since 8부터
		
		box1.set("hello");				// Setter 메소드 호출 -> 강한타입검사!
		String str = box1. get();		// Getter 메소드 호출
		
		System.out.println("box1: "+ box1);
		
//		---
		
		// 제네릭타입 클래스로부터 인스턴스 생성
		Box<Integer> box2 = new Box<Integer>();
		box2.set(6);					// Setter 메소드 호출
		int value = box2.get();			// Getter 메소드 호출

		System.out.println("box2: "+ box2);

	} // main

} // end class
