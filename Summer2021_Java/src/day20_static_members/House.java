package day20_static_members;

public class House {
	
	static int num = 5;
	String text = "Hello";
	
	static {
		System.out.println("I'm static initialization block!");
		System.out.println("I run only once!");
		System.out.println(++num);
	}
	
	static {
		System.out.println("I'm a second static initialization block!");
		System.out.println("I run only once!");
		System.out.println(++num);
	}
	
	{
		System.out.println("I'm a non-static initialization block");
		System.out.println("I always run when object is created but I run before constructor and after static block");
		System.out.println(num + text);
	}
	
	{
		System.out.println("I'm a second non-static initialization block");
		System.out.println("I always run when object is created but I run before constructor and after static block");
		System.out.println(num + text);
	}
	
//	public House(String type) {
//		System.out.println("I'm a constructor!");
//		System.out.println("I always run when object is being created!");
//	}
	
}
