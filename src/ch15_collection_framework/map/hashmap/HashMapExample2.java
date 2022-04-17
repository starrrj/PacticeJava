package ch15_collection_framework.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		// 다형성-1
		Map<Student, Integer> map = new HashMap<>();
		
		map.put(new Student(1,"홍길동"), 95);
		map.put(new Student(1,"홍길동"), 90);	// 불가!! (중복판단)
		
		System.out.println(("총 Entry 수: " + map.size()));
	
		System.out.println(new Student(1, "홍길동"));
	} // main
}//end class
