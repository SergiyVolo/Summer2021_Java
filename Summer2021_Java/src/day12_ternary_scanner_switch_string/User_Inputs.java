package day12_ternary_scanner_switch_string;
import java.util.Scanner;   // library/package that's used to process User Inputs
import java.lang.*;         // imported automatically by Java

public class User_Inputs {
	public static  void main(String[] args) {
		int a = 0;
		int b = 0;
		
//   datatype var name   creation of new object System.in - processing input from the keyboard
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input the value of var a: ");
		a = input.nextInt();
		
		System.out.println("Please input the value of var b: ");
		b = input.nextInt();
		
		int result = a + b;
		System.out.println("The sum of two variables: " + result);
		
		input.close();
		
		
	}

}
