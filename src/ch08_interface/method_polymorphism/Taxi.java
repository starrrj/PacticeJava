package ch08_interface.method_polymorphism;


public class Taxi implements Vehicle {

	@Override
	public void run() {
		System.out.println("Taxi::run() invoked.");
		
	} //run
	
} // class
