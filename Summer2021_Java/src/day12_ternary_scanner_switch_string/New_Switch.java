package day12_ternary_scanner_switch_string;

public class New_Switch {

	public static void main(String[] args) {
		
		String today = "";  // Check if the day is weekend or weekday
		String day = "Sun";
		
		switch(day) {
			case "Sat", "Sun" -> today = "Weekend";
			case "Mon", "Tue", "Wed", "Thu", "Fri" -> today = "Weekday";
			default -> System.out.println("Invalid day");
		}
		
		System.out.println(today);
	}

}
