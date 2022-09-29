package day15_loops;

public class Lexicographical_Comparison {

	public static void main(String[] args) {
		
		/*
		 * 1, 2, 11
		 * 
		 * 	- simple mathematical comparison:   1 << 2 << 11
		 * 	- lexicographical comparison:       1 << 11 << 2
		 * 
		 */
	                          //					49 - 50
			System.out.println("1".compareTo("2"));  // -1 
			System.out.println("1".compareTo("11")); // -1
			System.out.println("2".compareTo("11")); // 1
			
			// 11
			// 2
	}

}
