package bootcamp;

public class Value_Reference {

	public static void main(String[] args) {
		
		int cup = 0;
		fillCup(cup);
		System.out.println("The value of cup after filling it is " + cup); // 0
		
		//     address
//		Scanner input = new Scanner(System.in);
		
		Student student1 = new Student();
		student1.name = "Rashad";
		
		changeName(student1);
		
		System.out.println(student1.name);  // ? 
	}
	
	private static void changeName(Student student) {
		
		student.name = "Joe";
		System.out.println("The name of the student inside the method " + student.name);
	}

	public static void fillCup(int cup) {
		cup = cup + 5;
		System.out.println("The value of cup inside the method is " + cup);
	}
	
	

}
