package system_in;

import java.io.InputStream;

public class SystemInExample2 {

	public static void main(String[] args) throws Exception {
		InputStream is = System.in; // 잘 활용하면, scanner 사용X
		
		// 영문/숫자를 입력받기 위한 배열이라면, 100문자를 입력받을 수 있지만,
		// 한글은 자바언어에서 2바이트로 표현되기 때문에, 배열크기의 절반인 최대 50문자
		// 의 한글을 입력받을 수 있음.
		byte[] datas = new byte[100]; // 바가지를 이전과는 틀리게 약간 크게 만듦
		
		System.out.println("이름: ");	// Prompt 메시지 출력
		int nameBytes = is.read(datas);	// 바가지로 읽어요.
		
		// 최종사용자가 키보드에서 여러문자를 입력한 이후, 마지막으로 엔터키를 치면
		// read() 메소드가 읽음. 읽은 바이트 배열에 있는 키코드값을 가지고
		// String 클래스의 생성자를 이용해서, 문자열로 다시 디코딩 수행
		String name = new String(datas, 0, nameBytes-2); //왜 -2를 할까? -> enter(2byte)를 읽어서 -2로 제외시켜줌
		// 엔터 = 10,13 /  carrige? 블록킹되어있던 리드가 읽는다
		//  Enter의 아스키 코드값을 \r\n을 기준으로 13 10으로 설명하겠습니다.
		// \r이 13이고 \n이 10이기 때문입니다. 
		
		
		System.out.println("하고 싶은 말: ");	// Prompt 메시지 출력
		int commentBytes = is.read(datas);		// 바가지로 읽어요.
		String comment = new String(datas, 0, commentBytes-2);
		
		System.out.println("입력한 이름: " + name);
		System.out.println("입력한 하고 싶은말: " + comment);

	}

}
