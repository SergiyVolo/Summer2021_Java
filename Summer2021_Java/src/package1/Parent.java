package package1;

public class Parent {
	
	class InnerClass {
		
	}
	
	/*
	 * 1. What access modifier do I need if i want my variable to be visible only within the package? <default>
	 * 2. I need a method that can be used by other classes in the same package and also subclasses in other packages? protected
	 * 3. I need a variable that can’t be changed and is visible within my class only? private final int num = 5
	 * 4. I need a method that everyone can use - public
	 * 
	 * 
	 * var - all access modifier
	 * methods - all access modifier
	 * constructors - all access modifier
	 * classes:
	 * 		- outer class: public or <default>
	 * 			only one of the outer classes can be public
	 * 		- inner class: all access modifier
	 * 
	 * 
	 */

//	private Parent() {
//		
//	}

	private int num1;
	int num2;
	protected int num3;
	public int num4;
	
	public int giveBackInt() {
		return num3;
	}
}

