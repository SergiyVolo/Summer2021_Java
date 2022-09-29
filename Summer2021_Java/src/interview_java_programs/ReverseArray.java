package interview_java_programs;

import java.util.Arrays;

public class ReverseArray {
	
	
	public static void main(String[] args) {
		
		   int[] array = {1, 2, 3, 4, 5, 6};
		   System.out.println(Arrays.toString(array));
		   reverseArray(array);
		   System.out.println(Arrays.toString(array));
		   
		   
		    
		}
             
           public static int[] reverseArray(int[] array) {
		         
        	   for(int i = 0 ; i < array.length/2; i++) {
        		   int temp = array[i];
	               array[i] = array[array.length-i-1];
	               array[array.length-i-1] = temp;
	               }
        	        return array;
        	        
        	   
      }




	
				
}



	
	
	

