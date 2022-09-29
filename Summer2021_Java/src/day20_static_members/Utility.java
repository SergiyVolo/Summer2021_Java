package day20_static_members;

public class Utility {
	
	static String operator = "*";
	int num1 = 5;

	// static method can only see static members of the class
	public static void add(int num1, int num2) {
		if(operator.equals("+")) {
			System.out.println("The sum is: " + (num1 + num2));
		}
	}
	
	public static void multiply(int num1, int num2) {
		System.out.println("The product is: " + num1 * num2);
	}
	
	// non-static method is able to see both statics and non-statics
	public void randomMethod() {
		System.out.println(operator + num1);
	}
	
	/*
	 * create a static method called 'calculate' that is depending on the value of the operator variable 
	 * will execute the respective action. Please use switch statement inside
	 * 
	 */
	
	public static void calculate(int num1, int num2) {
		
		switch(operator) {
			case "+": System.out.println("The sum is: " + (num1 + num2)); break;
			case "-": System.out.println("The difference is: " + (num1 - num2)); break;
			case "/": System.out.println("The result of division is: " + num1 / num2); break;
			case "*": System.out.println("The product is: " + num1 * num2); break;
			default: System.out.println("Wrong operator");
		}
	}
	
}
