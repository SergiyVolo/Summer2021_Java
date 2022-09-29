package day16_classes_and_objects;

public class Classroom {

	public static void main(String[] args) {
        
//		Student student1 = new Student();
//		
//		student1.firstName = "Salam";
//		student1.lastName = "Ibraheem";
//		student1.courseOfStudy = "Java";
//		student1.gender = "Male";
//		student1.grade = 'A';
//		student1.javaSkill = 70;
//		
//		
//		student1.code();
//		student1.beLazy();
//		
		Student student2 = new Student();
		student2.firstName = "Sergiy";
		student2.lastName = "Voloshyn";
		student2.gender = "Male";
		student2.grade2 = "Unknown";
		student2.coffeeConsumption = "A lot";
		
		System.out.println("The student's name is: " + student2.firstName + " " + student2.lastName+".");
		System.out.println("His Java grade is " + student2.grade2 + ".");
		
		
		student2.confident();
		student2.likesBeer();
		student2.attendsSchool();
		
	}

}
