package day33_interview_prep;

public class Kahoot_Review {

	/*
	 * 1. What does the binary number 101 represent in decimal form?  
	 * 2 1 0
	 * 2 2 2
	 * 4 2 1
	 * 1 0 1 = 1*1 + 2*0 + 4*1 = 5
	 * 
	 * 2. Choose the correct CLI representation of 1. Open folder 2. List contents 
	 *                                                 of folder 3. Navigate back
	 * 
	 *    cd folder, ls, cd ..
	 *    
	 * 3. JDK installation requires .exe file for Windows and .dmg file for MacOS systems
	 *    true
	 *    
	 * 4. 3 main components of Java are...  JVM, JRE, JDK
	 * 
	 * 5. "java filename.class" command is used to execute compiled java code - false
	 * 
	 * 	   javac filename.java
	 * 	   java filename
	 * 
	 * 6. Which of the following is not a legal identifier in Java?
	 * 
	 *   - getSize
	 *   - 1stName   checkmark
	 *   - _4_
	 *   - $
	 * 
	 * 7. Narrowing, in the context of Java variables, is also called... explicit casting
	 * 
	 * 8. 8-byte long can be assigned to a 4-byte float - one of the exceptions due to float's range
	 */
	
	
	public static void main(String[] args) {
		
		// 9. Compilation fails
//		int a = 10;
//		int b = a++ + ++a + b + a-- - --a -a;
//		System.out.println(a);
		
		
		// 10. 
		int x = 100;
		int y = (byte) 100;
		System.out.println(x >= y && (x + 1 == x*2/2 +1)); // true
		
		// 11. In a multi-branch if statement we can have as many "else if" conditions as we would like - true
		
		// 12. "You've passed the exam"
		
		char grade = 'A';
		
		boolean isPassed = grade == 'A' || grade == 'B'; // true
		boolean isPassed2 = grade == 'C' || grade == 'D';// false
		
		if(isPassed || isPassed2) {
			System.out.println("You've passed the exam");
		} else {
			System.out.println("You failed");
		}
		
		// 13. "Hello, World 9"
		
		int number = 10;
		
		if(--number > 10) {
			System.out.println("Hello Prime Tech " + number);
		} else if (number == 9) {
			System.out.println("Hello, World " + number);
		}
		
		// 14. Switch expression can't accept boolean, float, double and long data types - true
		
		// 15. "Job" == new String("Job")  - false
		
		// 16. for(int i = 0; i > 0; --i){ } - the loop won't start
		
		// 17. The "new" keyword is used to create a new object. - true
		
		// 18. 
		
		int age = 30;
		increaseAge(30);
		
		System.out.println(age); // 30
		
		// 19. Default access modifier is less restrictive than protected. - false
		
		
		// 20. Which of the following is NOT true about constructors?
		
		// doesn't have return type
		// must match class name
		// always automatically provided by Java - false
		// gets triggered at object creation
		
		// 21. An object becomes eligible for garbage collection when...
		
		// System.gc() gets called; - suggests GC to start running
		// Object existed for too long; - false
		// Method finalize() gets invoked - false
		// No references exist that point to the object - true
		
		// 22. Separate class
		
		// 23. int[] nums = new int[] {5, 22, 3, 41}; - is a valid array declaration.
		
		// 24. for(String text : object) - for the code to compile, the "object" must be a...
		
		// - String
		// - Array x
		// - Map
		// - StringBuilder
		
		// 25. Overloaded methods can be located in both super-class and child-class - true
		
		// 26. Which of the following is not an overriding rule?
		
		// - Overriding method's access modifier must be more restrictive - false
		// - There must be an IS-A relationship
		// - Method signature must be the same
		// - Return types must the same or covariant
		
		// 27. You can extend an interface - true
		
		// 28. The first non-abstract class that's required to implement abstract methods is called ... concrete class
		
		// 29. Which of the following is NOT a part of the Java exception mechanism?
		
 		// - Error;
		// - Unchecked Exc
		// - Checked Exc
		// - Failures -  false
		
		// 30. To prevent unreachable code in try-catch block we should catch the broadest exception first - false
		
		// 31. Map interface has all these methods, except for...
		
		// - remove();
		// - add();   - false
		// - get();
		// - entrySet();
		
		// 32. You can get any of the elements of a Set and ArrayList by providing an index of the element - false
		
		// 33. To automate Excel read/write functionalities we need to import... Apache POI libraries/ JARs
		
		// 34. In what type of storage data is preserved even after JDK has finished executing a program?
		//     External storage
		
		// 35. Slide
		
		// 36. "Java"
		
		String s = "Java";
		s.concat(" SE 6");
		s.replace('6', '7');
		System.out.println(s);
		
		// 37. Separate class 
		// line 12 - compilation fails, variable b is only visible within the pass() method
		
		// 38. 
		
		int [] a = {1,2,3,4,5,6};
		int i = a.length - 1; // 5
		
		//    5 >= 0
		while(i >= 0) {
			System.out.println(a[i]);  // 654321
			i--;
		}
		
		// 39. 
		
//		int x1 = 0; y = 10;
//		
//		try {
//			y /= x;
//		}
//		System.out.println("/ by 0");
//		catch (Exception e) {
//			// syso needs to be placed here
//			System.out.println("error");
//		}
		
		// 40. A and E are classes, B and D are interfaces, C is an abstract class. Choose an INCORRECT statement below.
			
		// - class F implements B { }
		// - class F extends E { }
		// - class F implements B, C { } - false
		// - class F implements B, D { }
	}

	private static void increaseAge(int age) {
		age = age + 1;
	}
	
	
	
}

