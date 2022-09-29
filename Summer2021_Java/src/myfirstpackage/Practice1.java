package myfirstpackage;

public class Practice1 {

	public static void main(String[] args) {
		
//             isReverse(); no need to call it here; next line calls the method
	     boolean bool1 = isReverse();
		System.out.println(bool1);
		
		
	}	
		public static boolean isReverse() {
			
			int[] array1 = {1,2,3};
			int[] array2 = {3,2,1};
			
			if(array1[0]==array2[2] && array1[1]==array2[1] && array1[2]==array2[0]){
		     return true;
			} else {
				return false;
			}
}
	
}


