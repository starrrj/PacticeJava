package ch18_inputoutput.objectinputstream_objectoutputstrearm;

import java.io.Serializable;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ClassC implements Serializable {
	// 직렬화할 필요가 있는 클래스를 선언할 때에는,
	// 자바컴파일러에게 자동추가를 맡기지 말고, 개발자가 직접 필드와 초기값을 지정하자!
	// 왜? 유연성을 이용할수 있으니까
	private static final long serialVersionUID = 7777777L;
	
	int field1;
	
	// 객체의 직렬화 이후에, 새로운 필드 추가 -> Compile- > serialVersionUID 값이 다시 생성(무작위)
//	int field2;
}
