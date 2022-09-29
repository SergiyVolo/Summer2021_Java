package day15_loops;

public class Do_While_Looop {

	public static void main(String[] args) {
		
int counter = 0;
		
		do {
			System.out.println("Hello");  // first one always gets executed
		} while(counter++ < 5);
		
		System.out.println("Hi!");
		
		// Hello
		// 0 < 5 -> Hello
		// 1 < 5 -> Hello
		// ...
		// 5 < 5 -> nothing is printed

		int k = 0;
		do{
			System.out.print('*'+" ");
		} while (++ k < 53);


		
	}

}
