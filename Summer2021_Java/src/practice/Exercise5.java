package practice;


public class Exercise5 {

	public static void main(String[] args) {
		
		int[] nums = {2, 13, 13, 10, 13, 1, 3};
		
		int sum = 0;
		
	    for (int i=0; i<nums.length; i++){
	    	 if(nums[i]!=13) {
	    	 sum += nums[i];
	    	 if(i>0 && nums[i-1]==13)
	    		 sum -= nums[i];
	    	 }
	    }
	    System.out.println(sum);
	}
	
}


