package day15_loops;

public class Even_Odd {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 30; i++) {
			if(i%2 == 0) {
				System.out.print(i);
			}
		}
		
		System.out.println("=======================");
		
		for(int i = 1; i <= 30; i++) {
			if(i%2 == 1) {
				System.out.println(i);
			}
		}

		System.out.println("=======================");
		
		for(int i = 1; i <= 30; i = i + 2) {
			 {
				System.out.println(i);
			 }	
	}

	
		System.out.println("=======================");
	
	
		for(int i = 1; i < 31; i++ ) {
			System.out.println( i % 2 == 0 );
	
	}
}
}
	