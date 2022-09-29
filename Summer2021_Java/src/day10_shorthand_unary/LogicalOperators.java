package day10_shorthand_unary;

public class LogicalOperators {
	
	/*
	 * Logical AND (&&): both operands have to resolve to true for the final result to be true
	 * Logical OR (||): at least one of the operands have to resolve to true for the final result to be true 
	 * Logical NOT (!): also called logical negation and reverses the boolean expression
	 */
	
	
	public static void main(String[] args) {
		
System.out.println(true && false);
		
		//                 true   &&  true
		System.out.println(10 > 9 && 9 < 10);
		
		//                 false  &&  true
		System.out.println(3 >= 5 && 12 != 10);
		
		//                  true     || false
		System.out.println(123 > 'A' || false);
		
		System.out.println(!false);
		
		//                      !(false         ||        false)
		System.out.println(!("Java" == "Easy" || !(6 < 'Y')));
		
		
		System.out.println(!!!!!true);
		
		/*
		 * shorthand logical operators:
		 * if from the left side we can see the final result, Java will skip the execution of the right side
		 *  - &&
		 *  - ||
		 * 
		 * the following logical operators will evaluate both sides 
		 * regardless of the result that we got from the left side
		 * &
		 * |
		 */
		
		int num1 = 10;
		int num2 = 15;
		
		//                 false           num1 = num1 + 5
		System.out.println(10 > 100 & (num2 = num1 += 5) > 25);
		
		System.out.println("The value of num1 is: " + num1);
		System.out.println("The value of num2 is: " + num2);
		
		int b = 2;
		
		// memory: b = 2
		//               false || true && false
		boolean result = ++b == 2 || --b == 2 && --b ==2;
		System.out.println(result);
		
		System.out.println(10 % 2 != 0);
		
		
//		 int hoursWorked = 41;
//		 boolean workedOvertime = hoursWorked > 40;
//		 System.out.println(workedOvertime);
		 
		 
		 int numbersOfCredits = 3;
		 boolean isEmpty = numbersOfCredits == 0 || numbersOfCredits == 3;
		 System.out.println(isEmpty);
		 
		 int modelYear = 1990;
		if ( modelYear  < 2001 && modelYear > 2006) {
			 System.out.println("NO RECALL");
		} else {
			System.out.println("RECALL");
		}
		int modelYear1 = 1990 ;
		String Extravagant = null;
		String modelName = Extravagant;
		if ( modelYear1 >= 1999 && modelYear1 <= 2002 || modelName == Extravagant) {
			System.out.println("RECALL");
		}
	}

}
