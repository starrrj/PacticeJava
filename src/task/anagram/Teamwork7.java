package anagram;

import java.util.Scanner;


public class Teamwork7 {

    
	static boolean isAnagram(String a, String b) {		// 아나그램
		
		if(a.length() != b.length()) {	// 입력받은 문자열 a,b의 길이를 비교하여 
			return false;				// 길이가 다르면 비교할 필요가 없이 바로 false 리턴
			}
		
		a = a.toLowerCase();			// a와b의 문자열을 전부 소문자로 변경해서 반환
		b = b.toLowerCase();			// ""
		
		int sum = 0;
		for (char c='a'; c<='z'; c++) {			// a~z 까지의 문자 반복
//			System.out.println(c);
			for(int i=0; i<a.length(); i++) {	// a문자열 길이의-1 만큼 i 증가
//				System.out.println(i);
				if(a.charAt(i) == c) {			// charAt()메소드를 사용하여 a문자열의 인덱스와 c를 비교
				sum++;							// 같으면 sum에 +1
				}
				
				if(b.charAt(i) == c) {			// charAt()메소드를 사용하여 b문자열의 인덱스와 c를 비교
				sum--;							// 같으면 sum에 -1
				}
			}// 내부 for
			
	
			if (sum != 0)						// sum이 0과 다르면 false 반환
			return false;
			}// 외부 for
		
			return true;
    	}// isAnagram

  public static void main(String[] args) {			// 실행메소드
    
        Scanner scan = new Scanner(System.in);		// 입력 스캐너 생성
        String a = scan.next();						// a문자열 입력
        String b = scan.next();						// b문자열 입력
        scan.close();								// 외부자원 해제
        boolean ret = isAnagram(a, b);				// ret 변수 초기화
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" ); 
       
        // 삼항 연산자로 ret이 true면 "Anagrams" 출력
        // 				 ret이 false면 "Not Anagrams" 출력
   
  
        
  }// main
}// end class
