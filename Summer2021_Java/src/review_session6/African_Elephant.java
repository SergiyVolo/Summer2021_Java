package review_session6;

public class African_Elephant extends Elephant {
	
	int num = trunkLength;

	public static void main(String[] args) {
		
		Elephant el1 = new Elephant();
		System.out.println(el1.age);
		System.out.println(el1.trunkLength);
		
		African_Elephant el2 = new African_Elephant();
		System.out.println(el2.age);
		System.out.println(el2.trunkLength);
	}
}
