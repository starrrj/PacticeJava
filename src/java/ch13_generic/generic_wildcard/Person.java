package ch13_generic.generic_wildcard;


public class Person {
	private String name;
	
	public Person(String name) {				// AllArgsConstructor
		this.name = name;
	} // constructor
	
	public String getName() { return name; }	// Getter
	public String toString(){
		return name;
	}
} // end class
