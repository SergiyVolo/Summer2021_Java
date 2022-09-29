package day13_String_Class;

public class Recap_Ternary {

	public static void main(String[] args) {
		
		/*
		 * Write a program that will determine if the driver deserves a fine for speeding
		 * Speed limit is 25mph
		 * 
		 * If you exceed the speed than you deserve a fine. 
		 * 
		 */
		
		int speed = 27;
		
//		System.out.println(speed > 25 ? "Fined" : "Good to go");  // city driving
		
		//                27 > 55
		String result = speed > 55 ? "Fined" : "Good to go";      // highway
		System.out.println(result);

	}

}
