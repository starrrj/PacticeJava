package vendingmachine;

import java.util.Scanner;

public class VendingMachine {

	// 1. 고유속성필드
	public int coin;
	public int price;
	public int beverage;
	
	// 2. 상태필드
	public int charge;
	public int chose;
	
	// 3.생성자
	public VendingMachine(int coin, int price) {
		this.coin = coin;
		this.price = price;
	} // construct
	
	public VendingMachine(int beverage) {
		this.beverage = beverage;
	}
	
	// 4. 메소드
	
	public void play() {
	
		Scanner coinput = new Scanner(System.in);
		coin = coinput.nextInt();
		
		System.out.printf(" %d원을 넣었습니다.%n", coin);
	}
	
	public boolean pay() {
		
		if(coin >= price) {
			System.out.printf("잔액은 %d원 입니다.%n", coin-price);
			return true;
		} else {
			System.out.printf("%d원 부족합니다. 돈을 더 넣어주세요. %n", price-coin);
			return false;
		} // if
	} // play method 
	
	public void chose() {
		System.out.println("음료의 번호를 입력해주세요. (1~4)");
		Scanner choice = new Scanner(System.in);
		beverage = choice.nextInt();
		
		switch(beverage) {
		case 1 : 
			price = 900;
			System.out.println("콜라가 나왔습니다."); break;
		case 2 :
			price = 800;
			System.out.println("사이다가 나왔습니다."); break;
		case 3 :
			price = 700;
			System.out.println("커피가 나왔습니다."); break;
		case 4 : 
			price = 500;
			System.out.println("생수가 나왔습니다."); break;
		case 0 : 
			System.out.println("선택을 종료합니다."); break;
		}
	}
	
} // end class

