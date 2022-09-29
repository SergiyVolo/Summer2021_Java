package day14_String_Methods;

public class IndexOf_Method {
       
	public static void main(String[] args) {
		
//      0123456789
	String str1 = "It's raining outside";
	
	System.out.println(str1.indexOf('o'));
	
	int num1 = str1.indexOf('o');
	System.out.println(num1);
	
	
	System.out.println(str1.indexOf('i'));
	
	System.out.println(str1.indexOf("xyz")); // -1 will be outputted in case the string is not present 
	
	
	/*
	 * Address: 10304 Eaton Pl Suite 100, Fairfax, VA 22030
	 * 1. Find the index of the beginning of the Street Name
	 * 2. Find the index of ending of the Street Name
	 * 3. Cut the street name using substring method
	 * 
	 * 4. Cut the city name using combination of indexOf() and substring()
	 * 5.
	 * 6.
	 * 
	 */
	
	//                01234567891011
	String address = "10304 Eaton Pl Suite 100, Fairfax, VA 22030";
	int beginIndexStreet = address.indexOf('E'); // 6
	
	
	//                              10       + 1
//	int endIndexStreet = address.indexOf('n') + 1;   // 10
	int endIndexStreet = address.indexOf("P");
	System.out.println(endIndexStreet);
	
	String streetName = address.substring(beginIndexStreet, endIndexStreet);
	System.out.println(streetName);
	
	int beginIndexCity = address.indexOf('F');
	int endIndexCity = address.indexOf(", V");
	
	String city = address.substring(beginIndexCity, endIndexCity);
	System.out.println(city);
	
	System.out.println(address.lastIndexOf(","));
	System.out.println(address.indexOf('x'));
	
	int beginState = address.indexOf('V');
	int endState = address.indexOf('2');
	String state = address.substring(beginState, endState);
	System.out.println(state);
	
	
	int beginSuit = address.indexOf('S');
	int endSuit = address.indexOf('e');
	String  suit = address.substring(beginSuit, endSuit);
	System.out.println(suit);
	
		
		
	}
}
