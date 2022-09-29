package day21_array_arraylist;

public class Classroom {
	/*
	 * 
	 * 	1.	static
	 * 		non-static
	 * 		constructor
	 *  2.  non-static
	 *  	constructor
	 *  
	 *  	...
	 *  
	 *  5.  non-static
	 *  	constructor
	 * 
	 */

	public static void main(String[] args) {
		
		Student student1 = new Student("John Doe");
		student1.grade = 'A';
		student1.laptopBrand = "Macbook Pro";
		
//		student1.lightSwitch = true;
		Student.lightSwitch = true;
		Student.window = "open";
		
		
		Student student2 = new Student("Jane Doe");
		System.out.println(Student.lightSwitch);
		System.out.println(Student.window);
		Student.window = "shut";
		System.out.println(student2.grade);   // ?
		
		
		Student student3 = new Student("Salam");
		System.out.println(student3.window);
		student3.moveMouse();
		
		Student student4 = new Student("Ahmad");
		student4.moveMouse();
		
		Student student5 = new Student("Peter");
		
		System.out.println("There are " + Student.count + " students in the class");
	}
}
