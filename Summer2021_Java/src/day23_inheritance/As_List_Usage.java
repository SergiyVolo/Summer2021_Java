package day23_inheritance;

import java.util.Arrays;
import java.util.List;

public class As_List_Usage {

	public static void main(String[] args) {
		
		String[] strings = {"Tulips", "Lillies"};
//		strings[0] = "Rose";  can change the array's element
		System.out.println(Arrays.toString(strings));
		
		List<String> list1 = Arrays.asList(new String[] {"Tulips", "Lillies"});
		List<String> list2 = Arrays.asList("Tulips", "Lillies", "Daysies");
		
//		list2.remove(0);  // list2 became fixed size and can't accept or remove elements

//		List<int[]> list3 = Arrays.asList(new int[] {1, 2, 3, 4}, new int[] {1, 2, 5, 4}, new int[] {1, 2, 3, 4});
		List<Integer> list3 = Arrays.asList(new Integer[] {1, 2, 3, 4}); 
		
		System.out.println(list3);
	}
}

