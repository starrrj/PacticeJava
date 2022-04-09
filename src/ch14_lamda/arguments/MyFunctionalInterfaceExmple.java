package ch14_lamda.arguments;

public class MyFunctionalInterfaceExmple {

	public static void main(String[] args) {
		MyFunctionalInterface fi;			// 인터페이스 fi 안으로 람다식(R valu)을 집어 넣는다
		
		fi = (x) ->{
			int result = x*5;
			System.out.println(result);
		};
		fi.method2(2);
		
		
		fi = x ->System.out.println(x*5);	// 매개변수 1개 () 생략, 실행문 1개 {} 생략
		fi.method2(2);
		
		
//		fi = () -> {System.out.println();	// () 는 fi 메소드의 () !!,이름은 가져오지않는다. 
//											// 그래서 한개인 경우만 가능하다. 메소드블럭을 오버라이딩(상속)
//			String str = "method call1";
//			
//			System.out.println(str);
//		};	// 람다식 : FI에 선언된 추상메소드를 Overriding하는 익명구현객체를 생성
//
//		fi.method();	//FI에 선언된 추상메소드 호출(다형성-2)
//		
//		------------------
//		
//		//1st. method : 직접 구현클래스 선언
//		fi = new MyFunctionalInterfaceImpl();   // 다형성-1
//		fi.method();							// 다형성-2
//		
//		
//		//2nd. method: 익명구현객체 코딩기법
//		fi = new MyFunctionalInterface(){		// 다형성 -1
//			
//			@Override
//			public void method() {
//				System.out.println("Annonymous::method() invoked.");
//			}
//		};
//		
//		fi.method();							// 다형성-2
//		
//		//3rd. method : 람다식으로 구현하자!
//		 fi = () -> {							// 다형성-1
//			 System.out.println("Anonymous by Lamda::method() invoked.");
//		 }; // 람다식을 이용한, 익명구현객체 생성
//		 
//		 fi.method();
//		 
//	-----------------------------------
//		//생략 조건1: 블록 내의 실행문장이 오직 1개이면, {} 중괄호 블럭 생략가능 
//		 fi = () -> System.out.println("Anonymous::method() invoked.");
//		 // 람다식을 이용한, 익명구현객체 생성
//		
//		// 생략조건2: 매개변수의 타입은 생략가능(컴파일러의 타입추론)
//		fi =(age) ->System.out.println("Anonymous::method2() invoked.");
////		fi.method2(23);
//		 
//		// 생략조건3: 매개변수가 하나뿐일 때에는, ()기호도 생략가능
//		fi = age ->System.out.println("Anonymous::method2() invoked.");
//		fi.method2(23);
		
		// 생략조건4: 생략조건 1을 만족하는 가정하에, return  문장인 겨우,
//				      괄호에 리턴문만 있는경우 중괄호 생략
//		fi = () -> 100 + 200 ;
//		fi.method3();
//		// Labda expression

//		fi = a-> (int)(1+2*3-4 / a);

//		fi = age -> {
//
//			System.out.println(this );
//			return 1000;
//		};
		
////		 --------------
//		 
//		TTT ttt = new TTT ();
//		System.out.println("1. ttt" + ttt);
//		ttt.intstnaceMethod(777);
//		

	}

}
