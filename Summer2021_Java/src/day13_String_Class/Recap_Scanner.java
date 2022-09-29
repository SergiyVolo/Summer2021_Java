package day13_String_Class;

import java.util.Scanner;

public class Recap_Scanner {
  
	public static void main(String[] args) {
	  
Scanner input = new Scanner(System.in);
		
		System.out.println("Please input your job title: ");
		
		String jobTitle = input.nextLine(); // next() vs nextLine()
		System.out.println("My job title is: " + jobTitle);
		
		input.close(); 
  }
}
