package genericEx.generic_method2;


public class Util {
	public static <K,V> boolean compare( Pair<K,V>p1, Pair<K,V>p2 ) {
		// compare 메소드는 두개의 Pare객체를 받아서 
		// p1,p2 K값이 동일하고, p1,p2의 V값이 동일하면 true
		
		boolean KeyCompare = p1.getKey().equals(p2.getKey());
		boolean ValueCompare = p1.getValue().equals(p2.getValue());
		return KeyCompare && ValueCompare;
	}

} //end class