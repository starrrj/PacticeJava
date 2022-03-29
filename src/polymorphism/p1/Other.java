package polymorphism.p1;

public class Other {
	
	
	Other() {
		// 사용관계
		Parent parent = new Parent();
		System.out.println(parent.name);
		parent.parentMethod();
		
		// 호출메소드는 상속된 것이 아니다.
//		this.parentMethod();	// XX : 상속관계가 없기때문에, 메소드호출은 참조변수로만 가능
//		super.parentMethod();   // XX : 부모자식 관계 자체가 없기 때문에
	} // default constructor
	
	
	void otherMethod() {
		
		Parent parent = new Parent();
		System.out.println(parent.name);
		parent.parentMethod();
		
		// 호출메소드는 상속된 것이 아니다.
//		this.parentMethod();	// XX : 상속관계가 없기때문에, 메소드호출은 참조변수로만 가능
//		super.parentMethod();   // XX : 부모자식 관계 자체가 없기 때문에
//		
	} //otherMethod
	
} // end class
