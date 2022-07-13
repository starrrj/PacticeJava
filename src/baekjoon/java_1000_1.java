package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java_1000_1 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		
		int a = br.read();
		int b = br.read();

		br.close();
		
		System.out.println(a + b);
		


	}

}
