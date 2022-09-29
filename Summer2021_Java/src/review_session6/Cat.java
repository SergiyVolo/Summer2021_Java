package review_session6;

public class Cat extends Animal {

	public String name;
	
	public Cat(String name, int size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public void action(Animal animal) {
		
		if(animal.size > this.size) {
			System.out.println("Cat, run away!");
		} else if (animal.size < this.size) {
			System.out.println("Cat is chasing other animal!");
		} else {
			System.out.println("We are friends!");
		}
	}
}
