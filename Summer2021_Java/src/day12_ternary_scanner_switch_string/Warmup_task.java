package day12_ternary_scanner_switch_string;

public class Warmup_task {

	public static void main(String[] args) {
		
		int average = 60;
		if(average >= 0 && average <= 100) {
			System.out.print("Your grade is: ");
		
			if ( average >=0 && average <= 59) {
			System.out.println("F");
		} else if  ( average >= 60 && average <= 69){
			System.out.println("D");
		} else if (average >=70 && average <= 79) {
			System.out.println("C");
		} else if ( average >=80 && average <=89) {
			System.out.println("B");
		} else if ( average >=90 && average <= 100) { 
			System.out.println("A");
		} 

			int b = 2;
			
		//	               3     2     1     2     0     2
			boolean res = ++b == 2 || --b == 2 && --b == 2;
			System.out.println(res);
		
		boolean x = true, z = true;
		int y = 20;
	//	       f           f
		x = (y!=20) || (z=false);
		System.out.println(x);  // false
		
		}
		
		
	}	
	
	
	
		
}	
	


