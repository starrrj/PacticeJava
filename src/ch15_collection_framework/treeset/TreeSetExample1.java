package ch15_collection_framework.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample1 {

		// TreeSet은 이진 트리를 이용하
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		// int -> Integer : Auto-boxing
//		scores.add(new Integer(87)); 자동박싱으로 밑과 같이 써도 된다.
		scores.add(87); // 취소선 : Deprecated
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		System.out.println(scores);
		
//		---
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("가장 낮은 점수: " + score);
		
		score = scores.last();
		System.out.println("가장 높은 점수: " + score + "\n");
		
		score = scores.lower(new Integer(95));
		System.out.println("95점 아래 점수: " + score + "\n");
		
		score = scores.higher(new Integer(95));
		System.out.println("95점 위의 점수: " + score + "\n");
		
		score = scores.floor(new Integer(95));
		System.out.println("95점이거나 바로 아래 점수: " + score + "\n");
		
		score = scores.ceiling(new Integer(85));
		System.out.println("95점이거나 바로 위의 점수: " + score + "\n");
		
		// pollFirst<-제일 왼쪽 자식노드부터 set에서 빼낸다(제거) // 오름차순
		while(!scores.isEmpty()) {
			score = scores.pollFirst();  
			System.out.println(score + "(남은 객체 수: " + scores.size() + ")");
		} // while
		
		// pollLast<-제일 오른쪽 노드부터 set에서 빼낸다(제거) // 내림차순
		while(!scores.isEmpty()) {
			score = scores.pollLast();  
			System.out.println(score + "(남은 객체 수: " + scores.size() + ")");
		} // while
		
		// pollFist와 달리 제거하지않고, 값을 가지고 오기만함
		Iterator<Integer> iterator = scores.iterator(); 
		while(iterator.hasNext()){
			int s = iterator.next();
			iterator.remove(); // remove가 있어야 제거 가능
			System.out.println(s);
		}
		
		
	} // main

} // end class
