package sssample;

public class Example1 {

	public static void main (String[] main) {
		
//		I1 sample = null;
//		
//		sample = (name, age) -> System.out.println("이름은 "+ name + ", 나이는 " + age);
//	
//		sample.method("star",00);
		
		
		I1 tt;
		
		tt = (name, age) -> {
			System.out.println("이름은 "+ name + ", 나이는 " + age);
			return age;
		};
		
		tt.method("Star", 24);
		
		
		
		
		
		
		
		}// main
	}// class
