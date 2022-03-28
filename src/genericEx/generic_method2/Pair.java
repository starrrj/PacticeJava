package genericEx.generic_method2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Pair <K,V>{
	private K key;
	private V value;
}
