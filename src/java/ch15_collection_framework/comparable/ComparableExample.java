package ch15_collection_framework.comparable;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("김자바", 25));
		treeSet.add(new Person("박디비", 31));
	
//		-- Traverse(순회) --
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + ":" + person.age);
		}

//		for(Person person : treeSet) {
//			System.out.println(person.name + ":" + person.age);
//		} // enhanced -for
	}

}
