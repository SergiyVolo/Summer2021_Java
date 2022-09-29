package practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import utilities.Config;

public class Personal_Data {

	public static void main(String[] args) throws IOException {

		ArrayList<String> names = new ArrayList<>();
		names.add("Steve");
		names.add("Paul");
		names.add("Steve");
		names.add("Anna");
		names.add("Liz");
		System.out.println(names.get(1));

		System.out.println(names.size());

		Set<String> ssNumbers = new HashSet<>();
		ssNumbers.add("123-45-6781");
		ssNumbers.add("223-45-6782");
		ssNumbers.add("323-45-6783");
		ssNumbers.add("423-45-6784");
		ssNumbers.add("123-45-6781");

		System.out.println(ssNumbers.size());

		
		if (Config.getProperty("selection").equals("names")) {
			System.out.println(names);
		} else if (Config.getProperty("selection").equals("ssNumbers")) {
			System.out.println(ssNumbers);
		} else {
			System.out.println("Not valid data");
		}
	}

}
