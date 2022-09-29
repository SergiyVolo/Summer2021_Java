package interview_java_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Practice1 {

	public static void main(String[] args) {

		String[] colors = { "Green", "Black", "Grey", "White", "Grey", "White", "White" };
		Set<String> newColors = new HashSet<>();
		for (String color : colors) {
			newColors.add(color);
		}
		System.out.println(Arrays.toString(colors));
		for (int i = 0; i < colors.length; i++) {
			System.out.println(colors[i] + ",");
		}

		ArrayList<Integer> array = new ArrayList<>();

		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		
		for(int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i)+" ");
		}

//		System.out.println(array);
//		Collections.reverse(array);
//		System.out.println(array);

	}
}
