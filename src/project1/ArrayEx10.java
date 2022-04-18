package project1;

import java.util.Arrays;

public class ArrayEx10 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for (int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i]=(int)(Math.random()*10));
		} // for
		System.out.println();
		
		for(int i=0; i<numArr.length-1; i++) {
			boolean changed = false;	// 자리바꿈이 발생했는지 체크
			
			for(int j=0; j< numArr.length-1-i; j++) {
				if(numArr[j]>numArr[j+1]) {
					int tmp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = tmp;
					changed = true;		// 자리바꿈이 발생했으니 changed를 true로
				} // if
			} // for
			
			if(!changed) break;		// 자리바꿈 없을 시 반복문 탈출
			
			for(int k=0; k<numArr.length; k++)
				System.out.print(numArr[k]);
			System.out.println();
		} // for
	} // main
}// class
