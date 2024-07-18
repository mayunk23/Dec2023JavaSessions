package javasessions;

public class VowelOrConsonant {

	public static void main(String[] args) {

		int vCount = 0, cCount = 0;

		String STR = "My program to check the count of vowel and consonants in the given string";
		// String STR = "a e i o u zxcv";
		STR = STR.toLowerCase();
		String str = STR.replaceAll(" ", "");
		int e = str.length();
		System.out.println(e);

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {

				vCount++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				cCount++;
			}

		}

		System.out.println("Vowel count :" + vCount);
		System.out.println("Consonant count :" + cCount);

	}

}
