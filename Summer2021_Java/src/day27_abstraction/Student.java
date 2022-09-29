package day27_abstraction;

public class Student {

//		Create class Student:
	
//		variables:
//		 - name
//		 - studentID
	
//		methods:
//		 - attendClass()
//		 - getters and setters
//		 - override toString method
//
	
//		Create class OnlineStudent that inherits from Student
	
//		variables:
//		 - city
	
//	    methods:
//		 - Overrides attendClass() -> “Attending class using Zoom”
//		 - getters and setters
//		 - override toString method
//
	
//		Create class OnCampusStudent inherits from Student
	
//		variables:
//	 	 - city
	
//	    methods:
//		 - Overrides attendClass() -> “Attending class in person”
//		 - Overloads attendClass(boolean):
//	    	if true: "Attending class using Zoom"
//	    	if false: "Attending class in person"
//		 - getters and setters;	
//		 - override toString method

//       Create a class called 'School', instantiate objects of both Online and 
//             	OnCampusStudent Student
//       Call all the methods and make sure to understand the output
//                (why and where it's coming from)
	
		public String name;
		private String studentID;
		
		public void attendClass() {
			System.out.println("Student is attending class");
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStudentID() {
			return studentID;
		}

		public void setStudentID(String studentID) {
			this.studentID = studentID;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", studentID=" + studentID + "]";
		}
		
		
	
}
