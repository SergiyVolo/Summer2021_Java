package day18_encapsulation;

import java.util.Scanner;

public class Person {
	
	public String name;
	public int age;
	private String SSN = "15272890";
	public String gender;
	private double shoeSize;
	
	// access modifiers : public, private
	
	
	/*
	 * naming convention for getters and setters:
	 * 	- start with either get or set
	 *  - follow with the variable name with the first letter capitalized
	 * 
	 */
	
	// setter
	public void setSSN(String social) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input your job title to change the SSN:");
		
		String jobTitle = input.nextLine();
		
		if(jobTitle.equals("SSA Worker")) {
			SSN = social;
		} 
	}
	
	// getter
	public String getSSN() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input your job title to access the SSN:");
		input.close();
		String jobTitle = input.nextLine();
		
		if(jobTitle.equals("Mortgage Officer")) {
			return SSN;
		} else {
			return "";
			
		}
		
	}
	
}
