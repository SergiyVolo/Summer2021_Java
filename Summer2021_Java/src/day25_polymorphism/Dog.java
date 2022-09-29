package day25_polymorphism;

public class Dog extends Animal {
	
	public void chaseCat() {
		System.out.println("Dog is chasing Tom");
	}

	public Dog makeSound() {
		System.out.println("Dog is barking");
		return new Dog();
	}
	
	public static void sleep() {
		System.out.println("Dog is sleeping");
	}
}
