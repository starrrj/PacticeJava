package project1;

import java.util.Arrays;

public class Computer {

	int sum1(int[] values) {
		int sum =0;
		
//		for(int i=0; i<values.length; i++) {
//			sum += values[i];
//		} // for
		
		for( int number : values ) {
			sum = sum + number;
		}// enghanced for
		
		return sum;
	} // sum1

	int sum2(int ... values) {  // 가변인자(=배열)를 만들때 사용( ... )
		System.out.println("values: " + Arrays.toString(values));
		int sum = 0;
		
		for(int i=0; i<values.length; i++) {
			sum += values[i];
	}// for
		
		return sum;
	} // sum2
} // class
