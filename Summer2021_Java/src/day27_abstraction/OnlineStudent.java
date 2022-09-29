package day27_abstraction;

public class OnlineStudent extends Student {

	public String city;
	
	@Override
	public void attendClass() {
		System.out.println("Attending class using zoom");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "OnlineStudent [city=" + city + "]" +  "[name=" + name + "]" + "[StudentID=" + getStudentID() + "]";
	}
}

