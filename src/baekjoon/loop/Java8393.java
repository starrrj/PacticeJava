package baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java8393 {

	public static void main (String[] agrs) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		br.close();
		int s = 0;
		
		for( int i=1; i<=n; i++ ) s+=i;
 
		System.out.println(s);
		
	} // main
	
} // end class
