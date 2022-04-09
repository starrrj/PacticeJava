package ch14_lamda.Operator;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = {92, 95, 87};

	public static int maxOrMin(IntBinaryOperator operator) { // 다형성-1
		int result = scores[0];	// 첫번째 원소의 값을 임시결과로 지정
		for(int score: scores) { // scores의 값을 대입하여 루프, 배열의 원소를 차례대로 순회
			result = operator.applyAsInt(result, score);	// 추상메소드 호출(다형성-2)
		}
		return result;
	}
	
	public static void main(String[] args) {
		//최대값 얻기
//		int applyAsInt(int left, int right);
		int max = maxOrMin(
			(a, b) -> {
				if(a>=b) return a;
				else return b;	// 람다식: 최대값을 가지는 원소를 추출하는 익명구현객체 생성
			}
		);
		System.out.println("최대값: " + max);
	

		//최소값 얻기
		int min = maxOrMin(
			(a, b) -> {
				if(a<=b) return a;
				else return b;
			}
		);
		System.out.println("최소값: " + min);
	}
}
