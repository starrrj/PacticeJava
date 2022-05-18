package ch18_inputoutput.datainputstream_dataoutputstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.dat"); // byte 기반
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("김자바");
		dos.writeDouble(93.3);
		dos.writeInt(2);
		
		dos.flush();
		
		// 근간이 되는 스트림과 보조스트림을 자원해제할 때에는,
		// 순서대로 합니다: (1) 보조스트림 헤제하고 > (2) 근간 스트림 해제
		dos.close();
		fos.close(); // lombok @CleanUp 사용시 순서는 확실하지 않아서(순서지정이없다) try-with-resource 사용
		
//		---
		
		FileInputStream fis = new FileInputStream("C:/Temp/primitive.dat"); // byte 기반
		DataInputStream dis = new DataInputStream(fis);
	
		for(int i=0; i<2; i++) {
			System.out.println();
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
			// 바이너리데이터파일은 순서를 알 수 가 없다. -> 그 순서대로 읽어야한다.
			// 읽는 것, 쓰는 것도 처음부터 시작! 값을 망가지지않게 하기 위해
			
			System.out.println(name + " : " + score + " : " + order);
		} // for
		
		dis.close(); fis.close();
	}
		
}

