package review_session5;

public class Test_Automation {

	public static void buildTeam() {
		System.out.println("Unknown number of random people following no development methodologies");
	}

	public static void buildTeam(int numOfPeople) {
		System.out.println(numOfPeople + " students following no development methodologies");
	}

	public static void buildTeam(int numOfPeople, String methodology) {
		System.out.println(numOfPeople + " students following " + methodology);
	}

	public static void buildTeam(int numOfPeople, String position, String methodology) {
		System.out.println(numOfPeople + " " + position + " following " + methodology + " methodology");
	}
}