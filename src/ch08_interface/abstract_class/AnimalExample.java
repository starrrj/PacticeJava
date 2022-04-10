package ch08_interface.abstract_class;

import ch08_interface.abstract_method.Animal;
import ch08_interface.abstract_method.Cat;
import ch08_interface.abstract_method.Dog;

public class AnimalExample {

	public static void main(String[] args) {
		//1. 자식객체 생성
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		//2. 가ㅓㄱ자식객체가 구현한 소리를 발생시킴
		dog.sound();	// 자식객체의 메소드를 단순호출 (다형성? 없음)
		cat.sound();	// 자식객체의 메소드를 단순호출 (다형성? 없음)
		
		System.out.println("--사용(이용)관계로써, 자식객체 활용--");
		
		// 변수의 자동 타입 변환
		Animal animal = null;		// 부모타입 변수 선언
	
		animal = new Dog();			// 다형성 -1
		animal.sound();				// 다형성 -2
		
		animal= new Cat();
		animal.sound();
		
		System.out.println("----");
		
		//매개변수의 자동 타입 변환, 매개변수의 다형성을 통한 구현
		animalSound(new Dog());
		animalSound(new Cat());
	} // main
		
	public static void animalSound(Animal animal) {	// Animal animal = new Dog();
		animal.sound();		// 다형성-2
	} // animalSound
		
	} // end class
