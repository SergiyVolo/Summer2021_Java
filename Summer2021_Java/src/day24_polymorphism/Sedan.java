package day24_polymorphism;

public class Sedan extends Car {
	
	int tankCapacity = 10;
	double breakingDistance = 30;

	public Sedan() {
		// super();
		this(5);
		System.out.println("Sedan's constructor");
	}
	
	public Sedan(int gallons) {
		System.out.println("Sedan's constructor that accepts int");
	}
	
	public void testMethod() {
		System.out.println("Sedan's tank capacity " + this.tankCapacity);
		System.out.println("Car's tank capacity " + super.tankCapacity);
	}
	
	
}
