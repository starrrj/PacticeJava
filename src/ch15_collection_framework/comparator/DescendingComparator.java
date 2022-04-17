package ch15_collection_framework.comparator;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {   // 재정의 
		if(o1.price < o2.price) return 1;
		else if(o1.price == o2.price) return 0;
		else return -1;
	}
	
	/*순서에 대한 두 인수를 비교합니다.
	 * @param o1 비교할 첫 번째 개체입니다.
	 * @param o2 비교할 두 번째 객체.
	 *작거나 같거나 크면 음의 정수, 0 또는 양의 정수를 반환합니다.
	 */
}
