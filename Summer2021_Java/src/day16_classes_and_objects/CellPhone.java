package day16_classes_and_objects;

public class CellPhone {

	// This will be a blueprint for all the cell phone objects
	
		String brand;         // null
		int memorySize;       // 0
		double price;         // 0.0
		boolean isAffordable; // false
		char char1;           // '' - empty space
		
		 /* global, instance variables - they will be assigned a default value
       	 *    if no value has been given by programmer		
		 *
		 * public - means it's accessible to everyone
		 * void - doesn't return anything back to us
		 * 
		 */
		public void call() {
			System.out.println("Calling...");
		}
		
		public void takePicture() {
			System.out.println("Taking a picture... Say 'Cheese'!");
		}
		
		public void buy() {
			System.out.println("Bying the " + brand + " for " + price);

}
}