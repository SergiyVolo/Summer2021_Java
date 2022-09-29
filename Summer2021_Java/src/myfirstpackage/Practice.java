package myfirstpackage;

public class Practice {
	public static void main(String[] args) {
		
		System.out.println("987" + 6 + 5);    // 98765
		System.out.println("123" + (4 + 5));  //1239
		System.out.println(3 + "4" + 5);      //345
		System.out.println(3 + ("4" + 5));    //345
		System.out.println(3+ 4 + "5");       //75
		System.out.println((3 + 4) + "5");    //75
	
		int grade;
		grade = 101;
		
		if (grade >= 0 && grade < 55) {
			System.out.println("Fail");
		} else if (grade >= 55 && grade < 80) {
			System.out.println("Pass");
		} else if ( grade >= 80 && grade <= 100) {
			System.out.println("Passed with Distinction");
		} else if ( grade < 0 || grade > 100) {
			System.out.println("Not valid grade");
		}
	
		String browser;
		browser = "Test";
		switch(browser) {
		case "Chrome":
			System.out.println("Chrome is the most popular browser");
			break;
		case "Firefox":
			System.out.println("Firefox is the second most popular browser");
			break;
		case "Edge":
			System.out.println("Mostly used by Federal employees");
			break;
			default:
				System.out.println("Not valid browser");
		
				String text1 = "Thursday";
				String text2 = "Friday";
				
//				System.out.println(text1.length());
//				System.out.println(text2.length());
				
				int difference;
				difference = text1.length() - text2.length(); 
				
				System.out.println(text1.length() > text2.length() ?  "Word 'Thursday' is longer than word 'Friday' by " + difference + " " + " letters" : "the opposite");
				System.out.print("Thursday is a " + text1.length() + " " + "letters word and ");
				System.out.println("Friday is a " + text2.length() + " " + "letters word.");

				//		boolean res = text1.length() > text2.length();
//				System.out.println(res);
				
			String word = "Java";
			System.out.println(word.length());
			
			int lengthOfWord = word.length();
			System.out.println(lengthOfWord);
			
			System.out.println(word.charAt(5-5));
			
			String sentence = "java is fun and easy to learn!";
			System.out.println(sentence.indexOf("t"));
				
			System.out.println();	
			
			
//			 * Task:  text: SDLC is so much fun and super easy!
//			 * 
//			 * replace all the "u" characters that go after the word "and" with "?"
//			 */
//			String text = "SDLC is so much fun and super easy!";
//			String replaced = "";
			
			
		}
		
	int x = 2;
	int y = -1;
	while (y>0) {
		double result = Math.pow(x, y);
		System.out.println(result);
		break;
	}
	
	
	
	int x1 = 10;
	int y1 = 20;
	
	int res = Math.min(x1, y1);
	System.out.println(res);
	
	String text1 = "Hello guys!";
	String text2 = "Good!";
	System.out.println(text1.compareTo(text2));
	
	String email = "voloshynsll@yahoo.com";
		char name1 = email.charAt(0);
		int name2 = email.indexOf('@');
		String name3 = email.substring(0, email.indexOf('@'));
		
		String name4 = email.substring(email.indexOf('@')+1);
		
		System.out.println(name4);
		
		String name = "leadbelly";
		String domain = "blues.com";
		String email1 = name +"@"+ domain;
		System.out.println(email1);
		
		
		
		String emailAddress = name+"@"+domain+".com";
		 
		Boolean  bol = email.equals(emailAddress);
		System.out.println(bol);
		
		
		
		Boolean isJavaEasy = false;
		System.out.println(isJavaEasy);
	}

	
}	




