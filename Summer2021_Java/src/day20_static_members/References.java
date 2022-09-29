package day20_static_members;

import java.util.Scanner;

public class References {
	
//	- Create a Scanner object and assign it to a variable;
//	- Nullify the reference (make the variable point to nothing. 
//	Ex: String text = null); 
//	- Suggest java to run garbage collection to pick up unused object;
//	- Create another Scanner object, assign it to a variable;
//	- Point that variable to the previously created Scanner variable;
//	- Decide if it makes sense to suggest java to run GC at this point.
//	- Run GC if needed.

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		input = null;                              // eligible for GC!
		System.gc();
		
		Scanner stdin = new Scanner(System.in);
		
		input = stdin;
		
		/*
		 * new Scanner(1): 0
		 * new Scanner(2): 2
		 */
		input.close();
		stdin.close();
	}
}







