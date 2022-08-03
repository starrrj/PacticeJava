package baekjoon.loop;

import java.util.Scanner;

public class Java2739 {

	public static void main (String[] agrs) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(num +" * " + i + " = " + num*i);
		}// for
		
	} // main
	
} // end class
