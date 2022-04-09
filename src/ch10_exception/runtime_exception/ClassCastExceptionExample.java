package ch10_exception.runtime_exception;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Animal animal = new Dog();
		Dog dog = (Dog) animal;
		
		Cat cat = (Cat) animal;
	}

}
//
//class Animal {;;}
//class Dog extends Animal {;;}
//class Cat extends Animal {;;}