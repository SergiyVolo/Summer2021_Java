package package2;

import package1.Parent;

public class Friend {
	
	public static void main(String[] args) {
		
		Parent parent1 = new Parent();
//		System.out.println(parent1.num1);  private can't be accessed here, outside of Parent's class 
//		System.out.println(parent1.num2);  // sitting in the different package, <default> is not accessible
//		System.out.println(parent1.num3);  // different package and Friend is not a sub-class of Parent
		System.out.println(parent1.num4);
	}
}

