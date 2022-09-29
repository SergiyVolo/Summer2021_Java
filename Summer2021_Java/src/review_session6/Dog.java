package review_session6;

public class Dog extends Animal {

	public String name;
	
	public Dog(String name, int size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public void action(Animal animal) {
		
		if(animal.size > this.size) {
			System.out.println("Dog is barking!");
		} else if (animal.size < this.size) {
			System.out.println("Dog is barking!");
		} else {
			System.out.println("Dog is barking!");
		}
	}
}
