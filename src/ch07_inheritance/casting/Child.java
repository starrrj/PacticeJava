package ch07_inheritance.casting;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access=AccessLevel.PUBLIC)
public class Child extends Parent {
	public String field2;
	
	
	public void method3() {
		System.out.println("Child-method3() invoked.");
	} // method3

}// end class
