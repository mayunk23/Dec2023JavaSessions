package javasessions;

public class MaxAndMinElementsInArray {

	public static void main(String[] args) {

		int a[] = { 200, 3489, 34, 23, 35490, 9359, 2392 };
		//int max = a[0];

		// max number

//		for (int i = 1; i < a.length; i++) {
//
//			if (a[i] > max) {
//				max = a[i];
//			}
//
//		}
//		System.out.println(max);
		
		// min number
		
		int min = a[0];
		for(int i=1; i <a.length; i++){
			if(a[i]< min) {
				min =a[i];
			}
		}

		System.out.println(min);
	}

}
