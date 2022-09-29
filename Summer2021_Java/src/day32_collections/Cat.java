package day32_collections;

public class Cat {

//	Create class "Cat" with two instance variables: name and age, one constructor that accepts both name and age, and assigns their values to instance variables, override toString() method to output name and age of the cat;
//	Create class Collections_Practice with the main method;
//	Declare and instantiate 5 cat objects (come up with names yourself, each cat is one year older than the other: first - 1 y.o., second - 2 y.o., third - 3 y.o etc...)
//	Declare and instantiate a HashSet of cats and store 5 cats there;
//	While iterating through collection find the cat that is 4 y.o., print its name and remove it from the HashSet;
//	Print the HashSet to the console;
//	Store all the remaining cats in the ArrayList (use constructor);
//	Determine the capacity of both HashSet and ArrayList;
//	Print the ArrayList;
	
	String name;
	int age;
	
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
}

