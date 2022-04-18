package project1;

public class SingletonExample {

	public static void main(String[] args) {
		

	 for(int i=0; i<10; i++) {
		 Singleton obj = Singleton.getInstance();
		 System.out.println(obj);
	
	} // for
	 
	 Singleton obj1 = Singleton.getInstance();
	 Singleton obj2 = Singleton.getInstance();
	
//	assert obj1 == obj2;
//	
//	System.out.println("OK");
//			
	}
}
