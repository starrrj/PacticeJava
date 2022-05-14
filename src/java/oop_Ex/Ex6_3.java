package oop_Ex;

public class Ex6_3 {

	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.width = " + Card.height);

		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + 
				"이며, 크기는("+Card.width+","+Card.height+")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number +
				"이며, 크기는("+Card.width+","+Card.height+")");
		
		System.out.println("c1의 width와 height를 각각 50,80으로 변경합니다.");
//		c1.width = 50;      iv로 오해 하기 쉬운 코드
//		c1.height = 80;     static변수 정석으로 쓰기
		
		Card.width = 50;
		Card.height = 80;
		
		System.out.println(
				"c1은 " + c1.kind + ", " + c1.number + 
				"이며, 크기는("+Card.width+","+Card.height+")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number +
				"이며, 크기는("+Card.width+","+Card.height+")");
	} // main

} // 예제 class

class Card{
	String kind;         // 무늬 iv
	int number;          // 숫자 iv

	static int width = 100;   // 폭   cv
	static int height = 250;  // 높이 cv
} // card 