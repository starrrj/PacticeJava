package project1;

public class Car5 {
	int speed; 			// instance feld
	
	void run() {
		System.out.println(speed+ "으로 달립니다.");
	} //run
	
	public static void main(String[] args) {
		Car5 myCar = new Car5();
		
		myCar.speed = 50;
		myCar.run();
		
	}
}
