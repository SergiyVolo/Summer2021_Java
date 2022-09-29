package review_session2;

public class Name_Change {

	public static void main(String[] args) {
		
		// Switch the values of two strings
		
				String name1 = "Rani";  // Rani -> Kian
				String name2 = "Kian";
				
				// Solution 1
//				String temp;
				
//				temp = name1;
//				name1 = name2;
//				name2 = temp;
//				
//				System.out.println(name1 + " " + name2);
				
				
				// Solution 2
				//                                R       K
				name1 = name1.replace(name1, name2);
				name2 = name2.replace("Kian", "Rani");
				System.out.println(name1 + " " + name2);
				
				
				/*
				 * Task:  text: SDLC is so much fun and super easy!
				 * 
				 * replace all the "u" characters that go after the word "and" with "?"
				 */
				
				String text = "SDLC is so much fun and super easy, pleasure to study uuuuuuuu!";
				
				// 1st method
				String replaced = "";
				
				replaced = text.replace("up", "?p");
				System.out.println(replaced);
				
				String replaced2 = replaced.replace("ur", "?r");
				String replaced3 = replaced2.replace("ud", "?d");
				
				System.out.println(replaced3);
				
				
				// second method - break down into two substrings
				String substring1 = text.substring(0, text.indexOf("su"));
				System.out.println(substring1);
				
				String substring2 = text.substring(text.indexOf("su"));
				System.out.println(substring2);
				
				String replacedSubstring2 = substring2.replace("u", "?");
				
				System.out.println(substring1.concat(replacedSubstring2));

	}

}
