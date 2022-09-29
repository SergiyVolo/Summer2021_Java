package day23_inheritance;

public class Object_Inheritance {

	public static void main(String[] args) {
		
		A a = new A();
		a.toString(); // toString method is coming directly from the Object
		// If we do not explicitly define the parent of the class it will be 
        //assigned as a child of Object automatically
	}
}

