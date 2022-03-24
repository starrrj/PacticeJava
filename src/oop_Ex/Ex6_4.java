package oop_Ex;

public class Ex6_4 {

	public static void main(String[] args) {
		MyMath mm = new MyMath(); 
		long result = mm.max(5L, 3L);
		long result1 = mm.add(5L, 3L); // add메서드 호출
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		System.out.println("max(5L, 3L) = "+ result);
		System.out.println("add(5L, 3L) = "+ result1);
		System.out.println("subtract(5L, 3L) = "+ result2);
		System.out.println("multiply(5L, 3L) = "+ result3);
		System.out.println("divide(5L, 3L) = "+ result4);

	} // main

} // class

class MyMath {
	long add(long a, long b) { // 메서드는 클래스 영역에만 정의 가능
		long result = a + b;
		return result;
		// return a+b; // 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	} // add method
	
	long subtract(long a, long b) { return a - b;}
	long multiply(long a, long b) { return a * b;}
	double divide(double a, double b) { return a / b;}
	
	// 두 값을 받아서 둘중에 큰 값을 반환하는 메서드를 작성하시오.
	long max(long a, long b) {
		return  a > b ? a : b;  // 삼항연산자로 바꾸기
//		long result = 0;
//		if(a>b) {
//			result = a;
//		} else {
//			result = b;
//		}
//		return result;
	} // max method
} // class
