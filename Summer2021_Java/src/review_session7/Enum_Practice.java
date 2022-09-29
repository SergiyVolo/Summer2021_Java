package review_session7;

import java.util.Arrays;

public class Enum_Practice {

	public static void main(String[] args) {
		
		
		
		// Saving the Enum value Google into the Webistes container
		Websites site = Websites.GOOGLE;
		
		if(site == Websites.GOOGLE) {
			System.out.println("Navigating to Google");
		} else {
			System.out.println("Not opening website");
		}
		
		Websites[] sites = Websites.values();    // gives you all the values that are
		                                         //   stored in the Enum 
		
		System.out.println(Arrays.toString(sites));
		
		System.out.println(sites[0]);
		System.out.println(sites[2]);
		
		System.out.println(sites[1].ordinal()); //gives you back the index of the element
		
		for(Websites website : sites) {
			if(website == Websites.AMAZON) {
				System.out.println("The index of Amazon within Enum " + website.ordinal()); 
			}
//			System.out.println(website.ordinal());
		}
		
		
	}
	
}

