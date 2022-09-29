package myfirstpackage;

import java.util.Scanner;

public class My_Program_1 {

	public static void main(String[] args) {
		
		String answer1 = "yes"; 
		int temperature = 0;
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Hi! I'll help you decide what you should do today!");
       
	    System.out.println("Is it raining: ");
	    String answer2 = input.nextLine();
	    
	    System.out.println("What is the temperature outside?");
         temperature = input.nextInt();
	    
	    
	    if (answer2.equals(answer1) && temperature < 55){
	    	System.out.println("Stay home and do your chores!");
	    } else if (answer2.equals(answer1) && temperature > 55){
		    	System.out.println("Although it's warm outside, it is raining. So, stay home and do your chores!");	
	    
	   } else if (!answer2.equals(answer1) && temperature >= 55 && temperature <90) {
	    System.out.println("Go fishing!");
	   } else if (!answer2.equals(answer1) && temperature < 55) {
    	System.out.println("Although it's not raining, it's too cold outside! So, stay home and do your chores!");  
	   } else if (!answer2.equals(answer1) && temperature >= 90) {
	    	System.out.println("Although it's not raining, it's too hot outside! So, stay home and do your chores!");

	   input.close();
	}
 }
}
	    	
	    	
	    	
	    	
	    	
	    	




