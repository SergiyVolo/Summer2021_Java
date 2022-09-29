package day27_abstraction;

public class Car extends Vehicle implements Convertible, Chargeable {
	
	public String make;
	
	public Car(String make) {
		this.make = make;
	}

	@Override
	public void start() {
		System.out.println("The car is starting");
		
	}

	@Override
	public void accelerate() {
		System.out.println("The car is accelarating");
		
	}

	@Override
	public void brake() {
		System.out.println("The car is braking");
		
	}

	@Override
	public void stop() {
		System.out.println("The car has stopped");
		
	}

	@Override
	public void move() {
		System.out.println("We are driving a car");
	}

	@Override
	public void openRoof() {
		System.out.println("Opening roof");	
	}

	@Override
	public void closeRoof() {
		System.out.println("Closing roof");
	}

	@Override
	public void charge() {
		System.out.println("Charging for " + Chargeable.TIMETOCHARGE);
	}
}

