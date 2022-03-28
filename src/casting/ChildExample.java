package casting;

public class ChildExample {

	
	public static void main(String[] args) {
		Parent parent = new Child();		// 다형성-1
		
		// 다형성 -1에 의해, 부모타입에 선언된 필드와 메소드만 사용가능.
		// 물론, 부모의 메소드 중에, 자식객체에서 재정의된 메소드가 있다면,
		// 다형성-2에 의해, 자식객체의 재정의된 메소드가 호출됨.
		parent.field1 = "data1";		// 부모필드 사용
		parent.method1();				// 부모메소드 사용
		parent.method2();				// 부모메소드 사용
		
//		---
		
		/*parent.field = "data2" 	// 불가능
		 * parent.method3(); 		// 불가능
		 */
		
		 
		 // 다형성-1에 의해, 부모타입의 참조변수에 저장된 자식객체를 다시 끄집어 냄!
		 // 강제형변환 필요!! <- 참조변수에는 순수한 값이 아닌 주소타입이라 유실이 없다.
		 Child child = (Child) parent;	// 이때에는, 강제형변환의 부작용 데이터 유실이 없다!
		 child.field2 = "yyy";			// 가능
		 child.method3(); 				// 가능
	} // main

} // end class
