package instanceOf;

import lombok.extern.java.Log;

@Log
public class PatternMathching {

	public static void main(String[] args) {
//		log.trace("main({}) invoked.", Arrays.toString(args));
	
		Object obj = "Java!";
//		log.info("obj: {}, type:{}",obj,obj.getClass().getName());
		
//		-----
		//Example1 - Previous example.
		if(obj instanceof String) {
			String s = (String) obj;
		
		int length = s.length();
		log.info("length: {}");
		
		} // if
		
//		-----
		
		if(obj instanceof String s) {
			int length = s.length();
			log.info("length: {}");
		} // if
	}

}
