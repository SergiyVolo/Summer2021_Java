package day23_inheritance;

public class House {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		cat1.eat();
		cat1.color = "White";
		System.out.println(cat1.color);
		
		Cat cat2 = new Cat();
		cat2.sleep();
		cat2.color = "Multi-color";
		
		Dog dog1 = new Dog();
		dog1.eat();
		dog1.color = "Brown";
		
		Dog dog2 = new Dog();
		dog2.sleep();
		
		System.out.println(cat1.color);
		System.out.println(cat2.color);
		System.out.println(dog1.color);
		System.out.println(dog2.color);
		
//		System.out.println(cat1.ID);    private members of the parent class
//		                                 can't be accessed
		
	}
}

