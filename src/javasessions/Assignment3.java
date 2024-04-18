package javasessions;

public class Assignment3 {

	public static void main(String[] args) {
		// If-else and Switch-Case:

		int n1 = 100;
		int n2 = 200;
		int n3 = 50;

//		if (n1 > n2)
//			if (n1 > n3)
//				System.out.println("The gratest Number is " + n1);
//		if (n2 > n1)
//			if (n2 > n3)
//				System.out.println("The gratest Number is " + n2);
//		if (n3 > n1)
//			if (n3 > n2)
//				System.out.println("The gratest Number is " + n3);

		if (n1 > n2 && n1 > n3) {
			System.out.println("n1 is greatest");
		} else if (n2 > n3) {
			System.out.println("n2 is greatest");

		}
		else {
			System.out.println("n3 is greatest");
		}
	}
}