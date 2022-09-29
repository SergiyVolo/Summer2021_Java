package day8_variables;

public class Casting {
	
	/*
	 * Casting - is the conversion of one data type to another
	 * 
	 * Casting:
	 * 		- implicit casting: is conversion from smaller data type to a bigger
	 *  datatype
	 *  	- explicit casting: is conversion from a bigger data type to a smaller 
	 *  datatype
	 * 
	 * General rule: smaller can be assigned to a bigger datatype without explicit 
	 * casting
	 * 
	 * Exception:
	 * 	- long (8 byte) can be assigned to float (4 byte) because float's range is 
	 * bigger than long's
	 *  - integer in the numeral form can be assigned to byte and short 
	 *  (used for convenience)
	 *  - char can't be assigned to short since it's range is shifted to a positive
	 *   side, although both are 2-byte datatypes.
	 * 
	 */

	public static void main(String[] args) {
		
//      short num1 = 12;
//		
//		 8-byte   2-byte
//		long num2 = num1;     // an example of implicit casting
		
		int num3 = 10;
		
//		 1-byte   4-byte
		byte num4 =(byte) num3; // java warns us here that there might be an overflow
		
		System.out.println(num4);
		
		
		int x;
		double y = 2.9;  // truncating - removing the decimal part
		// any conversion from the float point to integer family datatypes
		// will result in truncating the data
		
		
// 4-byte    8-byte
		x  = (int)y;
		System.out.println(x);
		
//		int x1;
//		short y1 = 2;
//		x1 = y1;       // java casts short to int automatically (implicitly) for us
		
/*Task: declare an int variable and a double variable  with the value 100.45.
 *  Cast the double variable to an int and print the int varibale		
		*/
		int num5;
	    double num6 = 100.45;
		num5 = (int)num6;
		System.out.println(num5);
		
		long num7 = 100;
		float num8;
		
 // 4-byte      8-byte
		num8 = num7;      // 1st exception
		
		long num9;
		float num10 = 100.56f;
		
//		num9 = num10;    // 1st exception reversed
		
		byte num11 = 10;  // 2nd exception
		short num12 = 12; // 2nd exception
		
		int num15 = 100;
		byte num16 = (byte)num15;  // only integer in numeral form can be assigned to byte and short
		
		
		char num13 = 1000;
		System.out.println(num13);
		short num14;
		
		num14 = (short)num13;  // 3rd exception
		
		
		boolean num17 = 5 > 3; // true
//		boolean num18 = laghman is better than kebob; // can't be used
	}

	}


