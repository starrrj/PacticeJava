package casting;


// 다형성-1에 의해서, 부모타입의 참조변수에 들어있는, 자식객체의 고유한
// 필드/메소드를 어떻게 사용하는가!?
public class Parent {
	public String field1;
	
	
	public void method1() {
		System.out.println("Parent-method1() invoked.");
	} // method1
	
	public void method2() {
		System.out.println("Parent-method2() invoked.");
	}// method2

}
