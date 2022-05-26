package ch13_generic.multi_type_parameter;


import lombok.NoArgsConstructor;
import lombok.ToString;

// 제네릭타입 클래스의 선언 - 멀티타입 파라미터를 가짐 (T,M)
@ToString
@NoArgsConstructor
public class Product<T,M>{
	private T kind;
	private M model;
	

	public T getKind() { return this.kind; }
	public M getModel() { return this.model; }
	
	public void setKind(T kind) { this.kind = kind; }
	public void setModel(M model) { this.model = model; }

}
