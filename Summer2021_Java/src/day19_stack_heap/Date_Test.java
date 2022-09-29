package day19_stack_heap;

public class Date_Test {

	public static void main(String[] args) {
		
		Date date1 = new Date();
		
		Date date2 = new Date((byte)21, 11, 2021);
		
		System.out.println(date1.getDay());    // ?
		System.out.println(date1.getMonth());  // ?
		System.out.println(date1.getYear());   // ?
		
		System.out.println(date2.getDay());    // ?
		System.out.println(date2.getMonth());  // ?
		System.out.println(date2.getYear());   // ?
		
		
//		System.out.println(new Date);      // hashcode is printed if there's no toString() method
		System.out.println(date1);		   // logic of toString() method will be executed if there's one available
		
		date1.congratulate("Salam");
	}
}
