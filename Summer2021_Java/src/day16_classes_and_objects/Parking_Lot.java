package day16_classes_and_objects;

public class Parking_Lot {

	public static void main(String[] args) {
	
		// Object 1
				Vehicle vehicle1 = new Vehicle();
				vehicle1.brand = "Cadillac";
				vehicle1.color = "Black";
				vehicle1.hp = 1000;
				vehicle1.price = 50000;
				
				System.out.println("My car is " + vehicle1.brand + ", its color is " + vehicle1.color);
				
				vehicle1.color = "Red";
				
				System.out.println("My car is " + vehicle1.brand + ", its color is " + vehicle1.color);
				
				vehicle1.accelerate();
				vehicle1.drive();
				vehicle1.stop();
				
				// Object 2
				
				Vehicle vehicle2 = new Vehicle();
				vehicle2.brand = "Honda";
				vehicle2.color = "Blue";
				vehicle2.hp = 200;
				vehicle2.price = 20000;
				vehicle2.wheels = 4;
				
				System.out.println("My car is " + vehicle2.brand + ", its color is " + vehicle2.color);
				
				System.out.println(vehicle2); // we'll print the unique hashcode assigned to this object
				
				vehicle2.accelerate();
				vehicle2.drive();
				vehicle2.stop();
				
				// Object 3
				Vehicle vehicle3 = new Vehicle();
				vehicle3.brand = "Toyota";
				vehicle3.color = "White";
				vehicle3.hp = 180;
				vehicle3.price = 25000;
				vehicle3.wheels = 4;
				
				System.out.println("My car is " + vehicle3.brand + ", its color is " + vehicle3.color);
				
				System.out.println(vehicle3); // we'll print the unique hashcode assigned to this object
				
				vehicle3.accelerate();
				vehicle3.drive();
				vehicle3.park();
				
				
	}
}
