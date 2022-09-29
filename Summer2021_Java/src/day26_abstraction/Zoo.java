package day26_abstraction;

public class Zoo {

	public static void main(String[] args) {

//		Animals animal1 = new Animals();  // can't create an object of the 
		// abstract class

		Animals animal2 = new Tiger();
		animal2.eat();
		animal2.run();

		Animals animal3 = new Zebra();
		animal3.eat();
		animal3.run();

	}

}
