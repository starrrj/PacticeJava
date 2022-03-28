package genericEx.generic_method2;

public class CompareMethodExample {

	public static void main(String[] args) {
		Pair<Integer,String> p1 = new Pair<> (1,"사과");
		Pair<Integer,String> p2 = new Pair<> (1,"사과");
		
//		Util.<Integer,String>compare(p1,p2);
		boolean result1 = Util.compare(p1,p2);
		if(result1) {
			System.out.println("p1,2 = 논리적으로 동등한 객체입니다.");
		}else {
			System.out.println("p1,2 = 논리적으로 동등하지 않는 객체입니다.");
		}
		
		
		Pair<String,String> p3 = new Pair<> ("java1","오예");
		Pair<String,String> p4 = new Pair<> ("java2","우우");
		
//		Util.<Integer,String>compare(p1,p2);
		boolean result2 = Util.compare(p3,p4);
		if(result2) {
			System.out.println("p3,4 = 논리적으로 동등한 객체입니다.");
		}else {
			System.out.println("p3,4 = 논리적으로 동등하지 않는 객체입니다.");
		}
	}

}
