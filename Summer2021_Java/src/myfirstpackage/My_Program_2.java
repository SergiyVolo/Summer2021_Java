package myfirstpackage;

import java.util.Scanner;

public class My_Program_2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		 String username = "Sergio";
		 String password = "123SV";
		
		
		
		
		while(true ) {
			System.out.println("Please enter your username: ");
			String username1 = input.next();
			System.out.println("The text you entered is: " + username1);
			
			
			if(username1.equals(username)) {
				System.out.println("Please enter your password: ");
				break;
		}		
	}
		
		while(true ) {
//			System.out.println("Please enter your password: ");
			String password1 = input.next();
			System.out.println("The text you entered is: " + password1);
			
			
			if(password1.equals(password)) {
				System.out.println("Welcome back!");
				break;
				
			} else {
				System.out.println("Please enter your password: ");
					
				}
		}	
		
		input.close();
	}

		
		
		
}		
	
	

	


	

