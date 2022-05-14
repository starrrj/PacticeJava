package ch14_lamda.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> consumer = t -> System.out.println(t+ "8"); // t를 소비하는 소비코드
		consumer.accept("java");
		
		BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u);
		biConsumer.accept("Java", "8");
		
		DoubleConsumer doubleConsumer = d -> System.out.println("Java" + d);
		doubleConsumer.accept(8.0);
		
		IntConsumer intConsumer = i -> System.out.println("Java" + i);
		intConsumer.accept(8);
	
		LongConsumer longConsumer = l -> System.out.println("MaxNum" + l);
		longConsumer.accept(2147483647);
		
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
		objIntConsumer.accept("Java", 8);
		
		ObjDoubleConsumer<String> objDoubleConsumer = (t, d) -> System.out.println(t + d);
		objDoubleConsumer.accept("Java", 8.0);
		
	}
}
