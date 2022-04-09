package genericEx.multi_type_parameter;

public class ProductExample {

	public static void main(String[] args) {
		
		// 제네릭타입 클래스의 인스턴스 생성(so, 구체타입 전달해야 함!!!)
//		product<Tv, String> product1 = new Product<Tv,String>();
		Product<Tv, String> product1 = new Product<>();
		
		product1.setKind(new Tv());					//Setter 호출
		product1.setModel("스마트Tv");				//Setter 호출

		Tv tv = product1.getKind();					//Getter 호출
		String tvModel = product1.getModel();		//Getter 호출
		
		System.out.println("product1: "+ product1);
		
//		---
		
//		Product<Car, String> product2 = new Product<Car, String>(); 
		Product<Car, String> product2 = new Product<>();
		
		product2.setKind(new Car());
		product2.setModel("디젤");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		System.out.println("product2: "+ product2);
		
	} // main

} // end class
