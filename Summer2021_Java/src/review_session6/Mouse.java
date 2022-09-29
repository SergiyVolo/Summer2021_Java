package review_session6;

public class Mouse extends Animal {
	
	public String name;
	
	public Mouse(String name, int size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public void action(Animal animal) {
		
		if(animal.size > this.size) {
			System.out.println("Mouse, run away!");
		} else if (animal.size < this.size) {
			System.out.println("Mouse is chasing other animal!");
		} else {
			System.out.println("We are friends!");
		}	
	}
}

