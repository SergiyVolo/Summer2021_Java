package day32_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static utilities.Config.*;

public class Personal_Data {

//	Create a class Personal_Data;
//	You would need to create two data structures to store names and social 
//	security numbers;
//	One of these data structures should be able to store duplicates and 
//	the other one - shouldn't allow duplicates (make your own determination
//	where names and SSNs should be stored);
//	Add 5 elements to each of these data structures (at least two of them should
//	be duplicates);
//	Print the number of elements stored in each of these data structures;
//	Create a config.properties file;
//	Create a key-value pair: key - selection, value - names;
//	Use the Utility that we've built together to connect to the properties file;
//	Write a code that pulls the data from the properties file and based on the 
//	value stored in the key-value pair will print either the data structure where 
//	names are stored (if the value is "names") or the SSNs (if the value is "SSNs");
//	Run the code and let it print all the elements of the data structure to a console 
//	and see if duplicates were removed;
//	Change the value of selection to SSNs;
//	Run the code and let it print all the elements of the data structure to a console
//	and see if duplicates were removed
	
	public static void main(String[] args) {
		
		List<String> names  = new ArrayList<>();
		names.add("Peter");
		names.add("Jane");
		names.add("Jane");
		names.add("Dmitry");
		names.add("Ahmed");
		
		System.out.println(names.size());
		
		Set<String> SSNs = new HashSet<>();
		SSNs.add("54738393");
		SSNs.add("84940443");
		SSNs.add("39400440");
		SSNs.add("54738393");
		SSNs.add("54738393");
		
		System.out.println(SSNs.size());
		System.out.println(SSNs);
		
		if(getProperty("selection").equals("names")) {
			System.out.println(names);
		} else if (getProperty("selection").equals("SSNs")) {
			System.out.println(SSNs);
		} else {
			System.out.println("This option doesn't exist");
		}
	}
}
