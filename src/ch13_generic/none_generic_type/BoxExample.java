package genericEx.none_generic_type;


public class BoxExample {
	

	public static void main(String[] args) {
		Box box = new Box();
		
		box.set("Java");
		String name = (String) box.get();
		
//		---
		
		box.set(new Apple());
		Apple apple = (Apple) box.get();

	} // main

} // end class
