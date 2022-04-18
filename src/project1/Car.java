package project1;

public class Car {

	int gas;  // 필드
	
	//생성자(Default Constructor created by JAVA compiler)
	
	// 메소드
	void setGas(int gas) {		// 연료주입
		this.gas = gas;
	}// setGas
	
	boolean isLeftGas() {		// 연료가 남아있느냐!!
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	} // isLeftGas
	
	
	void run() {			// 달려라 !!!
		while(true) {		// 무한루프를 만들면, 반드시 먼저 탈출조건을
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량: )" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량: )" + gas + ")");
				
				return;
			} //if-else
		}// while
	} // run
} // end class