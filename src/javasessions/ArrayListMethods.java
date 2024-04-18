package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(180,20,10,220,110));
		System.out.println(numList);
		Collections.sort(numList);
		System.out.println(numList);

		
	}

}
