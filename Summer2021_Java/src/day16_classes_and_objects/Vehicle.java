package day16_classes_and_objects;

public class Vehicle {
	
	// blueprint for creation of all the vehicle objects
	
		int hp;
		String brand;
		String color;
		double price;
		int wheels;
		
		
		public void accelerate() {
			System.out.println(brand + " accelarating with " + hp + " horse power.");
		}
		
		public void drive() {
			System.out.println("Driving on a scenic route");
		}
		
		public void stop() {
			System.out.println("Pulled over for speeding!");
	}
	
	public void park() {
		System.out.println("Parked on my driveway!");
	}
	

}
