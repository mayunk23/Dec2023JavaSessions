package javasessions;

import java.util.Arrays;

public class ReverseString2 {

	public static void main(String[] args) {

		String str = "Hello World";
		String rev = "";

		// using + string concatenation operator

//		int len = str.length();
//
//		for (int i = len - 1; i >= 0; i--) {
//
//			rev = rev + str.charAt(i);
//
//		}
//		System.out.println(rev);
		
		
		// using char array

//		char ch[] = str.toCharArray();
//		int len = ch.length - 1;
//		for (int i = len; i >= 0; i--) {
//			rev = rev + ch[i];
//		}
//		System.out.println(rev);
		
		// using string buffer class
		
		StringBuffer sb = new StringBuffer(str);
		StringBuffer re = sb.reverse();
		System.out.println(re);
		
		

	}
}
