package day24_polymorphism;

public class Car extends Vehicle {
	
	int tankCapacity = 7;
	double breakingDistance = 20;

	public Car() {
		System.out.println("Car's constructor");
	}
	
	public Car(int gallons) {
		System.out.println("Car's constructor");
	}
	
	public Car(String type) {
		
		System.out.println("Car's constructor");
	}
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		Bus bus1 = new Bus();
		
		System.out.println("=====================");
		
		Sedan sedan1 = new Sedan();
		sedan1.testMethod();
		
	}
}
