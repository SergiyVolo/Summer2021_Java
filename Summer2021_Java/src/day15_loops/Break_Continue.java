package day15_loops;

public class Break_Continue {

	public static void main(String[] args) {
		
		// break;
				for(int i = 0; i < 10; i++) {
					if(i == 5) {
						break; // terminates the execution of the loop
					}
					System.out.println(i);
				}
				
				System.out.println("Hello");

		// continue;
				for(int i = 0; i < 10; i++) {
					if(i == 5) {
						continue; // please skip this iteration
					}
					System.out.println(i);
				}
				
				System.out.println("Hello");
		

	}

}
