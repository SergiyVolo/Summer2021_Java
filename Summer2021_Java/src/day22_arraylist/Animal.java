package day22_arraylist;

public class Animal {

//	Task 1:
//		 * 	- create a class Animal;
//		 *  - private instance variable called 'name';
//		 *  - constructor that accepts a name and assigns it to the instance variable;
//		 *  - getters and setters;
//		 *  
//		 *  - create another class name Zoo;
//		 *  - create an array that contains 5 different animals;
//		 *  - iterate over this array and print each animal's name;

	private String name;
	
	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
