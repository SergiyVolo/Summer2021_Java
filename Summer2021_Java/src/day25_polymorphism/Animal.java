package day25_polymorphism;

public class Animal {
	
	String type;
	
	public static void sleep() {
		System.out.println("Animal is sleeping");
	}

	public Animal makeSound() {
		System.out.println("Animal is making sound");
		return new Animal();
	}

	@Override                                   // annotation
	public String toString() {
		return "Animal [type=" + type + "]";
	}
}

