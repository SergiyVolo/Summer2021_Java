package day18_encapsulation;

import day22_arraylist.Animal;

public class Zoo {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal("Zebra");
		Animal animal2 = new Animal("Lion");
		Animal animal3 = new Animal("Tiger");
		Animal animal4 = new Animal("Wolf");
		Animal animal5 = new Animal("Deer");
		
		Animal[] animals = new Animal[5];
		animals[0] = animal1;
		animals[1] = animal2;
		animals[2] = animal3;
		animals[3] = animal4;
		animals[4] = animal5;
		
		for(Animal animal : animals) {
			System.out.println(animal.getName());
		}		
		
		
	}

}
