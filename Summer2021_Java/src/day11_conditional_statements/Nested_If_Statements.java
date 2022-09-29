package day11_conditional_statements;

public class Nested_If_Statements {
	
	public static void main(String[] args) {
		int salary = 145_000;
		int yearsOnTheJob = 10;
		
		if(salary >= 30_000) {
			if(yearsOnTheJob >= 2) {
				System.out.println("You are approved!");
			} else {
				System.out.println("You have to be employed for more than two years");
			}
		} else {
			System.out.println("Application denied");
			
		}
	}
		
		

	
	
//	Write a Java Program for the following logic:
//		• if grade is < 55, then print “Fail”;
//		• if grade is >= 55, but less than 80, then print “Pass”;
//		• if grade is >= 80, then print “Passed with Distinction”.

       int grade = 0; {
         if ( grade < 55) {
        	 System.out.println("Fail");
         } else if (grade >= 55 && grade < 80) {
        	 System.out.println("Pass");
         } else if ( grade > 80) {
  //     	 System.out.println(“Passed with Distinction”);
         }
       }
}


	
	  
		
     
     
	

	
	
	





