package instanceOf;


// 다형성-1에 의해, 부모타입의 참조변수에 저장되어있는 자식객체를 다시 빼낼 때(강제형변환),
// 자식타입을 잘 못 알고 하면, ClassCastExeption 예외가 발생가능.
// 먼저, 자식타입을 검사해서, 맞을 때 안전하게 강제형변환을 통해 빼내고자 하면,
// instanceof 라는 연산자(Paattern Matching)가 필요하다!!
public class InstanceofExample {

	public static void method1(Parent parent) { // 매개변수의 다형성 -1
		System.out.println("InstanceofExample::method1(Parent) inveoked.");
		
		// instanceof 이항 연산자의 용법 :
		// 항 1(참조타입변수) instanceof  항 2(참조타입명)
		if(parent instanceof Child) {			// *** 검사하기
			Child child = (Child) parent;		// 안전하게 강제형변환 수행
			
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		} // if-else
	} // method1
	
	public static void method2(Parent parent) { // 매개변수의 다형성 -1
		System.out.println("InstanceofExample::method2(Parent) inveoked.");
		
		Child child = (Child) parent;			// 안전하지 않은 강제형변환 수행
		System.out.println("method2 - Child로 변환 성공");
	} // method2
	
	public static void main(String[] args) {
//		Parent parentA = new Child();			// 다형성-1
//		
//		InstanceofExample.method1(parentA);		// 매개변수의 다형성-1 OK
//		InstanceofExample.method2(parentA);		// 매개변수의 다형성-1 OK
//		
//		--
		
		Parent parentB = new Parent();			// 다형성-1
		
		InstanceofExample.method1(parentB);		// 매개변수의 다형성-1 XX
		InstanceofExample.method2(parentB);		// 매개변수의 다형성-1 XX 예외 발생
	} // main
	
} // end class
