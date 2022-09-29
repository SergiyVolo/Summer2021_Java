package package2;

import package1.Parent;

public class SubClass extends Parent {
	
	int number = num3;
	
	public void testMethod() {
		System.out.println(num3);
	}

	public static void main(String[] args) {
		
		Parent parent1 = new Parent();
//		System.out.println(parent1.num1);  // private can't be accessed here, outside of Parent's class 
//		System.out.println(parent1.num2);  // sitting in the different package, <default> is not accessible
//		System.out.println(parent1.num3);  // matches the definition of protected, but is accessed via Parent's instance
		System.out.println(parent1.num4);
		System.out.println(parent1.giveBackInt());  // accessing protected via public methods
		
		SubClass subclass1 = new SubClass();
		System.out.println(subclass1.num3); // matches the definition of protected, and is accessed via sub-class's instance
		System.out.println(subclass1.num4);
		
//		System.out.println(num3);  static main method can't see non-static num3
	}
}

