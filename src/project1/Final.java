package project1;

public class Final {

		final String nation = "Korea";
		final String ssn;
		String name;
//						매개변수에도 final 가능-> 값을 고치지못하게 보호, 읽기전용
		public Final(String ssn, String name) {
			this.ssn = ssn;
			this.name = name;
		} // constructor
}
