package ch13_generic.bounded_type;

public class Util {
	
	// 제네릭 정적 메소드 "선언"
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
//		Integer i = 100;
//		i.intValue();
//		i.doubleValue();
		
		return Double.compare(v1,v2);
	} // compare
} // end class