package day16_classes_and_objects;

public class Dog {

	String breed;
	String color;
	int weight;
	Boolean isFriendly;
	
	public void bark() {
		System.out.println("Barking at other dogs.");
	}
	
	public void chase() {
		System.out.println("Chasing squirrels.");
	}
	
	public void sleeps() {
		System.out.println("Sleeps all day.");
	}	
	
	public void notChase() {
		System.out.println("Not chasing anything.");
	}
}
