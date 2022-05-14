package ch13_generic.generic_extends_implements;

public class ChildProductAndStorageExample {

	
	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		
		product.setKind(new Tv());
		product.setModel("smartTV");
		product.setCompany("samsung");
		
//		-------------
		
		Storage<Tv> storage = new StorageImpl<>(100);
		storage.add(new Tv(), 0);
		
		Tv tv = storage.get(0);
		
		System.out.println("- storage: " + storage);
	} // main

} // end class
