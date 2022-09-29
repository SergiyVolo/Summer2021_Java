package myfirstpackage;

public class House {
	
	private double size;
	private int price;
	private String type;
	
	
//	constructor #1
	public House() {
		System.out.println("New house has been built!");
	}
	
//	constructor #2
	public House(String type) {
		this.type = type;
		}
	
//	constructor #3
	public House(double size) {
		this.size=size;
	    }
	
//	constructor #4
	public House(int price) {
		this.price=price;
       }
	
	
	public double getSize() {
		return size;
		}
	
	public void setSize(double size) {
		this.size=size;
	}
	
	public int getPrice() {
		return price;
	}
      
	public void setPrice(int price) {
		this.price=price;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type=type;
	}
}
