package javasessions;

//by converting string in char[]

public class ReverseString {

	public static void main(String[] args) {

		String str = "Hello World";
		Reverse(str);
		
		
	}
	
	public static void Reverse(String str) {
		char ch[] = str.toCharArray();
		for(int i=ch.length-1; i>=0; i-- ) {
			System.out.print(ch[i]);
		}
		
	}

}
