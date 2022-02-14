package DemoTestNG;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;


public class DemoParameters3 {
	
	@Test(dependsOnMethods = {"chat","findFriends"})
	public void logout() {
		Reporter.log("Logout", true);
	}
	
	@Test
	public void login() {
		Reporter.log("Login", true);
	}
	
	
	@Test(dependsOnMethods = "findFriends")
	public void chat() {
		Reporter.log("Chat", true);
	}
	
	@Test(dependsOnMethods = "login")
	public void editProfile() {
		Reporter.log("Edit Profile", true);
	}
	
	@Test(dependsOnMethods = "editProfile")
	public void findFriends() {
		Reporter.log("Find Friend", true);
		Assert.fail();
	}

}
