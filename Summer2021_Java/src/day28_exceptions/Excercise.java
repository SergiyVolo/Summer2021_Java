package day28_exceptions;

public class Excercise {
	
	/*
	 * Write the code that will recover from the exception and 
	 * will continue the execution
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		try {
//			System.out.println(10/0); // ArithmeticException
			String text = null;
			text.toLowerCase();  // NullPointerException
			
			
		} catch(ArithmeticException e) {
			System.out.println("Division by 0");
		} catch(NullPointerException e) {
			System.out.println("Null Pointer");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Wrong index");
		} catch(Exception e) {
			System.out.println("Broad exception");
		}
		
		System.out.println("Succesfully handled exception, Yay!");
		
	}
}
