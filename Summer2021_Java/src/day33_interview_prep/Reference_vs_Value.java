package day33_interview_prep;

public class Reference_vs_Value {
	
// Is Java pass-by-value or pass-by-reference?
// Java is pass-by-value: only the value of the variable is passed to the method and no 
// reference to the original varibale is provided

	public static void main(String[] args) {
		
		
		int age = 49;
		increaseAge(age);
		
		System.out.println(age);  // 49
		
		//=====================================//
		
		//    address
		Student st1 = new Student(); // st1 = 25263fd283902;
		st1.name = "Jack Doe";
		
		changeName(st1);
		
		System.out.println(st1.name);  // Rashad

	}

	private static void changeName(Student st1) {
		// the method has received the address in the heap for this object
		st1.name = "Rashad";
		System.out.println("The name inside the method is: " + st1.name);
	}

	private static void increaseAge(int age) {
		age = age + 1;
		System.out.println("Age inside the method: " + age);
	}

}

