package myfirstpackage;

import java.util.Scanner;

public class My_Program_3 {

	public static void main(String[] args) {
//            String answer = "Ta-Da";
		
		String text1 = "I will turn this simple sentence in a cool thing!";
		System.out.println(text1);
     
		
		Scanner stdin = new Scanner(System.in);
		
    	
		
    	char char1 = text1.charAt(text1.length() - 29);
		char char2 = text1.charAt(text1.length() -40);
		char char3 = text1.charAt(text1.length() - 4);
		char char4 = text1.charAt(text1.length() -30);
		char char5 = text1.charAt(text1.length() -24);
		char char6 = text1.charAt(text1.length() - 7);
		char char7 = text1.charAt(text1.length() - 6);
		char char8 = text1.charAt(text1.length() -18);
		char char9 = text1.charAt(text1.length() - 11);
		char char10 = text1.charAt(text1.length() -5);
		char char11 = text1.charAt(text1.length() -1);

	    String  charTotal =(""+ char1 + char2 +char3 + char4 + char5 + char6 + char7 + char8 + char9 + char10 + char11);
	    String textAllUpperCase = charTotal.toUpperCase();
		
		
		while(true ) {
			System.out.println("All you have to do is enter Ta-Da");
			String text2 = stdin.nextLine();
			System.out.println("The text you entered is: " + text2);
		
			if(text2.equals("Ta-Da")) {
		System.out.println(textAllUpperCase);
		break;
		}
		}	
		
		stdin.close();
	
}

}
