package ch15_collection_framework.treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {

		// TreeSet은 이진 트리를 이용하
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		// int -> Integer : Auto-boxing
		scores.add(87); // 취소선 : Deprecated
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		System.out.println(scores);
		
		 // 내림차순 정렬된 Set을 얻는것
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		for (Integer score : descendingSet) {
			System.out.print(score + " ");
		} // enhanced for
		System.out.println();
		
		// descendingSet을 두 번하면 오름차순
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		
		for(Integer score : ascendingSet) {
			System.out.print(score + " ");
		} // enhanced for
	} // main

} // end class
