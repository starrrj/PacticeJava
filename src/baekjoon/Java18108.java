package baekjoon;

import java.util.Scanner;

public class Java18108 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a>=1000 && a<=3000) {
			System.out.println(a - 543 );
		}
		sc.close();
	}	
}
