package ch13_generic.generic_extends_implements2;


public class ChildProductAndStorageExample {

	public static void main(String[] args) {
		Childproduct<Tv,String,String> product = new Childproduct<>();
		product.setKind(new Tv());
		product.setModel("SmartTV");
		product.setCompany("Samsung");
		
		// 인터페이스타입 = 구현클래스 
		// Tv라고하는 객체를 저장할 수 있는 구현객체를 만들어서 인터페이스에 저장. 100대까지 저장
		Storage<Tv> storage = new StorageImpl<Tv>(100); 
		storage.add(new Tv(), 0); 
		Tv tv = storage.get(0);
		
	}
}
