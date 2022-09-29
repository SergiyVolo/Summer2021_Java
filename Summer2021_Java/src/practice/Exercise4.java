package practice;

public class Exercise4 {
	
	
	public static void main(String[] args) {
		
		 double num3 = product(40, 0.1); //invoking method and saving returned
                                           //result in double var
		System.out.println(num3);
	System.out.println(product(100, 1.25));
		         int x = 10; //declaring local var
                 test(x);    // invoking method
	}
	
	public static double product(double num1, double num2) {
		    return num1 * num2;
		 }
	
	      public static void test(int x) {
		    System.out.println(x);
	}
	
	      
}
