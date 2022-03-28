package interfaceEx.interface_extends;

public class Example {

	public static void main(String[] args) {
		
		ImplementationC impl = new ImplementationC();	// 구현객체 생성
		
		InterfaceA ia = impl;		// 다형성-1 (부모: InterfaceA)
		ia.methodA();				// 다형성-2
		System.out.println();
		
//		---
		
		InterfaceB ib = impl;		// 다형성-1 (부모: InterfaceB)
		ib.methodB();				// 다형성-2
		System.out.println();
		
//		---
		
		InterfaceC ic = impl;		// 다형성-1 (부모: InterfaceC)
		ic.methodA();				// 다형성-2
		ic.methodB();				// 다형성-2
		ic.methodC();				// 다형성-2
	}
}
