package interview_java_programs;

public class TwoArrays {

	public static void main(String[] args) {

//		int[] arr1 = { 2, 11, 43, 16, 2, 10 };
//		int[] arr2 = { 10,5, 7, 44, 23, 56 };

//		for (int i = 0; i < arr1.length; i++) {
//			for (int j = 0; j < arr2.length; j++) {
//				if (arr1[i] == arr2[j]) {
//					System.out.println(arr1[i]);
//
//				}
//
//			}
//
//		}
		
	//	System.out.println('a'+'A'+'c');

		int[] arr3 = { 3, 11, 23, 56, 2, 7 };
		int[] arr4 = { 5, 7, 44, 23, 56, 0 };
		matchingNumber(arr3, arr4);
	}

	public static void matchingNumber(int[] a, int[] b) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
           System.out.println("The matching number is " + a[i]);
				}

			}
		}

	}

}
