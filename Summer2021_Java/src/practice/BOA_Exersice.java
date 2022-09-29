package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BOA_Exersice {

	public static void main(String[] args) {
		
/*	        Go to the Bank of America website (https://www.bankofamerica.com/) and
 *   locate two upper tabs (one starts with 'Personal', other - with 'Checking' - 
 *                  see the attached picture);
           Save contents of these tabs into two different array lists;
*			add “Wealth Management” from the first list to the second list;
*			remove “Better Money Habits” from the second list;
*			sort the second list;
*			check if the second list contains all the elements of the first list;
*/
		ArrayList<String> arr1 = new ArrayList<>();
		   arr1.add("Personal");
		   arr1.add("Small Business");
		   arr1.add("Wealth Management");
		   arr1.add("Business & Institutions");
		   arr1.add("Security");
		   arr1.add("En espanol");
		   arr1.add("Contact Us");
		   arr1.add("Help");
		   System.out.println(arr1);
		   
		   ArrayList<String> arr2 = new ArrayList<>();
		   arr2.add("Checking");
		   arr2.add("Savings");
		   arr2.add("Credit Cards");
		   arr2.add("Home Loans");
		   arr2.add("Auto Loans");
		   arr2.add("Investing");
		   arr2.add("Better Money Habits");
		   arr2.add("Wealth Management");
		   arr2.remove("Better Money Habits");
		   Collections.sort(arr2);
		   System.out.println(arr2);
		   
		 if(arr2.containsAll(arr1)) {
			 System.out.println("ArrayList arr2 contains all the elements of the ArrayList arr1");
		 } else {
			 System.out.println("ArrayList arr2 does not contain all the elements of the ArrayList arr1"); 
		 }
		   
		   
		   
	}

}
