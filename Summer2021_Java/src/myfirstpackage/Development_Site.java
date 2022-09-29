package myfirstpackage;

public class Development_Site {
	
	public static void main(String[] args) {
		
		House house1 = new House();
		
		
		house1.setType("Rancher");
		System.out.println(house1.getType());
		
		house1.setSize(4000);
		System.out.println("The size of this house is:" + house1.getSize()+" "+"sq ft!");
		
		house1.setPrice(450000);
		System.out.println("The price is:" +"$"+ house1.getPrice()+".");
		
		
		
        House house2 = new House();
		
		house2.setType("Colonial");
		System.out.println(house2.getType());
		
		house2.setSize(4500);
		System.out.println("The size of this house is:" + house2.getSize()+" "+"sq ft!");
		
		house2.setPrice(550000);
		System.out.println("The price is:" +"$"+ house2.getPrice()+".");
		
		
		
	}
	

}
