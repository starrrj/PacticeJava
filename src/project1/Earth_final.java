package project1;

public class Earth_final {
	
	//필드
	static final double EARTH_RADIUS = 600;
	static final double EARTH_SURFACE_AREA;
	// initializer에서 초기화하려고 
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	} // static initializer
	
	void instancMethod() {
		final int temp = 0;        // 값을 못바꾸게 하려고 final
	}// instanceMethod
} // class
