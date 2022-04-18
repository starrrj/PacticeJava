package project1;

public class Sample {
	
	String name;								// 인스턴스 필드
	int age;									// 인스턴스 필드

	static double weight;						// 정적 필드
	static double height;						// 정적 필드
	
	void instanceMethod2() {;;;}
	void instanceMethod() {					// 인스턴스 메소드
		System.out.println("staticMethod() invoked");
		
		// 1. 인스턴스 필드 사용
		System.out.println("1.name : " + name);
		System.out.println("2.age : " + age);
		
		// 결론1: 인스턴스 메소드 블록내에서, 인스턴스 멤버(필드+메소드)사용은 아무런 문제가 없다!!
		// 2. 인스턴스 메소드 사용
		instanceMethod2();
	
		// 결론2: 인스턴스 메소드 블록내에서, 정적 멤버(필드)사용은 아무런 문제가 없다!!
		//3. 정적 필드 사용
		System.out.println("3.weight : " + weight);
		
		// 결론3: 인스턴스 메소드 블록내에서, 정적 멤버(메소드)사용은 아무런 문제가 없다!!
		//4. 정적 메소드 사용
		staticMethod();
		
		// 대전제1 : 인스턴스 메소드 블록내에서, 인스턴스 멤버+정적멤버(필드+메소드) 모두 사용가능하다!!
		// 대전제2 : 정적 메소드 블록 내에서는, 오로지 정적멤버만 사용가능하다!!
		
	}
	static void staticMethod() {		// 정적 메소드
		System.out.println("staticMethod() invoked");
	}
	
	public static void main(String[] args) {	// 정적 메소드
		
		Sample obj = new Sample();
			
			// 인스턴스 필드
			System.out.println("1.name : " + obj.name);
			System.out.println("2.age : " + obj.age);
			
			//대전제3 : 정적멤버(필드,메소드)는 정적멤버답게 사용하라!!
			//			인스턴스(객체)의 소속이 아니라, Clazz객체의 멤버이기 때문에.
			//			인스턴스의 참조(주소)를 가지는 참조변수로 사용해서는 바람직하지 않다!!
			//			정적멤버의 사용방법: "클래스명.정적멤버"
			System.out.println("4.weight : " + Sample.weight);
			System.out.println("5.height : " + Sample.height);
			
			System.out.println("6.weight : " + obj.weight);		//정적 필드 Sample.weight는 정적 방식으로 액세스해야 합니다.
			System.out.println("7.height : " + obj.height);
			
			Sample.staticMethod(); 			// 정적메소드 호출도 대전제3과 동일
			
			//인스턴스 멤버는 인스턴스 멤버답게, 인스턴스의 주소를 가지고 있는 "참조변수.인스턴스(정적)멤버" 답게 사용
//			Sample.name; 					// XX :  대전제 위배, 비정적 필드 Sample.name에 대한 정적 참조를 만들 수 없습니다.
//			Sample.instanceMethod();		// XX : Sample 유형에서 비정적 메서드 instanceMethod()에 대한 정적 참조를 만들 수 없습니다.
		
	} // main

} // end class
//
/// 결론1: 정적메소드 블록내에서, 정적 멤버(필드+메소드)사용은 아무런 문제가 없다!!
//System.out.println("1.weight: " + weight);	// 정적필드 사용가능
//staticMethod();
//
//
//// 결론2: 정적메소드 블록내에서, 인스턴스 멤버(필드+메소드)사용 불가!!!
////System.out.println("2.name : " + name);		// 인스턴스 필드 사용X
////instanceMethod();							// 인스턴스 메소드 사용X
