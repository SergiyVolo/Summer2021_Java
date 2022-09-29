package day25_polymorphism;

public class Cat extends Animal {
	
	public final void chaseMouse() {
		System.out.println("Cat is chasing Jerry");
	}

	@Override
	public Cat makeSound() {
		System.out.println("Cat is meowing!");
		return new Cat();
	}
	
	public static void sleep() {
		System.out.println("Cat is sleeping");
	}
}
