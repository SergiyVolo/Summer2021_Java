package day14_String_Methods;

public class Substring_Method {

	public static void main(String[] args) {
		
	
		// 1st variation of substring		
				//       index:0123
				String str1 = "Java";
				
				System.out.println(str1.substring(1));
				
				String portion = str1.substring(3);
				System.out.println(portion);
				
				//                  0123
				System.out.println("Text".substring(2));
				
				int num1 = 2;
				System.out.println("Orange".substring(num1));
				
		// 2nd variation of substring
				
				//             0123456789
				String str2 = "Watermelon";
				System.out.println(str2.substring(2, 5));
				// first index is inclusive and second index is exclusive
				
				//                 0123456
				String portion1 = "My address is Fairfax".substring(2, 4);
				System.out.println(portion1);
				
//				System.out.println("Hello".substring(2.0f)); // takes only an integer as an input
				
				
				/* index:   0123456789
				 * Address: 10304 Eaton  Pl Suite 100, Fairfax, VA 22030
				 * 1. extract the zip code
				 * 2. extract city
				 * 3. print them out
				 */
				
				//                                          27      34
				String address = "10304 Eaton  Pl Suite 100, Fairfax, VA 22030";
				String zipCode1 = address.substring(address.length() - 5);
				String zipCode2 = address.substring(39);
				System.out.println(zipCode1);
				System.out.println(zipCode2);
				
				String city = address.substring(27, 34); 
				System.out.println(city);
				
				System.out.println(address.charAt(36));
	}

}
