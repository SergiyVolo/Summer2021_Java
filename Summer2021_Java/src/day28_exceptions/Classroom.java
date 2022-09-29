package day28_exceptions;

public class Classroom {
	
/*
 * Task: 
 * - create your own "InClassStudentNotPresentException" 
 * - adjust the classroom code so it throws your newly created exception
 * - it needs to be thrown only if it's an in-class student and he/she missed the class
 */

	public static void main(String[] args) throws OnlineStudentNotPresentException {
		
		Student student1 = new Student("Hamza");
		student1.attendedClass = true;
		student1.isOnlineStudent = true;
		
		Student student2 = new Student("Sergiy");
		student2.attendedClass = false;
		student2.isOnlineStudent = false;
		
//		checkAttendance(student1);
		checkAttendance(student2);
		
		
	}
	
	public static void checkAttendance(Student student) throws OnlineStudentNotPresentException {
		
		if(student.isOnlineStudent == true && student.attendedClass == true) {
			System.out.println("Good job!");
		} else if (student.isOnlineStudent == true && student.attendedClass == false) {
			throw new OnlineStudentNotPresentException("Student missed the class!");
		} else if (student.isOnlineStudent == false && student.attendedClass == false) {
			throw new InClassStudentNotPresentException("Student missed the class!");
		} else {
			System.out.println("Good job!");
		}
	}
	
}
