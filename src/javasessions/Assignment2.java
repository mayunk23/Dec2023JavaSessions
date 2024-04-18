package javasessions;

public class Assignment2 {

	public static void main(String[] args) {
		// Incremental/Decremental Operators

		/*int i = 11;
		i = i++ + ++i;
		System.out.println(i);// 24* */

		int a = 11, b = 22, c;
		c = a + b + a++ + b++ + ++a + ++b;
		System.out.println("a=" + a);// 13
		System.out.println("b=" + b);// 24
		System.out.println("c=" + c);// 103

		int i = 0;
		i = i++ - --i + ++i - i--;
		System.out.println(i);
		
		
		int m = 0, n = 0;
		int p = --m * --n * n-- * m--;
		System.out.println(p);

		
		int ch = 'A';
		System.out.println(ch++);
		
		char ch1 = 'A';
		System.out.println(++ch1);

	}

}
