package etc;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DB {
	
	// 암호에 1234
	// 1234
	// 단방향 해시함수를 
	// 1. 
	// 2. 키스트레칭 + 솔트
	
//	private static List<String[]> userData = new ArrayList<>();
	private static Map<String, String[]> userData = new HashMap<>();
	
	// 유저 생성
	public void set_USER(String ID, String Hashing_password, String SALT) {
		if(userData.containsKey(ID)) {
			System.out.println("이미 존재하는 아이디입니다.");
			
			return;
		} // if
		
		String[] temp = {Hashing_password, SALT};
		userData.put(ID, temp);
	} // set_USER
	
	// 로그인 데이터 체크
	public boolean check(String ID, String Hashing_password) {
		for(int i=0; i<userData.size(); i++) {
			if(userData.containsKey(ID)) {		// ID 일치 확인
				if(Hashing_password.equals(userData.get(ID)[0])) {	// Hashing password 일치 확인
					
					return true;
				} // if
			} // if
		} // for
		
		return false;
	} // check
	
	// 해당 ID의 SALT값 반환
	public String get_Salt(String ID) {
		String err = null;
		
		for(int i=0; i<userData.size(); i++) {
			if(userData.containsKey(ID)) {
				return userData.get(ID)[1];
			} // if
		} // for
		
		return err;
	} // get_SALT
	
	// DB 내용 출력
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(Entry<String, String[]> elem : userData.entrySet()){
		     sb.append("ID : " + elem.getKey() + " Password : " + elem.getValue()[0] + " SALT : " + elem.getValue()[1] + "\n");
		} // enhanced for
		
		return sb.toString();
		
	} // toString
} //end class
