package boston;

public class Interview {
	
	
	public static void main(String[] args) {
		
		String[] array = {"dog", "cat", "bird", "tiger", "lion"};
		
		System.out.println(m1(array));
		
		} 
	
	public static int m1(String[] array) {
		
		int counter = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i].length() > 3) {
				counter++;
			}
		}
		return counter;
	}

}
