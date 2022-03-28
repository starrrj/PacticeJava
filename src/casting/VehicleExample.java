
package casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); 	// 다형성 -1
		
		vehicle.run(); 					// 다형성-2
//		vehicle.checkFare();			// XX 부모품에 안겨서 자식메서드는 보이지않음
		
//		---
		
		if(vehicle instanceof Bus bus) {
//			Bus bus = (Bus) vehicle;		// 강제(타입)형변환
			
			bus.run();						// 다형성-2가 아님! 그냥호출
			bus.checkFare();
		} // if
		
		Bus bus = (Bus) vehicle;		// 강제(타입)형변환
		
		

	} // main

} // class
