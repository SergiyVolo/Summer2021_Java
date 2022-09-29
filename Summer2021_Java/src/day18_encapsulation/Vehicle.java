package day18_encapsulation;

public class Vehicle {
	
	/*
	 * this. vs this()
	 * 	- this. - refers to the instance members(variables and methods)
	 * 	- this() - refers and invokes the corresponding constructor 
	 * in the same class, has to be placed 
	 * on the first line inside the constructor.
	 * 
	 * 	Constructors:
	 * 		- don't have return type;
	 * 		- match the Class name;
	 * 		- invoked at the time of object creation automatically.
	 * 
	 * 	Contructors:
	 * 		- default constructor:
	 * 			if no constructor is provided by a programmer java will create
	 *  a default no-arg constructor automatically
	 * 		- no-args constructor;
	 * 		- constructors that accept arguments.
	 * 
	 */

	private String make;
	private String model;
	
	public Vehicle() {  // constructor is a special method that doesn't have 
                        //	a return type and its name 
		                // matches the class name. Constructors are invoked 
                        //		at the time of object creation
		System.out.println("New vehicle is being created");
	}
	
	public Vehicle(String make) {
		
		this.make = make;
	}
	
	public Vehicle(String make, String model) {
		this();  // reference to the constructor in the same class that accepts 
		this.make = make;                                        //   no parameters
		this.model = model;
	}
	
//	public Vehicle() {
//		// this default no-arg constructor is automatically provided by Java,
//	      if no constructors were provided by the programmer
//	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;   // this - referring to the instance variable
		// eliminates confusion for Java to distinguish between two 'make' variables
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
}
}
