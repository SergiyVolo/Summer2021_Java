package package1;

public class SubClass extends Parent {

	public static void main(String[] args) {
		
		Parent parent1 = new Parent();
//		parent1.num1 = 6;   private can't be accessed
		System.out.println(parent1.num2);
		System.out.println(parent1.num3);
		System.out.println(parent1.num4);
	}
}

