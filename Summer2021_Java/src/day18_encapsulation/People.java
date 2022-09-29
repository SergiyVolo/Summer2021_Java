package day18_encapsulation;

public class People {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Joe Biden";
//		person1.SSN = "36382902";  SSN is private and is not visible 
//		in the People class
		person1.age = 72;
		person1.gender = "Male";
//		person1.shoeSize = 10;     shoeSize is also private
		
		
// Getters and Setters will help us to provide private data to someone we trust
		
//		person1.setSSN("36382902");
//		String social = person1.getSSN();
//		System.out.println(social);
		
		person1.setSSN("647390375");
		System.out.println(person1.getSSN());
		
	}

}
