package review_session3;

import java.util.Random;
import java.util.Scanner;

public class Guessing_Game {

	public static void main(String[] args) {
		
        int attempts = 5;
		
		System.out.println("Welcome to our Prime Tech's guessing game!");
		System.out.println("You have " + attempts + " attempts to guess a number between 0 and 100");
		System.out.println("===========================");
		
		Scanner input = new Scanner(System.in);
		int guess = 0;
		
		Random random = new Random();
		int secretNumber = random.nextInt(101);
		
		do {
			System.out.println("You have " + attempts-- + " attempts left");
			
			System.out.println("Please input a number: ");
			guess = input.nextInt();
			
			if(guess > secretNumber) {
				System.out.println("The secret number is less than " + guess);
				System.out.println("===========================");
			} else if (guess < secretNumber) {
				System.out.println("The secret number is greater than " + guess);
				System.out.println("===========================");
			} else {
				System.out.println("Yay! You got it right!");
				break;
			}
			
			if(attempts == 0) {
				System.out.println("You've run out of attempts. Maybe next time!");
				System.out.println("The secret number was " + secretNumber);
				break;
			}
			
			
		} while (guess != secretNumber);
		
		input.close();
	}

}
