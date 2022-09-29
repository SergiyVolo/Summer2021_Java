package day10_shorthand_unary;

public class Warmup_Task {
	
	public static void main(String[] args) {
		
		double gallons = 5;
		double liters = 3.785*gallons;
		System.out.println(gallons + " gallons is equal to " + liters + " liters");
		
		/*
		 * Unary operators:
		 * 	1. -
		 * 	2. + 
		 * 	3. ++ - increment: increases the value by 1
		 * 			- pre-increment: the value will be increased by 1 and then used in the expression
		 * 			- post-increment: the value will be used in the expression and then will be increased by 1 
		 *  4. -- - decrement: decreases the value by 1
		 *  		- pre-decrement: the value will be decreased by 1 and then used in the expression
		 *  		- post-decrement: the value will be used in the expression and then will be decreased by 1 
		 * 
		 * ++ -> +
		 * +- -> -
		 * -+ -> -
		 * -- -> +
		 * 
		 */
		
		int a1 = 10;
		int b = -a1;
		System.out.println(b);
		
		int c = +b;  // +(-10) -> -10
		System.out.println(c);
		
		int d = -c;  // -(-10) -> 10 
		System.out.println(d); 
		
		
		int num1 = 100;
		num1++;
		System.out.println(num1);
		
		int num2 = 10;
		num2--;
		System.out.println(num2);
		
		
		/*
		 * For pre- operators the value will be changed first and then used 
		 * in the expression
		 */
		byte byte1 = 101;
		System.out.println(++byte1); // 102
		
		short short1 = 56;
		System.out.println(--short1); // 55
		
		
		int num3 = 1028;
		System.out.println(num3++);  // printed: 1028, in memory: num3 = 1029
		System.out.println(num3);    // 1029
		
		long long1 = 37;
		System.out.println(long1--);  // printed: 37, in memory: long1 = 36
		System.out.println(long1);    // 36
		
		int x = 2;
		int y = x++;  // y = 2, x = x + 1 = 3
		System.out.println(--x);
		
		int x1 = 8;
		int y1 = x1--;
		System.out.println(y1);       // y1 = 8
		System.out.println(x1-- + -5);   // 2
		
		int i = 1;
		int t = 2;
		//                 2   + 1
		System.out.println(t++ + i);
		
		
		
		int a = 1;
		
		// -1 + a++ / -a-- * --a;
		// memory: a = 0
		
		// -1 + 0 / -a-- * --a;
		// memory: a = 1
		
		// -1 + 0 / -1 * --a;
		// memory: a  = 0
		
		// -1 + 0 / -1 * -1;
		// memory: a  = -1
		a = -a-- + a++ / -a-- * --a;
		
		System.out.println(a);  // -1
		
//=================================================================		
		
		int m = 50; 
		
		// memory: m = 50
		//  49  + 49 + 50 + 49 = 
		m = --m + m++ + m-- + m++;
		System.out.println(m);
		
		int num4 = 4;
		//             16   -   4 (memory: num4 = 5)
		int num5 = num4 * 4 - num4++;
		System.out.println(num5);
		System.out.println(num4);
		
		int q = 2;
		int w = 3;
		
		//         2 * 3
		int num6 = q * w++;
		System.out.println(num6);  // memory: w = 4
		
		//         2 * 5
		int num7 = q * ++w;
		System.out.println(num7);  // 10
		
		int j = 45;
		--j;
		System.out.println(j);
		
	}

}
