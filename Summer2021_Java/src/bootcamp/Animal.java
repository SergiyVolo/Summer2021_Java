package bootcamp;

public class Animal {
	
	public void makeSound() {
		System.out.println("Animal is making sound");
	}
	
	public int makeSound(String sound) {
		System.out.println("Animal is making sound " + sound);
		return 0;
	} 
	
	public void move() {
		System.out.println("Animal is moving");
	} 
	
	public static void sleep() {
		System.out.println("Animal is sleeping");
	}

}

