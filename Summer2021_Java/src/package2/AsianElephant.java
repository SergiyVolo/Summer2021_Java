package package2;

import practice.Elephant;

public class AsianElephant extends Elephant {
	
	public static void main(String[] args) {
		
		Elephant el1 = new Elephant();
		
		AsianElephant elephant2 = new AsianElephant();
	     elephant2.age = 25;
	     elephant2.trunkLength=2;
	     elephant2.move();
	     System.out.println("Asian Elephant is " + elephant2.age + " years old.");
    }
}