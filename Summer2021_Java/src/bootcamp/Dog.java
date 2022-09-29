package bootcamp;

public class Dog extends Animal {

	public void makeSound(boolean isSleepy) {
		if(isSleepy) {
			System.out.println("Animal is not making a sound");
		}
	}
	
	@Override
	public void move() {
		System.out.println("Moving and barking");
	}
	

	public static void sleep() {
		System.out.println("The dog is sleeping");
	}
}
