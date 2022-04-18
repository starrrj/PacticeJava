package project1;

public class TelebvisionExample {
	
	public static void main (String[] args) {
		
		// 대전제2 : 정적멤버(필드, 메소드)는 정적멤버답게 사용하라!!
		System.out.println(Television.info);
		
		
		Television obj = new Television();
		System.out.println(obj.info);   //워닝 -> 클래스이름 . 필드
		}

}
