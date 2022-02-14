package DemoTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoParameter2 {
	
	@Test(priority = 5)
	public void logout() {
		Reporter.log("Logout", true);
	}
	
	@Test(priority = 1)
	public void login() {
		Reporter.log("Login", true);
	}
	
	
	@Test(priority = 4)
	public void chat() {
		Reporter.log("Chat", true);
	}
	
	@Test(priority = 2)
	public void editProfile() {
		Reporter.log("Edit Profile", true);
	}
	
	@Test(priority = 3)
	public void findFriends() {
		Reporter.log("Find Friend", true);
	}
	

}
