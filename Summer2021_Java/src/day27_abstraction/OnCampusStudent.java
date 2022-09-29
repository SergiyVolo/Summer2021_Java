package day27_abstraction;

public class OnCampusStudent extends Student {

	public String city;
	
	@Override
	public void attendClass() {
		System.out.println("Attending class in person");
	}
	
	public int attendClass(boolean isOnline) {
		if(isOnline) {
			System.out.println("Attending class using Zoom");
		} else {
			System.out.println("Attending class in person");
		}
		return 1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "OnCampusStudent [city=" + city + "]" +  "[name=" + name + "]" + "[StudentID=" + getStudentID() + "]";
	}
}
