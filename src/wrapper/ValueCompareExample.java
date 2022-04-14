package wrapper;

public class ValueCompareExample {

	//자바언어명세에는, 아래의 규칙이 있음:
	//(1) 박싱된 값을 비교하기 위해, 동등비교연산자를 사용하는 경우
	//(2) 아래의 조건에서만 가능하다!!
	//		가. boolean 값(true/false)을 가지고 있는 wrapper 객체는 비교가능!
	//		나. char 값을 가지고 있는 wrapper 객체도 비교가능
	//			(문자의 범위한정)
	//		다. byte, short, int 값을 가진 wrapper 객체가 있을 경우,
	//			그 값의 범위가 -128 ~ +127까지의 범위값을 가지고 있는 경우만 비교가능
	public static void main(String[] args) {
		System.out.println("[-128~127 초과값일 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("결과: " + (obj1 == obj2));
		System.out.println("언박싱후 ==결과: " + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals() 결과: " + obj1.equals(obj2));
		
//		----
		
		System.out.println("[-128~127 범위값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("결과: " + (obj3 == obj4));
		System.out.println("언박싱후 ==결과: " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals() 결과: " + obj3.equals(obj4));
	}

}
