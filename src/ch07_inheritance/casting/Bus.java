package ch07_inheritance.casting;


public class Bus implements Vehicle {

	
	@Override
	public void run() {
		System.out.println("Bus::run() invoked.");
	} // run
	
	public void checkFare() {
		System.out.println("Bus::checkFare() invoked.");
	} //checkFare

} // end class
