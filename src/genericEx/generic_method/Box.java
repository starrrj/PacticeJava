package genericEx.generic_method;



import lombok.NoArgsConstructor;
import lombok.ToString;

// Generic Type 중, 제네릭을 클래스에 적용 ====> "제네릭 클래스"

@ToString
@NoArgsConstructor
public class Box<T> {		// T = 타입파라미터
	private T t;			// 필드 선언


	// 메소드(Getter/setter) 선언
	public T get() {return t;}			// get
	public void set(T t) {this.t=t;}	// set
	
}

