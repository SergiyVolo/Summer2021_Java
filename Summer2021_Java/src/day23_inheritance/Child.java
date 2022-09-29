package day23_inheritance;

public class Child extends Parent {
	
//	private Child() {
//		private constructor will prevent any objects being instantiated 
//	    from this blueprint
//	}
	
	public void missParents() {
		System.out.println(birthday);
	}
}
