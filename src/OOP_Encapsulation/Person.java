package OOP_Encapsulation;

public class Person {

	private String name;
	private int age;
	private String gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void printInfo(String name, int age, String gender) {

		System.out.println("printing info of a person");
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("gender: " + gender);

	}

}
