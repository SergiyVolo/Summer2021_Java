package day24_polymorphism;

public class Programming_Language {

	public void createObject() {
		System.out.println("Creating object of a class");
	}
	
	public void createObject(int numOfObjects) {
		System.out.println("Creating " + numOfObjects + " objects");
	}
	
	int createObject(String classOfObject, int numOfObjects) {
     System.out.println("Creating " + numOfObjects + " objects from " + classOfObject);
		return numOfObjects;
	}
	
	public static void main(String[] args) {
		Programming_Language obj1 = new Programming_Language();
		obj1.createObject();
		obj1.createObject(5);
		obj1.createObject("Car", 2);
//		obj1.createObject(2.6d);    super class can't see members of sub class
	}
	
	void main(char char1) {
		// main method can be overloaded
	}
}
