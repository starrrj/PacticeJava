package anagram;

import java.util.Scanner;


public class Solution2 {

	
	static boolean isAnagram(String a, String b) {
		
		// 1. 소문자 대문자 통일
		a = a.toLowerCase();	// a에 입력된 문자들을 다 소문자로 변환.
		b = b.toLowerCase();

//		------
		
		// 2. a랑 b 바이트 배열로 변환
		byte[] byteA = a.getBytes();
		byte[] byteB = b.getBytes();
		
//		------
				
		int alph=97;	// 소문자 a의 아스키코드
		
		// 3. 같은 빈도의 문자 수
		
		while(byteA.length==byteB.length & alph<123) {	// 문자열의 길이가 같아야함 & 알파벳 소문자의 아스키코드가 122까지임으로 122를 넘으면 안됨.
			int countA=0;	
			int countB=0;
			
			for(int i=0;i<byteA.length;i++) {		
				if(alph==byteA[i]) {	// alph와 byteA가 같다면 countA++
					countA++;
				} // ifA
			} // for-A
			
			for(int j=0; j<byteB.length; j++) {
				if(alph==byteB[j]) {	// alph와 byteB가 같다면 countB++
					countB++;
				} // ifB					
			} // for-B				
		
			if(countA!=countB) {		// countA와 countB가 같지않다면 false
				return false;
			} else {					// 같으면 alph 증가하여 계속 진행.
				alph++;
			} // if-else
			
			if(alph==123) {				// alph가 123이면 z까지 모두 countA와 countB가 일치함을 알 수 있음으로 true
				return true;
			} //if
		} // while
		
		return false;
	 } // isAnagram

	
//	--------------------
	
	public static void main(String[] args) {
	    	
	        Scanner scan = new Scanner(System.in);
	        
	        String a = scan.next();		// 문자 입력받음
	        String b = scan.next();
	        
	        scan.close();	// 자원해제
	        
	        boolean ret = isAnagram(a, b);		// isAnagram에서 boolean값을 받음
	        
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );	    // true면 Anagrams 출력함          
	} // main

} // end class

