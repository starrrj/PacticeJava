package baekjoon;

import java.util.Scanner;

public class java_1000 {
	
	public static void main(String[] args) {

		// scanner 객체생성 , System.in = Byte 단위로 읽음
		// 보통 객체명을 in, scan, sc 사용 
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();

		System.out.println(A+B);
		
		scan.close();
	}

}


//// Reference Type
//// >> Class Type - String Class 
//
//	String 문자열_space = scan.next();
//	String 문자열_Enter = scan.nextLine();
//	
//    
//// Primitive Type
//// >> boolean Type
//
//	boolean 부울 = scan.nextBoolean();
//	
//    
//// >> Numeric Type
//	// >> >> Integer Type
//    
//	byte 바이트 = scan.nextByte();
//	short 쇼트 = scan.nextShort();
//	int 정수 = scan.nextInt();
//	long 롱 = scan.nextLong();
//	
//    
//
//	// >> >> Floating Point Type
//    
//	double 더블형 = scan.nextDouble();
//	float 플롯 = scan.nextFloat();
//
