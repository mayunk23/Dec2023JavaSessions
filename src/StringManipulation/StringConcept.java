package StringManipulation;

public class StringConcept {

	public static void main(String[] args) {

		String str = "This is my java code and I am so happy";
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.indexOf("i")); // 1st occurance of i
		// System.out.println(str.indexOf("i", 3));
		System.out.println(str.indexOf("i", str.indexOf("i") + 1));

		String t1 = "your order id is 123450";
		String orderid = t1.replaceAll("\\D+", "");
		System.out.println(orderid);

		String domain = "       hello        worlds";
		String dom = domain.replaceAll("\\s+", "");
		System.out.println(dom);
		
		
		String rest = "xXSeleniumxxXPythonXxXAutomationXxXLabs";
		String rs[] = rest.split("xX");
		System.out.println(rs[0].length());
		System.out.println(rs[1]);
		System.out.println(rs[2]);
		
	}

}
