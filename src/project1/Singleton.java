package project1;


	
	
// 아래의 클래스는, 소외 'Singleton Design Pattern`에 의해 설계된 클래스
// 목적 : 자바 APP이 살아있는 동안, 힙 영역에 단 한번만 생성되는 객체를 만들기위함
public class Singleton {
		private static Singleton obj;
		// 각종 데이터를 필드로 저장
		
		static {
			obj = new Singleton();
		}
		
		private Singleton() {	// private으로 해서, 외부에서는 보이지않게 캡슐화
			;;
		} // default constructor
		
		static Singleton getInstance() {
			return obj;
		} // getInstance
}
