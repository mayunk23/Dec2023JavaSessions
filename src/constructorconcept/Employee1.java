package constructorconcept;

public class Employee1 {

	String name;
	int age;

	public Employee1(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public static void main(String[] args) {

		Employee1 e1 = new Employee1("Tommy", 30);
		System.out.println(e1.name);
		System.out.println(e1.age);

	}

}
