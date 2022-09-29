package review_session4;

public class Loops_Practice {

	/*
	 * Loops:
	 * 		- for;
	 * 			- foreach
	 * 		- while;
	 * 		- do-while;
	 * 		
	 * 	- break (stops the execution of the loop);
	 * 	- continue (skips the current iteration);
	 * 
	 * 
	 * 		for:
	 * 			for(int i = 0; i < 10; i = i + 3) {
	 * 				if(i == 3) {
	 * 					continue;
	 * 				}
	 * 				syso(i);
	 * 			}
	 * 
	 * 			0,
	 * 			
	 *          6,
	 *          9,
	 * 
	 * 		while:
	 * 			while(false) {
	 * 
	 * 			}
	 * 
	 * 		do-while
	 * 			do {
	 * 				// action
	 * 			} while (false);
	 * 
	 * 
	 * 		for(String var : array){
	 * 			syso(var);
	 * 		}
	 */
	
	public static void main(String[] args) {
		
		// output the numbers from 0 to 100 that are divisible by 21 to the console 
		
		for(int i = 0; i < 100; i = i + 21) {
			System.out.println(i);
		}
		
		
		int counter = 0;
		
		while(true) {
			if(counter == 10) {
				break;
			}
			System.out.println("Good morning!");
			counter++;
		}
	}
}
