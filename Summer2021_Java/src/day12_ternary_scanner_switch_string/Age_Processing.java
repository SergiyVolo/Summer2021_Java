package day12_ternary_scanner_switch_string;
      
      import java.util.Scanner;
   
      public class Age_Processing {

	public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please input your age: ");
		byte age = keyboard.nextByte();
		
		System.out.println("My age is: " + age);
		keyboard.close();
	}

}
