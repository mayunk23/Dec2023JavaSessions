package MapConcepts;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapConcept {

	// output will be in order,

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> empMap = new LinkedHashMap<String, Integer>();

		empMap.put("Tom", 10);
		empMap.put("Lisa", 20);
		empMap.put(null, null);
		empMap.put("Mayank", 25);
		empMap.put("Palak", 20);
		empMap.put("Keshav", 50);

		// System.out.println(empMap);

		for (Map.Entry<String, Integer> entry : empMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());

		}
	}

}
