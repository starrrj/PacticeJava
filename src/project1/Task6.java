package project1;

import java.util.Arrays;

public class Task6 {

	public static void main(String[] args) {
		
		int from = 1;
		int to = 100;
		int[] numArr = new int[10];
			
		// 배열의 각 요소에 1~100 의 값을 저장한다.
		for(int i=0; i < numArr.length; i++) {
			numArr[i] = (int)(Math.random() * to-from)+1;
				
		} // for #1
		
		System.out.println("정렬 전: "+Arrays.toString(numArr));   // 20개의 무작위 정수배열 (복원추출)
	
		for(int i=0 ; i < numArr.length; i++) {
			numArr[i] = numArr[i] + numArr[i+1];
			numArr[i+1] = numArr[i] - numArr[i+1];
			numArr[i] = numArr[i] - numArr[i+1];
			
		System.out.println("정렬 후: "+Arrays.toString(numArr));
		} // for #2
	} // main
} // end class


//for(int j=0; j < numArr.length-i-1; j++) { 				// tmp 없이 값 교환
//if(numArr[i]>numArr[i+1]) { 		  
//} // if			
//}// inner-for
//System.out.println("정렬 후: "+Arrays.toString(numArr));




//int number1 = 1;
//int number2 = 2;
//
//number1 = number1 + number2;
//number2 = number1 - number2;
//number1 = number1 - number2;
//
//System.out.println("number1: " + number1);
//System.out.println("number2: " + number2); 


