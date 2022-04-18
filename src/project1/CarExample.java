package project1;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();	// 1. 인스턴스(=객체) 생성
		
		myCar.setGas(5); 	// 2. Car의 setGas() 메소드 호출
		
		boolean gasState = myCar.isLeftGas(); // 3. Car의 isLeftGas()호출
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run(); // 4. Car의 run() 메소드 호출
		} // if
		
		if(myCar.isLeftGas()) {	// 5. Car의 isLeftGas() 메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		} // if
	} // main
} // end class
