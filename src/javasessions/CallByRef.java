package javasessions;

public class CallByRef {

	String name;
	int age;

	public static void getInfo(CallByRef t1) {
		System.out.println(t1.name);
		System.out.println(t1.age);

		t1.name = "shera";
		t1.age = 23;
		System.out.println(t1.name);
		System.out.println(t1.age);

	}

	public static void main(String[] args) {

		CallByRef obj = new CallByRef();
		obj.name = "Tommy";
		obj.age = 35;

		getInfo(obj);

		System.out.println(obj.name);
		System.out.println(obj.age);

	}

}
