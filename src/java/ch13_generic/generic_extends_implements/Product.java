package ch13_generic.generic_extends_implements;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Product <T, M>{
	private T kind;
	private M model;
	
} // end class

//---------------

@NoArgsConstructor
class Tv{
	;;
} // end class