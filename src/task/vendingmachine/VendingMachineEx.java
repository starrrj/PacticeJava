package vendingmachine;

import java.util.Scanner;

public class VendingMachineEx{
	
	public static void main(String[] args) {
		
		VendingMachine VM = new VendingMachine(0,0);
		
		System.out.println("-------------------------------------");
		System.out.println("********** [ 음료 자판기 ] **********");
		System.out.println("-------------------------------------");
		System.out.println(" 콜라=1 / 사이다=2 / 커피=3 / 생수=4 ");
		System.out.println("[     자판기에 돈을 넣어주세요      ]");

		
		VM.play();
		VM.chose();
		VM.pay();
//		int balance = coin-price;
		
	}
}