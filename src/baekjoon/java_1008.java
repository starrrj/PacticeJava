package baekjoon;

import java.util.Scanner;

public class java_1008 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextInt();
		double b = sc.nextInt();
		
		if(a>0 & b<10) {
			System.out.println(a/b);
		}
		
		sc.close();
	}
}
