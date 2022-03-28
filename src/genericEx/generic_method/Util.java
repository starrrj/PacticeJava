package genericEx.generic_method;


public class Util {
	// Utility class ---> 'Helper' class(예: Math.random)

	// 제네릭 메소드 선언
	public static <T> Box<T> boxing(T t) {
//		Box<T> box = new Box<T>();
		Box<T> box = new Box<>();
		
		box.set(t);
		
		return box;
	} // boxing

} //end class