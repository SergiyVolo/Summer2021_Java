package day16_classes_and_objects;

public class Dog_Show {
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		
		dog1.breed = "Bullterier";
		dog1.color = "black and white";
		dog1.weight = 45;
		dog1.isFriendly = false;
		
		System.out.println("My dog is a " + dog1.color + " " + dog1.breed + ".");
		System.out.println("My dog's weight is " + dog1.weight + "lb." );
		System.out.println("My dog is friendly: " + dog1.isFriendly);
	
	      dog1.bark();
	      dog1.chase();
	      
	Dog dog2 = new Dog();
	
	dog2.breed = "Labrador";
	dog2.color = "black";
	dog2.weight = 65;
	dog2.isFriendly = true;
	
	System.out.println("My dog is a " + dog2.color + " " + dog2.breed + ".");
	System.out.println("My dog's weight is " + dog2.weight + "lb." );
	System.out.println("My dog is friendly: " + dog2.isFriendly);

      dog2.bark();
      dog2.chase();
      
      
      Dog dog3 = new Dog();
  	
  	dog3.breed = "English bulldog";
  	dog3.color = "white";
  	dog3.weight = 45;
  	dog3.isFriendly = true;
  	
  	System.out.println("My dog is a " + dog3.color + " " + dog3.breed + ".");
  	System.out.println("My dog's weight is " + dog3.weight + "lb." );
  	System.out.println("My dog is friendly: " + dog3.isFriendly);

        dog3.notChase();
  	    dog3.sleeps();
      
      
	}

}
