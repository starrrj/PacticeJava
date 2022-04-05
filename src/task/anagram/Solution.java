package anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	static boolean isAnagram(String a, String b) {

		// 1. 소문자 대문자 통일 <- 입력된 문자들을 다 소문자로 변환
		a = a.toLowerCase();	
		b = b.toLowerCase();
				
//		----
				
		// 2. a랑 b를 char 배열로 변환하여 문자배열 추출
		char arrA[] = a.toCharArray();
		System.out.println(Arrays.toString(arrA));

		char arrB[] = b.toCharArray();
		System.out.println(Arrays.toString(arrB));
		
//		---
		
		// 3. sort로 배열 오름차정렬
		Arrays.sort(arrA);
		Arrays.sort(arrB);
		
//		---
		
		// 4. 오름차정렬된 문자배열 을 equals 일치여부 확인
		if (Arrays.toString(arrA).equals(Arrays.toString(arrB))) {
			return true;
		} else {
			return false;
		} // if
	} 


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
