package day27_abstraction;

public class Garage {

	public static void main(String[] args) {
		
		Car car1 = new Car("Toyota");
		
		car1.start();
		car1.openRoof();
		car1.accelerate();
		car1.move();
		car1.brake();
		car1.stop();
		car1.closeRoof();
		car1.charge();
		car1.putGas();   // static methods from clases are inherited
//		car1.superCharge(); static methods from interfaces are not inherited
		
		
		Chargeable.superCharge();
		Convertible.showOff();
		
	}
}

