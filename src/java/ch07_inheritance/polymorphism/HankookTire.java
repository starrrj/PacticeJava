package ch07_inheritance.polymorphism;


public class HankookTire extends Tire {
	// 1. 필드
	
	// 2. 생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	} // Constructor
	
	// 3. 메소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		
		if(accumulatedRotation< maxRotation) {
			System.out.println(
					location + " Hankook Tire 수명: " +
					(maxRotation-accumulatedRotation) + "회");
			
			return true;
		} else {
		
			System.out.println("***" + location + " Hankook Tire 펑크 ***");
	
			return false;
		} // if - else
	} // roll
} // end class
