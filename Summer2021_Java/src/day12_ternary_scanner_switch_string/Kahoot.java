package day12_ternary_scanner_switch_string;

public class Kahoot {

	public static void main(String[] args) {
		// Q1
				int num1 = 9;
				
				//  9  == 10 -> false 
				if(num1++ == 10) {
					System.out.println("Apple " + num1);
				} else {
					System.out.println("Orange " + num1);  // Orange 10
				}
				
				
				// Q2
				int score = 0;
				
				//    true
				if(score == 0) {
					score += 50;     // score = score + 50 = 0 + 50 = 50
				}
				
				//    true
				if (score != 0) {
					score += 50;     // score = score + 50 = 50 + 50 = 100
				}
				
				System.out.println(score); // 100
				
				
				// Q3
				char grade = 'A';
				
				//                     true     ||   false
				boolean isPassed = grade == 'A' || grade == 'B';   // true
				
				//                     false     ||    false
				boolean isPassed2 = grade == 'C' || grade == 'D';  // false
				
				
				//  true    ||   false
				if(isPassed || isPassed2) {
					System.out.println("Passed");  // "Passed" will be printed
				} else {
					System.out.println("Failed");
				}
				
				// Q4
				boolean a = true, b = !false;
				
				if(b) {
					System.out.println("B");
				} else if (a) {
					System.out.println("A");
				} else {
					System.out.println("C");
				}
				
				// Q5
//				boolean result = true;
//				
//				if(result) {
//					System.out.println("True");
//				} else {
//					System.out.println("False");
//				} else if (result) {
//					System.out.println("None of the above");
//				}
				
				
				// Q6
				// In a multi-branch if statement we can give as many "else if" conditions as we want
				// True
				
				
				//Q7
				// When we declare if statement it is mandatory to provide the else block
				// False
				
				//Q8
				boolean a1 = true, b1 = !a1;  // a1 true, b1 false
				
				if(a1) {
					if(b1) {
						System.out.println("Monday");
					} else {
						System.out.println("Tuesday");  // will be printed
					}
				} else {
					if(a1) {
						System.out.println("Thursday");
					} else {
						System.out.println("Friday");
					}
				}
				
				//Q9
				int number = 10;
				
				//    9 > 10 -> false
				if(--number > 10) {
					System.out.println("Hello, Prime Tech " + number);
				} else {
					System.out.println("Hello, World " + number); // "Hello, World 9"
				}
				
				// Q10
				boolean x = true;
				//                     false == false
				boolean y =             !x == false;  // true
				boolean z = y; // true
				
				if(x) {
					System.out.println("Hello, everyone!");
				} 
				
				
				if(y) {
					System.out.println("Today is a great day!");
				} 
				
				
				if (z) {
					System.out.println("Nice work, everyone!"); 
				}
				
				// all of them will be printed

	}

}
