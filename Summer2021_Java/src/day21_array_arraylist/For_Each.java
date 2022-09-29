package day21_array_arraylist;

public class For_Each {

	public static void main(String[] args) {
		
		String[] fruits = {"Apple", "Orange", "Mango", "Cherry", "Pear"};
		
		System.out.println(fruits);  
		
		// foreach loop
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		/*
		 * Create a char array called grades (A, B, C, D, E, F)
		 * Print all the elements to the console using foreach loop
		 * Print this array backwards 
		 */
		
		char[] array = {'A', 'B', 'C', 'D', 'E', 'F'};
		
		for(char character : array) {
			System.out.print(character + ", ");
		}
		
		System.out.println();
		
		for(int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + ", ");
		}
	}
}

