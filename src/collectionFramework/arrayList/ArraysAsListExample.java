package collectionFramework.arrayList;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {

	public static void main(String[] args) {
		List<String> list1 =
//				Arrays.<String>asList("홍길동","김자바","별");
				Arrays.asList("홍길동","김자바","별");	// 다형성-1
		
		for(String name: list1) {
			System.out.println(name);
		} // enhanced for
		
		System.out.println(); // 개행
//		---
		
		Integer integer = 1;	// Auto boxing
		int i = integer;		// Auto Unboxing
		
//		List<Integer> list2 = Arrays.asList(new Integer(1), new Integer(2), new Integer(3)); // 자동언박싱이용
		List<Integer> list2 = Arrays.asList(1, 2, 3);	// 다형성-1
		
//		for(Integer value : list2) { // list2에서 자동언박싱으로 int 사용가능
		for(int value : list2) {
			System.out.println(value);
		} // enhanced for

	} // main

} // end class
