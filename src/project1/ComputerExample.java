package project1;

public class ComputerExample {
	
	public static void main(String... args) {
		System.out.println("args: "+ args);
		
		Computer myCom = new Computer();
		
		int[] values1 = {1,2,3};				// 메소드 호출 : 매개변수는 배열
		
		int result1 = myCom.sum1(values1);
		
		System.out.println("result: " + result1);
		
		
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5}); // 배열을 만들때 값의 목록있다면 {} 로가능하지만, 배열변수선언과 생성초기화가 나누어떨어져있다면  new 사용
		System.out.println("result2: " + result2);
		
		myCom.sum2();						// 호출 메소드가 리턴해주는 값을 사용할 곳이 없어서, Lvalue 구성 XX
		
		int result3 = myCom.sum2(1,2,3);
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println("result4: " + result4);
		
	} // main
	
} // end class
