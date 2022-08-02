package baekjoon;

import java.util.Scanner;

public class Java2525 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		
		sc.close();
		
		if(m+t>=60) {
			
			h++;
			m = (m+t)-60;
			
			while(m>=60) {
				h++;
				m = m-60;
			}
			
			if(h>=24) {
				h = h-24;
			}			
			System.out.println(h+ " " +m);
		} else {
			m = m+t;
			System.out.println(h+ " " +m);
		}
		
	} // main
} // end class
