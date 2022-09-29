package day16_classes_and_objects;

public class Schedule {

	/*
	 * Write a program that prints PrimeTech's schedule
	 * 6 months - 24 weeks
	 * 7 days in a week 
	 * 
	 * week 1
	 *  day1 
	 *  day2
	 *  day3
	 *  ..
	 * week2
	 *  day1 
	 *  day2
	 *  ... 
	 */
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 24; i++) {
			System.out.println("Week " + i);
			for(int j = 1; j <= 7; j++) {
				if(j == 1 || j == 5) {
					continue;  // skips the iteration # 1 and # 5
				}
				
				System.out.println("   Day " + j);
				if(j == 3) {
					System.out.println("      Wednesday Review Session");
				} else {
					System.out.println("      Regular Class Day");
				}
			}
		}
		
		
		

	}

}
