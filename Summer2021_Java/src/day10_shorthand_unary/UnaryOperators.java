package day10_shorthand_unary;

public class UnaryOperators {
	
	public static void main(String[] args) {
		
		int num1 = 100;
		num1++;
		System.out.println(num1);
		
		int num2 = 10;
		num2--;
		System.out.println(num2);
		
		byte byte1 = 101;
		System.out.println(++byte1);
		
		short short1 = 56;
		System.out.println(--short1);
		
		int num3 = 1028;
		System.out.println(num3++);
		
		int a = 1;
    //       -1  + 0   /  -1  * -1		
		a = -a-- + a++ / -a-- * --a;
		System.out.println(a);
		
		int m = 50;
//           49 + 49  + 50 + 49		
		m = --m + m++ + m-- + m++;
		System.out.println(m);
		
		int num4 = 4;
		int num5 = num4 * 4 - num4++ + num4;
		System.out.println(num5);
		
//	                   25   in memory 26
		int z = 25;
		System.out.println(z++);
//                         26   in  memory 25 
		System.out.println(z--);
        System.out.println(--z);
		
		
		
		
	}
}
