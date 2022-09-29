package day17_methods_parameters_return;

public class Return_Type {

	public static void main(String[] args) {
		
        Return_Type obj1 = new Return_Type();
		
		
		int max = obj1.max(3, 5);
		System.out.println(max);
		
		System.out.println(obj1.max(3, 5));
	}
	
	/*
	 * Create a method that returns a bigger number out of two provided
	 * 
	 */
	
	public int max(int num1, int num2) {
		
		if(num1 > num2) {
			return num1;
		} else {
			return num2;
		}
		
		
	}
	
	
}

