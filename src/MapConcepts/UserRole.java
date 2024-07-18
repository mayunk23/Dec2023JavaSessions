package MapConcepts;

import java.util.HashMap;

public class UserRole {

	public void doLogin(String un, String pwd) {
		System.out.println("user log in with: " + un + "-" + pwd);

	}

	private void doLogin(String role) {
		
		role = role.toLowerCase();

		String creds = getUserCreds(role);
		String cred[] = creds.split(":");
		String un = cred[0].trim();
		String pwd = cred[1].trim();
		doLogin(un, pwd);

	}

	public String getUserCreds(String role) {
		HashMap<String, String> userMap = new HashMap<String, String>();
		userMap.put("admin", "admin:admin123");
		userMap.put("seller", "seller:seller@123");
		userMap.put("vendor", "vendor:vendor@123");

		return userMap.get(role);
	}

	public static void main(String[] args) {

//		String role = "seller";
		UserRole app = new UserRole();
		app.doLogin("VENDOR");
//		String creds = app.getUserCreds(role);
//		System.out.println(creds);
//
//		String cred[] = creds.split(":");
//		String un = cred[0].trim();
//		String pwd = cred[1].trim();
//
//		app.doLogin(un, pwd);
	}

}
