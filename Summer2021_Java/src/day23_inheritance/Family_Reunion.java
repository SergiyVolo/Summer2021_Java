package day23_inheritance;

public class Family_Reunion {

	public static void main(String[] args) {
		
		GrandChild grandch = new GrandChild();
		grandch.birthday = "01/01/2000";
		
		Child child1 = new Child();
//		child1.SSN;       class-private and is not accessible for children
		child1.missParents();
		child1.name="Nick";
		child1.email="some email";
		System.out.println("child1 name is "+child1.name);
	}

}

