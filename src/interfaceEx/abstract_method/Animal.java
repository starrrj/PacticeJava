package interfaceEx.abstract_method;

// 추상클래스를 통해, 적어도 "동물"이라면, 반드시 가져야 할 속성과 기능(행위)를
// 필드와 메소드로 선언하여, 이를 규격화해서 상속받는 클래스가 반드시
// 이규격을 지키도록해줌(어떻게? 수단이? ----> 추상메소드)

public abstract class Animal {
	public String kind;
	
	public void brathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// "추상메소드" (abstract method) : 메소드의 시그니처만 있고, 구현부({})가 없음
	// 이 추상클래스를 상속받는 모든 자식클래스에서는, 이 추상메소드를 반드시
	// 구현(즉, 메소드 오버라이딩(재정의)) 해야함!
	// 만일 구현하지않으면 해당 자식클래스조차 추상클래스가 되어야함
	// 아니면 컴퓨일 오류발생
	public abstract void sound();
}
