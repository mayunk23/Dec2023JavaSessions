package MapConcepts;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapConcept {

	// will sort alphabetically

	public static void main(String[] args) {

		TreeMap<String, Integer> empMap = new TreeMap<String, Integer>();

		empMap.put("Tom", 10);
		empMap.put("Lisa", 20);
		// empMap.put(null, 40);
		empMap.put("Mayank", 25);
		empMap.put("Palak", 20);
		empMap.put("Keshav", 50);

		System.out.println(empMap);

		for (Map.Entry<String, Integer> entry : empMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println("--------------------------------------");

		empMap.forEach((k, v) -> System.out.println(k + ":" + v));
	}

}
