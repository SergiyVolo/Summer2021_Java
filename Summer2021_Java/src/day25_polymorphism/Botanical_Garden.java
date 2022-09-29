package day25_polymorphism;

public class Botanical_Garden {

	public static void main(String[] args) {
		
		Plant plant = new Plant();
		
		Pine pine = new Pine();
		
		Birch birch = new Birch();
		
		plant.grow();
		plant.grow(20);
		pine.grow("moderate - to cold");
	    pine.grow(80);
	    birch.grow(true);
	    pine.grow("cold");
	    pine.grow(65.5);
	   
	    
	    
	    
	     
	}

}
