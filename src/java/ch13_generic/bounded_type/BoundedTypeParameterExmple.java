package ch13_generic.bounded_type;

public class BoundedTypeParameterExmple {

	// 제한된 타입파라미터를 가진, 제네릭 메소드를 "사용할 때",
	// 구체타입으로 아무것이나 지정못하고, 오로지 Number 타입 또는 자식타입만
	// 지정가능하다!!!
	public static void main(String[] args) {
		//String str = Util.compare("a","b"); (x) number나, 자식클래스가 와야한다.
		
		int result1 = Util.<Integer>compare(10, 20);		// 1st.	invoke generic method
		System.out.println(result1);
		
//		int result2 = Util.<Double>compare(4.5, 3.6);		// 2nd. invoke generic method
//		System.out.println(result2);
		
		int result2 = Util.compare(4.5, 3);		// 2nd. invoke generic method
		System.out.println(result2);

	} //main
	
	// 자바표준라이브러리에서, 정렬등을 수행하기 위해서,
	// 두 숫자(정수이든, 실수이든)의 대소를 비교할 때, 아래와 같이]
	// 비교결과를 반환하도록 규칙화 되어있음:
	// number1, number2 가 있다고 할 때,
	// if(number1 == number2)이면, ---> return 0을 한다!
	// if(number1 < number2) 이면, ---> return <음수값>: 보통 -1 반환
	// if(number1 > number2) 이면, ---> return <양수값>: 보통 +1 반환

}
