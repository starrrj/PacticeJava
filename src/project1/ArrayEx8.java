package project1;

public class ArrayEx8 {

	public static void main(String[] args) {
		int[] ball = new int[45];	// 45개의 정수값을 저장하기 위한 배열 생성
		
		for(int i=0; i< ball.length; i++)
			ball[i] = i+1;			// ball[0]에 1이 저장
		
		int temp = 0;
		int j = 0;
		
		for(int i=0; i <6; i++) {
			j = (int)(Math.random()*45); // 0~44범위의 임의의 값
		} // for
		
		for(int i=0; i<6; i++) {
			System.out.printf("ball[%d]=%d%n", i, ball[i]);
		} // for
	} // main
} // end class
