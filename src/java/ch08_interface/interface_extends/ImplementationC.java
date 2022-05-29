package ch08_interface.interface_extends;

public class ImplementationC implements InterfaceC{
	
	// 다중상속된 인터페이스의 추상메서드를 모두 호출 하지 않으면, 오류 발생
	// The type ImplementationC must implement the inherited abstract method InterfaceA.methodA()
	// 왜 빠뜨렸냐!!! 추가해라!!

	@Override
	public void methodA() {
		System.out.println("ImplementationC::methodA() 실행");
		
	} //methodA

	@Override
	public void methodB() {
		System.out.println("ImplementationC::methodB() 실행");
		
	}//methodB

	@Override
	public void methodC() {
		System.out.println("ImplementationC::methodC() 실행");
		
	}//methodC

} // class
