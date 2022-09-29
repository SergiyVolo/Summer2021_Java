package review_session4;

public class String_Method_Recap {

	public static void main(String[] args) {
		
//		String str1 = "Good Morning";
//		//charAt()
//		System.out.println(str1.charAt(4));
//		//length()
//		System.out.println(str1.length());
//		//concat()
//		String str2 = " ahmad";
//		System.out.println(str1.concat(str2).concat(str2));
//		//toLowerCase()
//		System.out.println(str1.toLowerCase());
//		//toUpperCase()
//		System.out.println(str1.toUpperCase());
//		//
//		String cat = str2.substring(0,2).toUpperCase();
//		System.out.println(cat+str2.substring(2));
//		//trim()
//		String str3 = "       hello     	";
//		System.out.println(str3.trim());
//		//
//		System.out.println(str1.substring(2));
//		System.out.println(str1.substring(2, 9));
//		System.out.println(str1.substring(0, str1.length()-3));
//		System.out.println(str1.substring(str1.length()-3).toUpperCase());
//		//replace()
//		System.out.println(str1.replace(str1.charAt(0), 'M'));
//		System.out.println(str1.replaceFirst("o", "N"));
//		System.out.println(str1.replaceAll("o", "I"));
//		//indexOf()
//		String str5 = "prime tech teacher ";
//		System.out.println(str5.indexOf("ec"));
//		System.out.println(str5.lastIndexOf('e'));
//		
//		String str7 = "";
//		String str8 =  " ";
//		String str9 = "Get my computer"; 
//		boolean empty = str7.isEmpty();
//		boolean empty2 = str8.isEmpty();
//		boolean empty3 = str9.isEmpty();
//		System.out.println(empty);
//		System.out.println(empty2);
//		System.out.println(empty3);
//		boolean empty4 = str7.isBlank();
//		boolean empty6 = str8.isBlank();
//		boolean empty7 = str9.isBlank();
//		System.out.println(empty4);
//		System.out.println(empty6);
//		System.out.println(empty7);
//		
//		String text = "Easy"; 
//		String text1 = "easy";
//		System.out.println(text.equals(text1));
//		System.out.println(text.equalsIgnoreCase(text1));
//		String text2 = "I am SDET";
//		System.out.println(text2.contains("am"));
//		System.out.println("================");
//		System.out.println(text2.startsWith("I"));
//		System.out.println(text2.startsWith("i"));
//		
//		System.out.println(text2.endsWith("ET"));
//		System.out.println(text2.endsWith("et"));
//		
//		String text3 = "abc";
//		String text4 = "abcd";
//		String text5 = "abc"; 
//		
//		System.out.println(text3.compareTo(text4));
//		System.out.println(text4.compareTo(text3));
//		System.out.println(text3.compareTo(text5));
//				
		int  a = 2; //a =1
		int  b = 1;  //b =2 
		int temp=0; 
		System.out.println(a + "," + b);
		temp = a; //2
		a = b; //1 
		b = temp; 
		System.out.println(a + ","+ b);
		
		System.out.println("=============");
		
		a = a + b; //a=3
		b = a - b; //2
		a = a - b; //a=1
		System.out.println(a + ","+ b);
		 
		
		String task = "my car is the best, my car doesn't run though, car is red, car with four wheel";
		
		int counter = 0;
		
		for (int i=0;i<task.length()-1 ;i++ ) {
			if(task.substring(i, i+2).equals("is")) {
				counter++; 	
			}
		}
		
		System.out.println(counter);
		
		int counter2 = 0;
		
		while(task.contains("car")) {
			task = task.replaceFirst("car", "");
			counter2++;
		}
		
		System.out.println("Second counter " + counter2);
		
		
		

	}

}
