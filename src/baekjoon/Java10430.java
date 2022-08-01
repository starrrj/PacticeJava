package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class Java10430 {

	public static void main(String[] args) throws IOException {
				
		Scanner sc = new Scanner(System.in);
				
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		sc.close();
		
		if(2<=a&2<=b&2<=c&a<=10000&b<=10000&c<=10000) {
			System.out.println((a+b)%c);
			System.out.println(((a%c)+(b%c))%c);
			System.out.println((a*b)%c);
			System.out.println(((a%c)*(b%c))%c);
		} // if

	} // main
} // end class

