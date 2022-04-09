package ch15_collection_framework.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	// List : (1) 순서보장(인덱스번호사용하여 조작) (2) 중복허용
	//			(3) 빈번한 추가/삭제가 적어야 만 효율적
	public static void main(String[] args) {
		// Lvalue(부모타입) = Rvalue(자식타입, 구현클래스)
		List<String> list = new ArrayList<>(); // 다형성 -1 , capacity =10 (지정안함)
		
		list.add("Java");	// 
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2,"Database");		// add(index, String)
		list.add("iBATIS");
		
//		-----
		
		int size = list.size();
		System.out.println("총 객체수: " + size);
		System.out.println();
		
		String skill = list.get(2);	
		System.out.println("2: " + skill);
		System.out.println();
		
		for(int i = 0; i<list.size(); i++ ) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		} //classical for
		
		System.out.println();
		
		// enganced for의 사용조건 : Iterable인터페이스의 구현객체
		for( String str : list) {
			System.out.println(">> str: " + str);
		} // enganced for
		
//		------
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		System.out.println();
//		----
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			
			System.out.println(i + ":" + str);
		} // for
	} // main

} // end class
