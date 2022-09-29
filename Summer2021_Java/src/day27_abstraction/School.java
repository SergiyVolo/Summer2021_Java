package day27_abstraction;

public class School {

	public static void main(String[] args) {
		
		
		Student student1 = new Student();
		student1.attendClass();
		
		OnlineStudent student2 = new OnlineStudent();
		student2.setName("Petch");
		student2.setStudentID("123");
		student2.setCity("Burke");
		
		student2.attendClass(); // attending using Zoom
		System.out.println(student2);

		OnCampusStudent student3 = new OnCampusStudent();
		student3.setName("Owais");
		student3.setStudentID("124");
		student3.setCity("Woodbridge");
		
		student3.attendClass(); // ?
		student3.attendClass(false);
		
		System.out.println(student3);
		
	}

}
