package ch18_inputoutput.objectinputstream_objectoutputstrearm;

import java.io.Serializable;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ClassA implements Serializable {
	
	// 집합(부품)
	int field1;
	
	// 집합(부품)관계 필드
	ClassB field2 = new ClassB();
	
	// 정적필드도 직렬화에 포함될까? -> 닶XX
	static int field3;		
	
	// 직렬화에서 제외할 필드에는 transient 키워드릴 붙인다!
	transient int field4;
}
