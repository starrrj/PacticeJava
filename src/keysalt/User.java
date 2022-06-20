package etc;

import java.security.MessageDigest;
import java.security.SecureRandom;

public class User {
	
	private static final int SALT_SIZE = 16;
	private static DB db = new DB();
	
	// 새 계정 만들기
	public void set_User(String ID, byte[] password) throws Exception {
		String SALT = getSALT();
		db.set_USER(ID, Hashing(password, SALT), SALT);
	} // set_User
	
	// 유저 정보와 대조 후 로그인 하기
	public void get_User(String ID, byte[] password) throws Exception {
		String temp_salt = db.get_Salt(ID);
		
		String temp_pass = Hashing(password, temp_salt);
		
		if(db.check(ID, temp_pass)) {
			System.out.println("login succeeded.");
		} else {
			System.out.println("login denied.");
		} // if-else
	} // get_User

	private String Hashing(byte[] password, String salt) throws Exception {
		MessageDigest md = MessageDigest.getInstance("SHA-256");	// SHA-256 해시함수를 사용
		
		// 단방향 해시함수만 사용했을 때의 문제점
//		String temp = Byte_to_String(password);
//		md.update(temp.getBytes());
//		password = md.digest();
		
		// 솔트 + 키스트레칭을 사용한 암호화
		// 무작위로 생성된 16진수 salt를 패스워드에 붙인 값을 다시 해시함수에 넣고 돌리는 과정 반복
		// 같은 패스워드여도 다른 암호화값이 나옴
		for(int i=0; i<100; i++) {
			String temp = Byte_to_String(password) + salt;	// 패스워드와 salt를 합친 새 문자열 생성
			md.update(temp.getBytes()); 	// temp의 문자열을 해싱해서 md에 저장
			password = md.digest(); 		// md객체의 다이제스트를 얻어 password에 갱신
		} // for
		
		return Byte_to_String(password);
	} // Hashing
	
	// SALT 값 생성
	private String getSALT() throws Exception {
		SecureRandom rnd = new SecureRandom();
		byte[] temp = new byte[SALT_SIZE];
		rnd.nextBytes(temp);
		
		return Byte_to_String(temp);
	} // getSALT
	
	// 바이트 값을 16진수로 변경
	private String Byte_to_String(byte[] temp) {
		StringBuilder sb = new StringBuilder();
		
		for(byte a : temp) {
			sb.append(String.format("%02x", a));
		} // for
		
		return sb.toString();
	} // Byte_to_String
	
	// DB내용 출력
	public void get_DB() {
		System.out.println("\n=============DB출력=============\n");
		System.out.println(db);
	} // get_DB

} // end class
