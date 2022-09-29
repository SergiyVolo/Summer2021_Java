package day18_encapsulation;

public class Parking_Lot {

	public static void main(String[] args) {
		
       Vehicle car1 = new Vehicle();
		
		car1.setMake("Ford");
		System.out.println(car1.getMake());

		
		Vehicle car2 = new Vehicle();
		Vehicle car3 = new Vehicle();
		
		Vehicle car4 = new Vehicle("Toyota");
		System.out.println(car4.getMake());
		
		Vehicle car5 = new Vehicle("Chevy", "Corvette");
		System.out.println(car5.getModel());
		

	}

}
