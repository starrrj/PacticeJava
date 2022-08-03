package baekjoon.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java15552 {
	
	public static void main (String[] agrs) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		
		for(int i=0; i<Integer.parseInt(strs[0]); i++) {
			int a = Integer.parseInt(strs[i]);
	        int b = Integer.parseInt(strs[i+1]);
			System.out.println(a+b);
		} // for
		
		br.close();
	} // main
} // end class
