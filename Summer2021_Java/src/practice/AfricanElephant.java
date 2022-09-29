package practice;

public class AfricanElephant extends Elephant {
	
	public static void main(String[] args) {
		
		Elephant el1 = new Elephant();
		
		
		AfricanElephant el2 = new AfricanElephant();
		el2.age = 45;
		el2.trunkLength = 2;
		el2.hoard();
		el2.move();
	}

	
	
	
	
}
