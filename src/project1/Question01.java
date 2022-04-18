package project1;

public class Question01 {

	public static void main(String[] args) {
		// 2차원 배열 : Lvalue 에보니, [][] 기호가 2개
		// 그러니, 2차원 맞죠!?
		int[][] arr = { {1,2} , {3} , {4,5,6} , { } };
		
		/* 
		 * 자그럼, 값의 목록이 지금은 없을때,
		 * 위와 같은 배열을 선언하여, 미리 공간을 확보하려면
		 * 어떻게 해야하느냐!? (질문)
		 */
		
		int [][] arr2 = new int[4][];
		arr2 = new int[][]{ {1,2} , {3} , {4,5,6} , { } };
		
	}

}
