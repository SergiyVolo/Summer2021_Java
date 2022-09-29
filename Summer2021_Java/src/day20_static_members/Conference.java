package day20_static_members;

public class Conference {

	public static void main(String[] args) {
		
		System.out.println(Meeting.peopleCount);
		
		Meeting zoom1 = new Meeting();
		zoom1.increment();
		zoom1.increment();
		
		Meeting zoom2 = new Meeting();
		zoom2.increment();
		zoom2.increment();
		
		
		System.out.println("The number of people in the first meeting room: " + Meeting.peopleCount);
		System.out.println("The number of people in the second meeting room: " + Meeting.peopleCount);
	}
}
