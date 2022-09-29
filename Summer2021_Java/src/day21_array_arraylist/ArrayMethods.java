package day21_array_arraylist;

public class ArrayMethods {
	
	// Create a method that accepts an array and prints
   //	all its elements to the console

	public static void printArray(String[] array) {
		for(String var : array) {
			System.out.println(var);
		}
	}
	
//	Create a method called 'buildArray' that accepts 5 numbers;
//	method builds an array with these 5 numbers and returns it.
	
	public static int[] buildArray(int num1, int num2, int num3, int num4, int num5) {
		
		int[] array = {num1, num2, num3, num4, num5};
		return array;
	}

	
	public static void main(String[] args) {
		
		String[] letters = {"ft", "TQ", "GHSY"};
		String[] cities = {"Washington, DC", "Fairfax", "Centreville", "Manassass"};
		
		// To statically call these methods we don't need to specify 
        // the class name because they are located within the same class
		printArray(letters);
		printArray(cities);
		
		int[] array = buildArray(1, 2, 3, 4, 5);
		
		for(int var : array) {
			System.out.print(var+",");
		}
	}
}
