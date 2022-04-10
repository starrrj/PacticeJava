package ch07_inheritance.polymorphism;


public class CarExample {
	
	public static void main(String[] args) {
		Car car = new Car();
	
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();	// 다형성-2
			switch(problemLocation) {
				case 1 :
					System.out.println("앞왼쪽 HankookTire로 교체");
					// 다형성-1
					car.frontLeftTire = new HankookTire("앞왼쪽", 15);
					
					break;
				case 2 :
					System.out.println("앞오른쪽 KumhoTire로 교체");
					// 다형성-1
					car.frontRightTire = new KumhoTire("앞오른쪽", 13);
					
					break;
				case 3 :
					System.out.println("뒤왼쪽 HankookTire로 교체");
					// 다형성-1
					car.backLeftTire = new HankookTire("뒤왼쪽", 14);
					
					break;
				case 4 :
					System.out.println("앞오른쪽 KumhoTire로 교체");
					// 다형성-1
					car.backRightTire = new KumhoTire("뒤오른쪽", 17);
					
					break;
			} // switch
			
			System.out.println("---------------------------------------------");
		} // for
	} // main
} // class

