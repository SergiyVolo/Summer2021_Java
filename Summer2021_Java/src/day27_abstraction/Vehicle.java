package day27_abstraction;

public abstract class Vehicle extends Transportation {
	
	public abstract void start();
	public abstract void accelerate();
	public abstract void brake();
	public abstract void stop();
	
	public static void putGas() {
		System.out.println("Putting gas");
	}
}
