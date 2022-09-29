package day15_loops;

import java.util.Scanner;

public class Email_Domain {

	public static void main(String[] args) {
		
		
//      012345
	// Task: john@gmail.com -> gmail
	//       jack@outlook.com -> outlook
	
	
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input your email:");
		String email = input.next();
		
		String domain = email.substring(email.indexOf("@") + 1, email.indexOf("."));
		System.out.println(domain);
		
		input.close();
	}

}
