package OOP_Encapsulation;

public class AppLoginTest {

	public static void main(String[] args) {

		LoginPage l1 = new LoginPage("ma", "mayank@123");
		l1.doLogin(l1.getUserName());
	}

}
