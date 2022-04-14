package wrapper;

public class BoxingUnboxingExample {

	public static void main(String[] args) {
		//1. Boxing
		Integer obj1 = new Integer(100);			// Deprecated
		Integer obj2 = new Integer("200");
		
		Integer obj3 = Integer.valueOf("300");

		//2. Unboxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		//3. Boolean 의 박싱/언박싱
		Boolean bool1 = new Boolean(true);
		Boolean bool2 = new Boolean("true");
		Boolean bool3 = Boolean.valueOf(true); // 값으로부터 랩퍼타입을 만들어냄
		Boolean bool4 = Boolean.valueOf("true");
		Boolean bool5 = Boolean.parseBoolean("false"); // 문자열로부터 기본타입을 만들어냄
		System.out.println("bool5: "+bool5);
		
		boolean b1 = bool1.booleanValue();
		boolean b2 = bool2.booleanValue();
		boolean b3 = bool3.booleanValue();
		boolean b4 = bool4.booleanValue();
		boolean b5 = bool5.booleanValue();
		
		// Auto-boxing / Auto-unboxing
		Integer i = 1000;		//Auto-boxing
		int i2 = i;				//Auto-unboxing
		
	} // main

} // end class
