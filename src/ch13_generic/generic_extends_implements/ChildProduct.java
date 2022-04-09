package genericEx.generic_extends_implements;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;

@ToString
@Setter
@Getter
@NoArgsConstructor 
public class ChildProduct <T, M, C> extends Product<T, M> {
	private C company;
	


}
