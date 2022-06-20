package etc;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static User user = new User();
	
	public static void main(String[] args) throws Exception {
		a : while(true) {
			System.out.println("1. 회원가입 \t 2. 로그인 \t 3. 종료");
			System.out.print(">>>>>>    ");
			
			String n = sc.nextLine();
			
			switch(n) {
				case "1" -> make_user();
				case "2" -> login();
				case "3" -> {
					System.out.println("시스템 종료.");
					
					break a;
				}
				case "admin" -> {
					System.out.println("관리자 접근");
					user.get_DB();
				}
				default -> System.out.println("잘못 입력!");
			} // switch expression
			
			System.out.println();
		} // while
	} // main
	
	static void make_user() throws Exception {
		System.out.print("아이디 입력\n>>>>>>    ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 입력\n>>>>>>    ");
		String pass = sc.nextLine();
		
		user.set_User(id, pass.getBytes());
	} // make_user
	
	static void login() throws Exception {
		System.out.print("아이디 입력\n>>>>>>    ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 입력\n>>>>>>    ");
		String pass = sc.nextLine();
		
		user.get_User(id, pass.getBytes());
	} // login
 
} // end class
