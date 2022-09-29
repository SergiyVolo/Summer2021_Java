package bootcamp;

public class Farm {

	public static void main(String[] args) {

		Dog dog1 = new Dog();
		dog1.makeSound();
		dog1.makeSound(true);

		// visibility // implementation
		Dog dog2 = new Dog();
		dog2.move();

		Animal animal1 = new Animal();
		animal1.move();

		// visibility
		Animal animal2 = new Dog();
		animal2.move();

		Animal animal3 = new Dog();
		animal3.sleep();

	}

	public static void main() {

	}

}
