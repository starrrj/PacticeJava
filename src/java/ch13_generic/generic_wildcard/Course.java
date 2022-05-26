package ch13_generic.generic_wildcard;


// 제한된 타입파라미터 중, 와일드 카드(?)를 이해하기 위한 예제
public class Course <T> {		// 학원의 모든 과정을 대표하는 클래스
	private String name;		// 과정명
	private T[] students;		// 수강생
								// 필드의 타입이 배열인데, T타입의 배열임
	
	public Course(String name, int capacity) {	// 과정명과 수용가능인원을 받음
		this.name = name;		// 필드 초기화
		
		// 제네릭 타입파라미터 배열 생성은 아래와 같이 해야 합니다!!(***)
		// 2단계로 배열을 생성합니다.
		// Step.1: 우선, Object 타입의 원소를 가지는 배열을 생성합니다.
		// Step.2: 강제형변환을 통해서, 배열의 원소가 T인 배열로 변환합니다.
//		students = new T[];  // XXX
		students = (T[]) (new Object[capacity]);
	} // constructor
	
	public String getName() { return name; }		// Getter
	public T[] getStudents() { return students; }	// Getter
	
	public void add(T t) {	// 사강생을 모집할 때 마다, 학생배열에 추가
		for(int i=0; i<students.length; i++) {
			
			if(students[i] == null) {
				students[i] = t;
				
				break;
			} // if
		} // for
	} // add

} // end class
