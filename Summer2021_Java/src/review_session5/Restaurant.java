package review_session5;

import java.util.ArrayList;
import java.util.List;

public abstract class Restaurant {

	private String type;
	protected List<String> menu = new ArrayList<>();
	private static int count;
	
	public Restaurant() {
		count++;
	}
	
	public abstract void showMenu();
	public abstract void serveFood(int itemNumber);
	public abstract void acceptPayment(double amount);

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<String> getMenu() {
		return menu;
	}

	public void setMenu(List<String> menu) {
		for(String item : menu) {
			this.menu.add(item);
		}
	}

	public static int getCount() {
		return count;
	}	
}

