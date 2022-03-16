
public class DataTypeEx1 {

	public static void main(String[] args) {
		// 문자열은 리터럴로 입력
		char c1 = 'A'; // 문자를 직접 저장
		char c2 = 65; // keycode ,십진수로 저장
		char c3 = '\u0041'; // 16진수로 저장 \ u 유니코드, 거의없다. 보안솔루션
						
		char c4 = '가'; // 문자를 직접 저장
		char c5 = 44032; // 십진수로 저장
		char c6 = '\uac00'; // 16진수로 저장
				
		int uniCode = c1; // 유니코드 얻기 4byte => c1 = 65
				
		System.out.println(c1);       // A
		System.out.println(c2);       // A
		System.out.println(c3);       // A , 에러 -> ("C3:" + c3);
		System.out.println(c4);       // 가
		System.out.println(c5);       // 가
		System.out.println(c6);       // 가
		System.out.println(uniCode);  // 65
				

	}

}
