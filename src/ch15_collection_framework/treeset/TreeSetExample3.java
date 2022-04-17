package ch15_collection_framework.treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {

		// TreeSet은 이진 트리를 이용하
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("chrerry");
		
		System.out.println(treeSet);
		
		System.out.println("[c~f 사이의 단어 검색]");
		
		// subSet범위검색
		//( 시작값, 시작값이 포함되는지, 끝 값, 끝값이 포함되는지) 포함되면 true, 안되면 false
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true); 
		
		for(String word : rangeSet) {
			System.out.println(word);
		} // enhanced for
		
		// forever 는 f뒤에 o가 왔기때문에 f 보다 뒤에있는 값. 범위포함 X
	} // main

} // end class
