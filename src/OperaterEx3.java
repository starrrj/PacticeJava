
public class OperaterEx3 {


	public static void main(String[] args) {
			
		int x = 10;
		int y = 10;
		int z;
		
			//* 증감연산자가 단독으로만 사용되는 경우에는, 전위/후위의 의미가 없다!
		x++;                   //   -> 11
		++x;                   //	-> 12

		System.out.println("1.x=" + x); //  ---> 12
			
		y--;                    //   -> 9                            
		--y;                    //   -> 8

		System.out.println("2.y=" + y);  //  ---> 9
		System.out.println("3. x="+ x);  // ---> 12
			
		z = x ++;          	//       -> 13

		System.out.println("4. z=" + z); // ---> 12
		System.out.println("5. x=" + x); 	 // ---> 13

		z = ++x;                  	// --> 14

		System.out.println("6. z=" + x); // ---> 14
		System.out.println("7. x=" + x); // ---> 14
			
		//	* 가독성이 좋아야 좋은 코드, 클린코드
		//  x : 전위 , y : 후위 (먼저 본인의 값으로 참여하여하고 그 후에 연산)
	  	// 	z = ++x + y++;      -> 15 + 8 = 24 
		// 	욕바가지로 먹는 코드
		
		x = x + 1;               //  -> 15 
		z = x + y;               //  -> 23 
		y = y + 1;               //  -> 9

		System.out.println("8. z=" + z);
		System.out.println("9. x=" + x);
		System.out.println("10. y=" + y);

	} // main	
} // end class

