package day24_polymorphism;

public class Java extends Programming_Language {

	protected void createObject(double dbl1) {
		System.out.println("Creating and object with the data point: " + dbl1);
	}
	
	public static void main(String[] args) {
		Java obj1 = new Java();
		obj1.createObject();
		obj1.createObject(2.5d);
		obj1.createObject("Human", 5);
		obj1.createObject(7);
	}
}
