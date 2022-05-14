package ch14_lamda.andthen_compose;

import java.util.function.Consumer;

public class ConsumerAndThenExample {

	public static void main(String[] args) {
		Consumer<Member> consumerA = (m)-> {
			System.out.println("consumerA: " + m.getName());
		};
		
		Consumer<Member> consumerB = (m)-> {
			System.out.println("consumerB: " + m.getId());
		};
		
		Consumer<Member> consumerAB = consumerA.andThen(consumerB); // 앞에있는 것을 먼저 실행
		consumerAB.accept(new Member("홍길동", "hong", null));
	}
}
