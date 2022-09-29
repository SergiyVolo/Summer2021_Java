package practice;

import static utilities.ExcelUtils.getCellData;
import static utilities.ExcelUtils.getUsedRowsCount;
import static utilities.ExcelUtils.openExcelFile;
import static utilities.ExcelUtils.setCellData;

import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;

public class Travel {

	public static void main(String[] args) throws IOException {

		HashSet<String> uncle = new HashSet<>();
		uncle.add("T-shirt");
		uncle.add("Bottle");
		uncle.add("Watch");
		uncle.add("Cologne");

		HashSet<String> aunt = new HashSet<>();
		aunt.add("Scarf");
		aunt.add("Chocolate");
		aunt.add("Lip stick");

		HashSet<String> niece = new HashSet<>();
		niece.add("Dress");
		niece.add("Hat");
		niece.add("Purse");

		HashSet<String> nephew = new HashSet<>();
		nephew.add("Toy1");
		nephew.add("Toy2");
		nephew.add("Bicycle");

		HashSet<String> friend = new HashSet<>();
		friend.add("Bourbon1");
		friend.add("Bourbon2");

		HashMap<String, HashSet<String>> relatives = new HashMap<>();
		relatives.put("Diego", uncle);
		relatives.put("Juanita", aunt);
		relatives.put("Ruby", niece);
		relatives.put("Freddito", nephew);
		relatives.put("Pablo", friend);

		System.out.println(relatives);

		relatives.get("Pablo").remove("Bourbon2");
		relatives.remove("Pablo");

		if (relatives.get("Freddito").contains("Bicycle") && !relatives.get("Ruby").contains("Bicycle")) {
			System.out.println("Ruby is jealous and angry.");
		} else {
			System.out.println("Ruby is ok.");
		}

		int ancleNumberOfGifts = relatives.get("Diego").size();
		int auntNumberOfGifts = relatives.get("Juanita").size();

		if (ancleNumberOfGifts == auntNumberOfGifts) {
			System.out.println("Uncle and aunt are very happy to see you!");
		} else if (ancleNumberOfGifts > auntNumberOfGifts) {
			relatives.get("Juanita").add("Extra Hug");
		} else {
			relatives.get("Diego").add("Matches");
		}
		System.out.println(relatives);

		openExcelFile("./src/practice/Travel.xlsx", "Sheet1");

		int numOfRows = getUsedRowsCount();
		System.out.println(numOfRows);

		for (int row = 1; row < numOfRows; row++) {
			String name = getCellData(row, 0);
			if (relatives.containsKey(name)) {
				int numOfGifts = relatives.get(name).size();
				setCellData(numOfGifts + "", row, 1);
			}

		}

	}

}
