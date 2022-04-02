package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// Map<K,V> 컬렉션 생성 
		Map<String, Integer> map = new HashMap<>();
		
		map.put("김자바", 89);	// 중복
		map.put("정자바", 90); 
		map.put("유자바", 84);
		map.put("김자바", 95);	// 중복 -> 키가 중복되기 때문에, 들어가지 못함
		System.out.println(("총 Entry 수: " + map.size()));
		
		System.out.println(map);
		
		// 객체 찾기
		System.out.println("김자바 : " + map.get("김자바"));
		System.out.println(); // 개행
	
//		---
		
		//객체를 하나씩 처리
		// Map컬렉션에 있는 모든 요소들의 키(Key)만 뽑아서, Set<Key> 객체로 되돌려 줌.
		// key의 값만 들어있음-> 순회, 
		Set<String> keySet = map.keySet();	
		Iterator<String> keyIterator = keySet.iterator(); // 외부반복자(Iterator)를 이용한 순회
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
			
//			keyIterator.remove();
		} // while
		
		System.out.println();
		
//		---
		
		// 객체 삭제
		map.remove("김자바");
		System.out.println(("총 Entry 수: " + map.size()));
		
//		----
		
		// 객체를 하나씩 처리
		// entry를 순회하면서 
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry= entryIterator.next(); // map.Entry객체얻어짐
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		} // while
		
		System.out.println();
		
//		---
		
		// 객체 전체 삭제
		map.clear();
		map.isEmpty();
		System.out.println(("총 Entry 수: " + map.size()));
	}
}
