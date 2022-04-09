package ch14_lamda.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	private static List<Student> list = Arrays.asList(
		new Student("홍길동","남자",89),
		new Student("김자바","여자",90),
		new Student("이자바","남자",92),
		new Student("정자바","여자",95)
		);
	
	
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum = 0;
		for(Student student : list) {
			if(predicate.test(student)) { // test에 true가 나오면 if문 실행
				count ++;
				sum += student.getScore();
			}
		}
		return (double)sum / count;
	}

	public static void main(String[] args) {
		// 여자자 평균 점수
		double femaleAvg = avg( t -> t.getSex().equals("여자"));
		System.out.println("여자 평균 점수: " + femaleAvg);
		
		// 남자 평균 점수
		double maleAvg = avg( t -> t.getSex().equals("남자"));
		System.out.println("남자 평균 점수: " + maleAvg);
		
	}
}
