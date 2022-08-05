package baekjoon.loop;

import java.util.Scanner;

public class Java10950 {

	public static void main (String[] agrs) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			System.out.println(a+b);
		} // for
			sc.close();
		
	} //main
	
} // end class
