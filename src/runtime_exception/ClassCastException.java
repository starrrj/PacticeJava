package runtime_exception;


public class ClassCastException {
	
	public static void main(String[] args) {
		Dog dog = new Dog();		// Dog 객체 생성
		ClassCastException.changeDog(dog);	// 메소드 호출(자식객체를 전달)
		
		Cat cat = new Cat();		// Cat 객체 생성
		ClassCastException.changeDog(cat);	// 메소드 호출(자식객체를 전달)
	} // main
	

	// 매개변수의 타입이 상속관계에서 "부모"타입으로 선언
	public static void changeDog(Animal animal) { 	// 매개변수에서 다형성-1 발생
		if(animal instanceof Dog) {		// animal이 Dog으로 부터 생성된 인스턴스객체)냐! true 
		//다형성-1의 상태에서, 자식객체를 "강제"로 끄집어 냄!
		Dog dog = (Dog) animal;						// ClassCastException 발생 가능
		} else {
			System.out.println("Dog으로 변환이 어렵습니다.");
		}
	} // changeDog
} // end class
	

class Animal {;;}
class Dog extends Animal {;;}
class Cat extends Animal {;;}
// Stack Trace <- 예외 메세지
// 가장 중요한건 예외의 이름. 예외의 이름을 먼저 캐치해라 심플네임이 중요
// 1. 예외 이름읽기 : java.lang.ClassCastException
// 2. 설명읽기 : class runtime_exception.Cat cannot be cast to class runtime_exception.Dog 
// 				(runtime_exception.Cat and runtime_exception.Dog are in unnamed module of loader 'app')
// 3. at 은 아래에서부터 위로 : at runtime_exception.ClassCastException.changeDog(ClassCastException.java:19) 
//								ClassCastException.java 파일 내의 19번째줄