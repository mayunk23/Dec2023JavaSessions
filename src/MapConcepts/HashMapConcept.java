package MapConcepts;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

	// no ordering, output will be according to hashcodes

	public static void main(String[] args) {

		HashMap<String, Integer> empMap = new HashMap<String, Integer>();

		empMap.put("Tom", 10);
		empMap.put("Lisa", 20);
		empMap.put(null, null);
		empMap.put("Mayank", 25);
		empMap.put("Palak", 20);
		empMap.put("Keshav", 50);

		System.out.println(empMap);
		System.out.println(empMap.size());
//		System.out.println(empMap.get("Tom"));
//
//		for (Map.Entry<String, Integer> entry : empMap.entrySet()) {
//			System.out.println(entry.getKey() + ":" + entry.getValue());
//		}

	}

}
