package day24_polymorphism;

public class Overloading_Test {

	public void go() {
		System.out.println("Going somewhere");
	}
	
	public void go(String destination) {
		System.out.println("Going to " + destination);
	}
	
	public void go(int distance) {
		System.out.println("Going " + distance + " miles");
	}
	
	protected void go(String destination, int distance) {
		System.out.println("Going to " + destination + " for " + distance + " miles" );
	}
	
	public static void main(String[] args) {
		
		Overloading_Test obj1 = new Overloading_Test();
		obj1.go();
		obj1.go(5);
		obj1.go("Target");
		obj1.go("Walmart", 7);
		
		String text = "Good morning!";
		text.substring(0);
		
		System.out.println(text.substring(0, 4));
	}
}
