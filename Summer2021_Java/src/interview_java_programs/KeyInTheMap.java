package interview_java_programs;

import java.util.HashMap;
import java.util.Map;

public class KeyInTheMap {

	public static void main(String[] args) {

		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("A", 1);
		hashMap.put("B", 2);
		hashMap.put("C", 3);

		System.out.println(getKey(hashMap, 2));
	}

	public static <K, V> K getKey(Map<K, V> map, V value) {
		for (K key : map.keySet()) {
			if (value.equals(map.get(key))) {
				return key;
			}
		}
		return null;
	}

}
