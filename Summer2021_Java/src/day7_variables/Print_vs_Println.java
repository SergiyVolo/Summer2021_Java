package day7_variables;

public class Print_vs_Println {

	public static void main(String[] args) {
		
		System.out.print("Hello, ");   // print() method doesn't shift the 
		                               //  following code to the next line
		System.out.print("Rashad");  // println() method shift the following 
		                             //   code to the next line
		System.out.println("!+++");
		
		
		//Print: "Hello" on the first line and then "It's a beautiful weather!" on
		//the second line
		System.out.println("Hello");
		System.out.println("It's a beautiful weather!");
		System.out.println(" Java is easy!");
		
//Extra task: on the second line add: " Java is easy!" with a separate print statement
		
		double x = 105.12;
		double y = 4.0;
		double z = x * y;
		System.out.println(z);
		
		
	}
	

}
