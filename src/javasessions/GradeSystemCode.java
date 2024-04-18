package javasessions;

public class GradeSystemCode {

	public static void main(String[] args) {

		int marks = 34;
		if (marks <= 100) {
			if (marks <= 100 && marks >= 91) {
				System.out.println("You have got Grade A++");
				if (marks == 100) {
					System.out.println("And you're eligible for Scholarship");
				}
			} else if (marks <= 90 && marks >= 76) {
				System.out.println("You have got Grade A");
			} else if (marks <= 75 && marks >= 66) {
				System.out.println("You have got Grade B");
			} else if (marks <= 65 && marks >= 51) {
				System.out.println("You have got Grade C");
			} else if (marks <= 50 && marks >= 34) {
				System.out.println("You have got Grade D");
			} else if (marks <= 33 && marks >= 0) {
				System.out.println("Failed");
			}
		} else {
			System.out.println("Please enter the correct marks");
		}
	}
}
