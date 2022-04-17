package ch15_collection_framework.treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이동수");
		scores.put(new Integer(75), "박길순");
		scores.put(new Integer(95), "신용권");
		scores.put(new Integer(80), "김자바");
		
		// 내림차순 descendingMap
		// key와 value가 들어있는 mapEntry를 가져와서 map형태의 컬렉션으로 만든다.
		NavigableMap<Integer, String> descendingMap = scores.descendingMap(); 
		Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();
		
		for(Map.Entry<Integer, String> entry : descendingEntrySet ) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
		System.out.println();
		
		// 오름차순 descendingMap X2
		NavigableMap<Integer, String> ascendingMap = descendingMap.descendingMap(); 
		Set<Map.Entry<Integer, String>> ascendingEntrySet = ascendingMap.entrySet();
		
		for(Map.Entry<Integer, String> entry : ascendingEntrySet ) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
		}
	} // main

}// class
