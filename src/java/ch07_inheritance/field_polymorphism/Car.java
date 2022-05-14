package ch07_inheritance.field_polymorphism;


//완성자 클래스에, 집합(부품)관계로 타이어 필드를 선언 할 때
//부모타입인 인터페이스 타입으로 선언하고, 이 필드를 초기화 할 때는
//다형성 -1에 의거해서, 구현객체(또는 자식객체)를 넣어준다!!
public class Car {
	//Lvalue: 부모타입, Rvalue: 자식타입
	// 아래는 모두 다형성-1로 필드 초기화(즉, 부품장착!)
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backtLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() {
		// 다형성-2 발현 : 부모타입의 필드의 메소드 호출(roll) ->
		// 다형성-1 의해 대입된 자식(구현)객체의 재정의된 메소드가 호출
 		frontLeftTire.roll();
		frontRightTire.roll();
		backtLeftTire.roll();
		backRightTire.roll();
	} // run
	
		
}
