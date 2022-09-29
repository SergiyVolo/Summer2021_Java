package day33_interview_prep;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static utilities.ExcelUtils.*;

public class Travel {

	
	public static void main(String[] args) {
		
		Set<String> uncle = new HashSet<>();
		uncle.add("Book");
		uncle.add("Hat");
		uncle.add("Visa Gift Card");
		uncle.add("Shirt");
		uncle.add("Post card");
		
		Set<String> aunt = new HashSet<>();
		aunt.add("Make up");
		aunt.add("Flowers");
		aunt.add("Jewelry");
		aunt.add("Perfume");
		aunt.add("Dress");
		
		Set<String> niece = new HashSet<>();
		niece.add("Scarf");
		niece.add("Doll");
		niece.add("Iphone");
		niece.add("Toy");
		niece.add("Lego");
		
		Set<String> nephew = new HashSet<>();
		nephew.add("Bicycle");
		nephew.add("Ipad");
		nephew.add("PS5");
		nephew.add("Jacket");
		nephew.add("Shoes");
		
		Set<String> friend = new HashSet<>();
		friend.add("Watch");
		friend.add("Rolex");
		friend.add("Fitbit");
		friend.add("Java Book");
		friend.add("Link to download JDK");
		
		Map<String, Set<String>> gifts = new HashMap<>();
		gifts.put("Diego", uncle);
		gifts.put("Juanita", aunt);
		gifts.put("Ruby", niece);
		gifts.put("Freddito", nephew);
		gifts.put("Pablo", friend);
		
		System.out.println(gifts);
		
		gifts.get("Pablo").remove("Fitbit");
		gifts.remove("Pablo");
		
		if(!gifts.get("Ruby").contains("Bicycle") && gifts.get("Freddito").contains("Bicycle")) {
			System.out.println("Ruby is jealous and angry");
		}
		
		int unclesNumOfGifts = gifts.get("Diego").size();
		int auntsNumOfGifts = gifts.get("Juanita").size();
		
		if(unclesNumOfGifts == auntsNumOfGifts) {
			System.out.println("Uncle and aunt are very happy to see you!");
		} else if (unclesNumOfGifts > auntsNumOfGifts) {
			gifts.get("Juanita").add("Fitbit");
		} else if (unclesNumOfGifts < auntsNumOfGifts) {
			gifts.get("Diego").add("Rolex");
		}
		
		System.out.println(gifts);
		
		
		openExcelFile("./src/day33_interview_prep/Travel1.xlsx", "Sheet1");
		int rows = getUsedRowsCount();
		System.out.println(rows);
		
		for(int row = 1; row < rows; row++) {
			String name = getCellData(row, 0);
			if(gifts.containsKey(name)) {
				int numOfGifts = gifts.get(name).size();
				setCellData(numOfGifts + "", row, 1);
			}
		}
	}
}

