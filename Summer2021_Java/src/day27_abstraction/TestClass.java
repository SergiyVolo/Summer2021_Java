package day27_abstraction;

import java.util.Scanner;

public class TestClass implements Interface1, Interface2 {
	
	@Override
	public void move() {
		Interface1.super.move();  // referencing move() from Interface1 
		Interface2.super.move();  // referencing move() from Interface2
		
		Scanner input = new Scanner(System.in);
		
		input.close();
	}
}

