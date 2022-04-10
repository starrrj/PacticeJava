package ch08_interface.method_polymorphism;


public class Bus implements Vehicle {

	@Override
	public void run() {
		System.out.println("Bus::run() invoked.");

	}

}
