package interview_java_programs;

public class Practice {

	public static void main(String[] args) {
		
//	   palindrome
		
		String text = "Level";
		String revText = "";
		System.out.print(revText);
		
		for (int i = text.length() - 1; i >= 0; i--) {
			revText = revText + text.charAt(i);
			}
		    
		     
		     if(text.equalsIgnoreCase(revText)) {
		    	 System.out.println("True: " + text +" and "+revText + " are palindrome.");
		     }else {
		    	 System.out.println("False: " + text + " and "+revText + " are not palindrome."); 
		     }
		
	}

}
