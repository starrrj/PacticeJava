package map.hashtable;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {

	public static void main(String[] args) {
		// Hashtable: HashMap과 내부 구현은 같으나, 차이점은 Thread-safe
		Map<String, String> map = new Hashtable<>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
//		----
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {	// 무한루프
			
			// 입력받기 위한, 프롬프트(prompt) 메시지 출력
			System.out.println("아이디와 비밀번호를 입력해주세요");
			
			System.out.println("아이디 : ");
			String id = scanner.nextLine();
			
			System.out.println("비밀번호: ");
			String password = scanner.nextLine();
			
			System.out.println();
			
			// User Authentication
			if(map.containsKey(id)) {	// 입력한 아이디가 존재하는가
				
				if(map.get(id).equals(password)){	// 입력한 암호도 일치! (탈출조건)
					System.out.println("로그인 되었습니다.");
					
					break;
				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					// 아이디 또는 암호가 일치하지 않습니다. 로 해야 보안높아짐
				} // if -else
			} else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			} // if-else
		} // while
	}// main
} // end class
