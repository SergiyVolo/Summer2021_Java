package myfirstpackage;


import java.util.Scanner;

public class Practice_2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your first name: ");
		String firstName = input.next();
		
		System.out.println("Please enter your last name: ");
		String lastName = input.next();
//		012345
//		Sergiy, Voloshyn
//		                                         s
//		String firstPart = firstName.substring(0, 1);
////		                                        ergiy
//		String secondPart = firstName.substring(1);
//		String firstPartFirstLetter = firstPart.toUpperCase();
//		String secondPartIgnoreCase = secondPart.toLowerCase();
//		System.out.println(firstPartFirstLetter + secondPartIgnoreCase);
//		
//		 String firstNameUpperCase = firstName.toUpperCase();
//		 
//		 System.out.println(firstNameUpperCase);
		 
		 String firstInitial = firstName.substring(0,1);
		String lastInitial = lastName.substring(0,1);
		String initials = firstInitial + lastInitial;
		System.out.println(initials.toUpperCase());
		
		input.close();
		
		
		
		}
}
	
	
		
		
	


