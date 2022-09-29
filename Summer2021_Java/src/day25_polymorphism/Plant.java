package day25_polymorphism;

public class Plant   {
	
	      public void grow() {
		    System.out.println("This plant is growing");
	        }
	     
	      public void grow(int years) {
	    	  System.out.println("This plant lives " + years +" years");
	    }
	
	      public void grow(String climate) {
	    	  System.out.println("This plant lives in " + climate + " climate");
	    	  
	      }

	
}
