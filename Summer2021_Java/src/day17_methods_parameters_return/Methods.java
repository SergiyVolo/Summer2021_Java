package day17_methods_parameters_return;

public class Methods {
	
//	Task1: Create a method called printUntil that accepts a number and 
//	prints each number until that number.
//	printUntil(7) -> 0,1,2,3,4,5,6,7
	
//	Task2: Create a method called printRange that accepts two numbers and
//	prints each number in the range.
//	printRange(5, 10) -> 5, 6, 7, 8, 9, 10

//	Task3: Create a method called printStrings that accepts a String and 
//	a number n and prints the string n times
//	printStings(“Hello”, 2) -> HelloHello

//	Task4: Create a method that accepts a name and domain, combines them and 
//	returns the full email address
	
//	Task5: Create a method called product that accepts two numbers and 
//	returns their productproduct(5, 6) -> 30
	
	public static void main(String[] args) {
		
		Methods obj1 = new Methods();
		obj1.printUtil(4);
		obj1.printRange(1, 7);
		obj1.printStrings("Good evening!", 5);
		String fullAddress = obj1.createEmailAddress("john.doe", "gmail");
		System.out.println(fullAddress);
		
		int product = obj1.product(5, 6);
		System.out.println(product);
		
		obj1.sum(-4, 5);
		
	}
	
	
	// Task 1
	public void printUtil(int num1) {
		
		for(int i = 0; i <= num1; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
	}
	
	
	
	// Task 2
	public void printRange(int num1, int num2) {
		
		for(int counter = num1; counter <= num2; counter++) {
			System.out.print(counter + " ");
		}
		
		System.out.println();
	}
	
	
	// Task3
	public void printStrings(String text, int n) {
		
		for(int i = 0; i < n; i++) {
			System.out.print(text + " ");
		}
		System.out.println();
	}
	
	// Task4
	public String createEmailAddress(String name, String domain) {
		String fullEmailAddress = name + "@" + domain + ".com";
		return fullEmailAddress;
	}
	
	// Task5
	public int product(int num1, int num2) {
		int product = num1 * num2;
		return product;
	}
	
	// Should only work with positive numbers
	public void sum(int num1, int num2) {
		
		if(num1 < 0 || num2 < 0) {
			System.out.println("Only positive numbers are allowed");
			return; // break
		}
		
		int sum = num1 + num2;
		System.out.println(sum);
		
		
}
}
