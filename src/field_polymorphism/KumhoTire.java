package field_polymorphism;


public class KumhoTire implements Tire {

	@Override
	public void roll() {
		System.out.println("KumhoTire::roll() invoked."); // 구현부가 있을 땐 추상메서드X abstractX
	}
}
