package review_session6;

import java.util.ArrayList;
import java.util.HashSet;

public class Vehicles {

	/*
	 * - Create a HashSet of ArrayLists of Strings structure that contains multiple vehicles. 
	 * - Vehicles must be organized by Make and Model. HashSet should contain makes, ArrayList - models. 
	 * - Add 3 makes (bmw, audi, zhiguli) and 3 models (come up with models yourself). 
	 * - Get the second model of bmw and print it to the console.
	 * 
	 *    HashSet<> vehicles = new HashSet<>();
	 *    
	 *    ArrayList<> bmw = new Arraylist<>();
	 *    bmw.add("740");
	 *    
	 *    vehicles.add(bmw);
	 *    vehicles.add(audi);
	 */
	
	public static void main(String[] args) {
		
		HashSet<ArrayList<String>> vehicles = new HashSet<>();
		
		ArrayList<String> bmw = new ArrayList<>();
		bmw.add("740");
		bmw.add("e30");
		bmw.add("M4");
		bmw.add("128i");
		
		ArrayList<String> audi = new ArrayList<>();
		audi.add("A3");
		audi.add("A70");
		audi.add("Q8");
		
		ArrayList<String> zhiguli = new ArrayList<>();
		zhiguli.add("7");
		zhiguli.add("5");
		zhiguli.add("6");
		
		vehicles.add(zhiguli);
		vehicles.add(bmw);
		vehicles.add(audi);
		
		System.out.println(vehicles);
		
		for(ArrayList<String> make : vehicles) {
			if(make.contains("e30")) {
				System.out.println(make.get(1));
			}
		}
		
	}
}
