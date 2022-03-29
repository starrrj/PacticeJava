package lamdaEx.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample2 {
	// 여러 요소를 목록으로 보관하는 타입: List
	private static List<Student> list = Arrays.asList( // list 가 컬렉션
			new Student("홍길동", 90, 96),
			new Student("김자바", 95, 93)
	);
	
	
	public static double avg (ToIntFunction<Student> function) { 
		int sum = 0;
		for(Student student : list) {
			sum += function.applyAsInt(student);
		}
		double avg = (double)sum / list.size(); // list가 갖고있는 객체 수
		return avg;
	} //printString
	
	
	public static void main(String[] args) {
		double englishAvg = avg( t -> t.getEnglishScore());
		System.out.println("영어 평균 점수: " + englishAvg);
		
		double mathAvg = avg( t -> t.getMathScore());
		System.out.println("수학 평균 점수: " + mathAvg);
		
	}	
}
