package lamdaEx.no_arguments_no_return;

//import lombok.NoArgsConstructor;
//
//
//@NoArgsConstructor
//public class TTT {
//	
//	String name = "Java";
//	int age = 23;
//	
//	private void instanceMethod2() {;;}
//
//	public void intstnaceMethod(int param) {
//		MyFunctionalInterface fi = a -> {
//			int temp = 333;		// 컴파일러내에서 final로 바꿈
//			int temp2 = 100;
//			
//			// 람다식 내부에서 this는, 람다식이 만든 익명구현객체의 주소를
//			// 가지고 있지 않고, 오히려, 람다식을 포함하고 있는 바깥타입의
//			// 객체의 주소를 가지고 있다
//			System.out.println("2. this: " + this);
//			System.out.println("3. this: " + this.name);
//			System.out.println("4. this: " + this.age);
//			
//			// 생명주기가 다른, 지역변수를 익명객체가 사용한 경우,
//			// 머저 파괴되는 지역변수의 값을, 익명객체가 결정할 수 없는
//			// 상태에 빠지게 되는데, 이 상태를 "Closure(클로져)"라고 한다!!
//			System.out.println("5. temp: " + temp);
//			System.out.println("6. param: " + param);
//			
//			this.instanceMethod2();
//			
//		  return 777;
//		  
//		};
//		
//	
//	fi.method4(23);
//	
//	
//	}
//}
