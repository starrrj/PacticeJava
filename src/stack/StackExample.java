package stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		System.out.println(coinBox);
		
//		-- traverse  순회 ---
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop(); // 하나씩 꺼내서 제거
			
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		} // while
		
	} // main
} // end class
