package ch07_inheritance.promation;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();		// 1. 자식객체 생성
		
		Parent parent = child;			// 2. 다형성-1
		
		parent.method1();				// 3. 부모타입에 선언된 메소드 호출
		

		// 다형성-2 가 나온다.
		parent.method2();				// 4. 부모타입에 선언된 메소드 호출
		
		//parent.method3(); (호출 불가능) // 부모에게 안겨있으면 자식메소드는 안보인다
		
		ChildExample.method(child);
	}

	static void method (Parent parent) {
		parent.method2();
	}
}
