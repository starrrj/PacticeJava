package ch18_inputoutput.objectinputstream_objectoutputstrearm;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialVersionUIDExample1 {
	public static void main(String[] args) throws Exception {
		
		//1. 파일에 출력할 출력스트림 생성
		FileOutputStream fos = new FileOutputStream("C:/Temp/Object.dat");
		
		//2. 객체출력 보조스트림 생성
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//3. 직렬화할 객체 생성(Serializable함)
		ClassC classC = new ClassC();
		classC.field1 = 1;
		
		//4. 객체 출력
		oos.writeObject(classC);
		
		//5. 자원해제
		oos.flush();	oos.close();  fos.close();	
	}
}
