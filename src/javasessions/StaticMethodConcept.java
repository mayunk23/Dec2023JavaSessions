package javasessions;

public class StaticMethodConcept {
	
	public static String name;
	public static int age;
	//public boolean gender;
	
	public static void getInfo() {
		System.out.println("get Info");
	}
	
	public void sendMail() {
		System.out.println("send mail");
	}

	
	public static void main(String[] args) {
		
		StaticMethodConcept.getInfo();
		
		StaticMethodConcept obj = new StaticMethodConcept();
		obj.sendMail();

		
	}

}
