package genericEx.generic_wildcard;


import java.util.Arrays;
import lombok.ToString;


@ToString
public class WildCardExample {
	
	// 모든 사람이 들을 수 있는 일반인 과정 등록 메소드
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "수강생: " + 
							Arrays.toString(course.getStudents()));
	} // personCourse
	
	// 학생만을 대상으로 하는 학생과정 등록 메소드
	public static void registerCourseStudent(Course<? extends Student > course) {
		System.out.println(course.getName() + "수강생: " + 
							Arrays.toString(course.getStudents()));
	} // StudentCourse
	
	// 재직자를 대상으로 하는 등록 메소드
	public static void registerCourseWorker(Course<? super Worker > course) {
		System.out.println(course.getName() + "수강생: " +
							Arrays.toString(course.getStudents()));
	} // WorkerCours
	
	public static void main(String[] args) {
		Course<Person> personCourse = new Course<> ("일반인 과정",5);
		personCourse.add(new Person("일반인"));
		personCourse.add(new Person("직장인"));
		personCourse.add(new Person("학생"));
		personCourse.add(new Person("고등학생"));
		
		Course<Worker> workerCourse = new Course<>("직장인과정",5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<>("학생과정",5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new HighStudent("고등학생"));
		
		Course<HighStudent> HighStudentCourse = new Course<>("고등학생과정",5);
		HighStudentCourse.add(new HighStudent("고등학생"));	
						
		registerCourse(personCourse);
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(HighStudentCourse);
		System.out.println();
		
//		registerCourseStudent(personCourse);
//		registerCourseStudent(workerCourse);
		registerCourseStudent(studentCourse);
		registerCourseStudent(HighStudentCourse);
		System.out.println();
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
//		registerCourseWorker(studentCourse);
//		registerCourseWorker(HighStudentCourse);
		System.out.println();
		
	}
}
