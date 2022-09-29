package day28_exceptions;

public class Checked_Exception {

	public static void main(String[] args) {
		
		System.out.println("Hello");
		
		try {
			Thread.sleep(5000);
			System.out.println(10/0);
		} catch(Exception e) {
			System.out.println("I recovered from an exception!");
			System.out.println(10/0); // will make the program crash
		} finally {
			System.out.println("I will always execute no matter what!");
		}
		
		System.out.println("Good bye!");
	}

}

