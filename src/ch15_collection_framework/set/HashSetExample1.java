package ch15_collection_framework.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");		
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
//		---
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
//		---
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {	// 저장된 객체수많큼 루핑,
			// String 객체 하나를 가져옴, 가져올게 있으면 true, 없으면 false 
			String element = iterator.next();
			System.out.println("\t" + element);
		} // while
		
//		--
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: " + set.size());
		
		for(String element: set) {
			System.out.println("\t" + element);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
	}
}
