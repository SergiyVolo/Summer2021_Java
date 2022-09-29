package package1;

public class Friend {
	
	public static void main(String[] args) {
		
		Parent parent1 = new Parent();
//		System.out.println(parent1.num1);  private can't be accessed here, outside of Parent's class 
		System.out.println(parent1.num2);  // sitting in the same package, <default> is accessible
		System.out.println(parent1.num3);  // less restrictive than <default>, accessible within the same package
		System.out.println(parent1.num4);
	}
}
