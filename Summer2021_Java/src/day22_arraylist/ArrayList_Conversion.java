package day22_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayList_Conversion {

	public static void main(String[] args) {
		
		String[] flowers = {"Jasmine", "Tulips", "Lotus", "Peony", "Lillies"};
		flowers[0] = "Rose";
		
		for(int i = 0; i < flowers.length; i++) {
			System.out.print(flowers[i] + ",");
		}
		
		// asList() method helps us to convert array into an ArrayList
		List<String> flowerList = Arrays.asList(new String[]{"Flower1", "Flower2", "Flower3"});
		// flowerList becomes a fixed size ArrayList
		
//		flowerList.add("Flower4");  // unsupported operation, we can't add or remove anything form this arraylist
		
		
	}

}
