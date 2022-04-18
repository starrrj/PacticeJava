package project1;

public class Car_instance_member {

	// 1. 인스턴스 필드
	String model;
	int speed;
	
	// 2. 생성자 : 인스턴스 필드의 초기화를 담당
	Car_instance_member(String model) {
		this.model = model;
	}
	
	//3. 인스턴스 메소드
	void setSpeed(int speed) {  // 메소드 이름 'set' + 필드이름 =>  Setter 메소드 / 현재필드값을 정하는
		this.speed = speed;
	}// setSpeed
	
	//4. 인스턴스 메소드
	int getSpeed() {			// 메소드 이름 'set' + 필드이름 =>  getter 메소드 / 현재필드값 되돌려
		return this.speed;
	}
	
	//4. 인스턴스 메소드
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model+ "가 달립니다.(시속:"+this.speed + "km/h");
		}// for
	}//run
	
}
