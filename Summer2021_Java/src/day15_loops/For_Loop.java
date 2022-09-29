package day15_loops;

public class For_Loop {

	public static void main(String[] args) {
		
//		System.out.println("Prime Tech");
//		System.out.println("Prime Tech");
//		System.out.println("Prime Tech");
//		System.out.println("Prime Tech");
//		System.out.println("Prime Tech");
		

		//             5 < 5
		for(int i = 0; i < 5; i++) {  // 0, 1, 2, 3, 4
			// code to repeat
			System.out.println("Prime Tech");
		}
		
		// i = 0, 0 < 5 -> Prime Tech
		// i = 2, 2 < 5 -> Prime Tech
		// i = 4, 4 < 5 -> Prime Tech
		// i = 6, 6 < 5 -> not printing, loop execution stops
		
		int num1 = 5;
		++num1;
		System.out.println(num1);
		
		
		for(int i = 10; i > 0; --i) {
			System.out.println("Hello " + i);
		}

		int k = 0;
		for( k = 0 ;  k < 10 ; k++ ) {
			System.out.print('*');	
			}
		System.out.println();
		
		int j = 0;
		for ( j = 0; j < 5; j++) {
			System.out.print('!'+ "");
		}
		System.out.println();
		
		
		for(int i = 6; i < 200; i=i+6){
//			if(i%6==0);
			System.out.print(i + " ");
				}
		System.out.println();
		
		
		int total = 0;
		for( k = 0; k <= 50; k++){
			total = total + k*k;
		System.out.print(total);	
			}
		System.out.println();
		
	String result = "";
		for(int  i = 11; i < 20; i = i + 2){
	  	result = i+"*";
			System.out.print(result);
			}
		System.out.println();
	}

}
