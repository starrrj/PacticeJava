package polymorphism;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Car {

	// 1. 부품필드 (집합관계)
	Tire frontLeftTire = new Tire("앞 왼쪽", 6);  // (위치, 최대회전수)75
	Tire frontRightTire = new Tire("앞 오른쪽", 2);
	Tire backLeftTire = new Tire("뒤 왼쪽", 3);
	Tire backRightTire = new Tire("뒤 오른쪽",4);
	
	//2. 생성자
	// 생성자 없으니 lombok 적용
	
	//3. 메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		
		if(frontLeftTire.roll()==false) { stop(); return 1 ; };
		if(frontRightTire.roll()==false) { stop(); return 2; };
		if(backLeftTire.roll()==false) { stop(); return 3; };
		if(backRightTire.roll()==false) { stop(); return 4; };
		
		return 0;
	} // run
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	} // stop
	
} // end class
