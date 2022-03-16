
public class CastingEx1 {
	
	public static void main(String[] args) {
		
		int intValue = 44032; // 2byte
		char charValue = (char) intValue; // 값에 따라 데이터유실이 있을수도, 없을수도 있음
			
		System.out.println(charValue); // 가 -> 유실X
				
//				-----	
				
		long longValue = 500; // 2byte
		intValue = (int) longValue; // long 8byte, int 4byte
				
		System.out.println(intValue); // 500 -> 유실X
				
//				-----
				
		double doubleValue = 3.14; // 3.14 = 2byte, double 실수타입 - 8byte
		intValue = (int) doubleValue; // '정수 <- 실수' 소수점 유실
				
		System.out.println(intValue); // 3 -> 데이터의 유실
	
	} // main
	
} // class
