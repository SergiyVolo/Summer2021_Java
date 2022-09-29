package day28_exceptions;

public class Combining_Exceptions {

	public static void main(String[] args) throws Exception {
		
		try {
			throw new Exception();

		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("Exception caught");
		}
	}

}
