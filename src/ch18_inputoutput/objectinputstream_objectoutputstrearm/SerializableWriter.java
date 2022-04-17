package ch18_inputoutput.objectinputstream_objectoutputstrearm;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableWriter {
	public static void main(String[] args) throws Exception {
		// 1.  필드에 대한 출력스트림 생성
		FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
		
		// 2. 객체를 파일에 출려가기 위한, 객체출력보조스트림 생성
		ObjectOutputStream oos = new ObjectOutputStream(fos);		
		// 3. 직렬화할 객체를 생성하고, 필드값을 초기화
		ClassA classA = new ClassA();
		classA.field1 = 1;			
		classA.field2.field1 = 2;	// 부품관계의 필드도 같이 따라서 직렬화 될까?
		classA.field3 = 3;			// 정적필드는 직렬화에서 제외
		classA.field4 = 4;			// transient 필드도 직렬화에서 제외
		
		// 4. 파일에 객체를 출력(직렬화 발생)
		oos.writeObject(classA);
		
		// 5. 자원정리
		oos.flush();	oos.close(); fos.close();	
	}
}
