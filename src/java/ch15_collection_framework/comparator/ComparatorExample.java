package ch15_collection_framework.comparator;


import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		
		Comparator<? super Fruit> comparator = new DescendingComparator();
		
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator()); // 내림차순으로 정렬
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 6000));
		
		System.out.println(treeSet); // ToString-lombok
		
//		-- traverse --
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.name + ":" + fruit.price);
		} // while
	} // main
} // class
