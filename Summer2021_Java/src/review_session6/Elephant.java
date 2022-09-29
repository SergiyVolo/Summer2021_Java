package review_session6;

public class Elephant {

//	Create class Elephant with variables (public age, private weight, protected trunkLength) and two methods (<default> hoard and public move);
//	Create class African Elephant in the same package and make it subclass of Elephant - see what variables and methods you can access;
//	Create class Asian Elephant in the different package and make it subclass of Elephant - see what variables and methods you can access;
//	Create an object of Elephant in the Asian Elephant class and try to access protected trunkLength variable using that object. Can you access it? Can you directly print it in the main method? Can you access it using Asian Elephant instance?

	/*
	 * private - within class
	 * <default> - package private
	 * protected - package + subclasses in different packages
	 * 		- access via instance of a child class 
	 * 		- via public methods
	 * 		- direct access via inheritance
	 * public - available everywhere within project
	 */
	
	public int age;
	private double weight;
	protected int trunkLength;
	
	void hoard() {
		System.out.println("Elephants are gathering together");
	}
	
	public void move() {
		System.out.println("Elephant is moving");
	}
	
	public int accessTrunkLength() {
		return this.trunkLength;
	}
}

