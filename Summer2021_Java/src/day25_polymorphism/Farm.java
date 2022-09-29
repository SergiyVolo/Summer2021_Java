package day25_polymorphism;

public class Farm {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal();
		animal1.makeSound();
		
		Animal cat1 = new Cat();
		cat1.makeSound();
//		cat1.chaseMouse();   // animal can't see cat's methods
		
		Animal dog1 = new Dog();
		dog1.makeSound();
//		dog1.chaseCat();     // animal can't see dog's methods

		
//		Animal cat2 = new Cat();
		Animal.sleep();
		
//		Cat cat3 = new Cat();
		Cat.sleep();
		
		Animal dog2 = new Dog();
		dog2.sleep();
		
		Dog dog3 = new Dog();
		dog3.sleep();
		
	}
}
