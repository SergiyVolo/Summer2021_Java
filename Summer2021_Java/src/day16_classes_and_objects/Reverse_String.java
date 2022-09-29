package day16_classes_and_objects;

public class Reverse_String {

	/*
	 * 
	 * Given a String output the reverse of that String
	 * 
	 * Java -> avaJ
	 */
	
	public static void main(String[] args) {
			
		//             01234
		String text = "test";  // length = 4
		
		
		
//System.out.println("" + text.charAt(3) + text.charAt(2) + text.charAt(1) + text.charAt(0));  // ?
		
		for (int i = text.length() - 1; i >= 0; i--) {
			System.out.print(text.charAt(i));   // a -> v -> a -> J
		}
		System.out.println();
          
		System.out.println(text.length());
	}

}
