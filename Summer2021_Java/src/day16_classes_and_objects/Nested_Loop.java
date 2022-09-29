package day16_classes_and_objects;

public class Nested_Loop {

	public static void main(String[] args) {
		/*
		 * We'll be drawing triangles now!
		 * 
		 */
		for (int i = 1; i <= 10; i++) {      // i: 1 - 10
				for(int j = 1; j <= i; j++) {    // j: 1 - 3
					System.out.print(j);
				}
				System.out.println();
			}
			
			// i = 1, j = 1 Print: 1
			// i = 2, j = 1, 2 Print: 1, 2
			// i = 3, j = 1, 2,3 Print: 1, 2, 3
			
			
			for (int i = 10; i >= 0; i--) {
				for(int j = 1; j <= i; j++) {
					System.out.print(j);
				}
				System.out.println();
		

	}
	}
}
