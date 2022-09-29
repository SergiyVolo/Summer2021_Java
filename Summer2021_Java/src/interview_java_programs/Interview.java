package interview_java_programs;

import java.util.ArrayList;
import java.util.List;

public class Interview {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("apple");
		list.add("banana");
		list.add("strawberry");
		list.add("orange");
		
		for(String fruit:list) {
			//System.out.println(fruit);
			if(fruit.equals("banana")) {
				System.out.println("There is a banana");
			}
		}

	}

}
