package interview_java_programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Delete {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		Iterator<Integer> it = list.iterator();

		it.next();                       // first iteration, 10
		System.out.println(it.next());   // second iteration, 20

	}

}
