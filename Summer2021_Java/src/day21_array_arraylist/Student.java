package day21_array_arraylist;

public class Student {
	
	static {
		System.out.println("Object created for the first time!");
		System.out.println("Static init block");
		System.out.println("================================");
	}
	
	{
		System.out.println("Object is being created");
		System.out.println("Init block");
		System.out.println("================================");
	}
	
	static int count;
	String name;
	char grade;
	
	String laptopBrand;
	static boolean lightSwitch;
	
	static String window = "shut";
	
	public Student(String name) {
		System.out.println("Object is being created");
		System.out.println("I'm a constructor!");
		this.name = name;
		count++;
	}
	
	public void moveMouse() {
		System.out.println("Student " + name + " is moving a mouse");
	}
}
