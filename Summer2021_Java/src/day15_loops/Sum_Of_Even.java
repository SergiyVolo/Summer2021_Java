package day15_loops;

public class Sum_Of_Even {

	public static void main(String[] args) {
		
		// Write a program that calculates the sum of even numbers between 0 and 20 using while loop.

				int counter = 0;
				int sum = 0;
				
				while(counter <= 20) {
					// statements to repeat
					if(counter % 2 == 0) {
						sum =+ counter;
					}
					counter++;
				}
				
				System.out.println("The sum of all the even numbers between o and 20 is " + sum);
				
				
				// 2 4 6 8 10 12 14 16 18 20

	}

}
