package ch18_inputoutput.objectinputstream_objectoutputstrearm;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// 상속과 객체의(역)직렬화의 관계 : (*****)
// (1) 만약 부모 클래스가 Serializable 하면, 자식 클래스가 Not-Serializable해도, 직렬화/역직렬화 가능
// (2) 만약 부모 클래스가 Serializable 하지 않고, 자식 클래스만 Serializable하면, 직렬화/역직렬화 불가능
public class Child 
	extends Parent 
	implements Serializable {
	
	public String field2;
	
	// 객체의 직렬화 수행시, 아래의 메소드를 재정의 하면, 이 메소드가 대신 호출됨
	private void writeObject(ObjectOutputStream out) throws IOException {
		System.out.println("Cild::writeObject(out) invoked.");
		
	   out.writeUTF(field1);	// 직렬화 XX 문자열 읽는메소드
	   out.defaultWriteObject();
	} // writeObject

	// 객체의 역직렬화 수행시, 아래의 메소드를 재정의 하면, 이 메소드가 대신 호출됨
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		System.out.println("Cild::readObject(in) invoked.");
		
	   field1 = in.readUTF(); 	// 역직렬화XX 문자열 읽는 메소드
	   in.defaultReadObject();
	} // readObject
}
