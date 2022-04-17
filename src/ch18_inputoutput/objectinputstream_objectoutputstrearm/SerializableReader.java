package ch18_inputoutput.objectinputstream_objectoutputstrearm;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableReader {
	public static void main(String[] args) throws Exception {
		System.out.println();
		
		
		// 1. 객체가 저장된 파일에 대한 입력스트립 생성
		FileInputStream fis = new FileInputStream("C:/Temp/Object.dat");
		
		// 2. 객체 입력 보조스트림 생성
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		// 3. 보조스트림을 통해, 파일에 저장된 객체의 복원(이때,"역직렬화" 수행되ㅏㅁ)
		ClassA v = (ClassA) ois.readObject(); // 다형성-1로 변환된 객체로부터, 원래 자식객체 강제로 빼낸다.		
		// 4. 과연 복원된 객체의 다양한 유형의 필드값은 잘 복원 될까 확인
 		System.out.println("field1: " + v.field1);
		System.out.println("field2.field1: " + v.field2.field1);
		System.out.println("field3: " + v.field3);
		System.out.println("field4: " + v.field4);
	}
}
