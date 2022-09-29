package day32_collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Nested_Collections {

	public static void main(String[] args) {
		
		HashSet<String> VASSNs = new HashSet<>();
		VASSNs.add("4784849491");
		VASSNs.add("5895944002");
		VASSNs.add("4984949403");
		
		System.out.println(VASSNs);
		
		HashSet<String> DCSSNs = new HashSet<>();
		DCSSNs.add("4744849494");
		DCSSNs.add("5898944005");
		DCSSNs.add("4984923406");
		
		System.out.println(DCSSNs);
		
		HashSet<String> MDSSNs = new HashSet<>();
		MDSSNs.add("4784819497");
		MDSSNs.add("5895944808");
		MDSSNs.add("4984749409");
		
		System.out.println(MDSSNs);
		
		ArrayList<HashSet<String>> USASSNs = new ArrayList<>();
		USASSNs.add(MDSSNs);
		USASSNs.add(VASSNs);
		USASSNs.add(DCSSNs);
		
		System.out.println(USASSNs);
		
		System.out.println(USASSNs.get(0));
		
		for (String SSN : USASSNs.get(0)) {
			if(SSN.equals("4784819490")) {
				System.out.println(SSN);
			}
		}
	}
	
}
