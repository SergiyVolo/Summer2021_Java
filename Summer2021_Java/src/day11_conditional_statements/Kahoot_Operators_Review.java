package day11_conditional_statements;

public class Kahoot_Operators_Review {
	
	public static void main(String[] args) {
		

		// Q1
		boolean isMorning = !!!!!false;
		System.out.println(isMorning);  // true
		
		// Q2             true  !=   true
		boolean result = !false != ("Java" != "Easy");
		System.out.println(result);  // false
		
		// Q3
		int a = 100;
		double b = a += 100.0/20;  // b = a = a + 5
		System.out.println(a);   // 105

		// Q4
		// What's the most used Java version?
		// Java 8 
		
		// Q5              true   ||  false   -> true
		boolean bool1 = 128 > '7' || 5 == 4;
		System.out.println(bool1);
		
		// Q6
		boolean bool2;
		//       false &&  ? 
		bool2 = 4 >= 5 && 'a' > 'b';
		System.out.println(bool2);  // false
		
		// Q7
		int x = 9999999;
		int y = 10;
		System.out.println(x * y / 10 % x); // 0
		
		// Q8
		int x1 = 100;
		int y1 = (byte) 100;  // 100
		//                 true   &&  101 == 101
		System.out.println(x >= y && (x + 1 == x*2/2 + 1));  // true
		
		// Q9
//		int a1 = 50;
//		System.out.println("a > 50 : " + bool3);  // bool3 hasn't been declared yet
//		boolean bool3 = true;
		
		// Q10
		//What's the output of the following statement: System.out.println(2 + 9 + "6");
		System.out.println(2 + 9 + "6");  // "11" + "6" -> 116
		System.out.println("6" + 2 + 9); // 629
		
		// Q11
		boolean bool4 = 1 + 11 + "3" == "123";
		System.out.println(bool4);   // true
		
		// Q12
		int num1 = 100;
		num1 += 200;  // num1 = num1 + 200 -> num1 = 300
		System.out.println(num1++ + " " + num1); // 300 301
		
		// Q13
//		int a1 = 10;
//		int b1 = a1++ + ++a1 + b1 + a1-- - --a1 - a1;  // local vars can't be touched until assigned a value
//		System.out.println(a1);
		
		// Q14
		//                    100 % 100 -> 0
		System.out.println((10 * 2) / (5 * 4) * 1000 / 10 % 100);  // 0
		
		// Q15
		// Which of the following is NOT a scrum team in PrimeTech:
		
		// troublemakers	
		
	}

}
