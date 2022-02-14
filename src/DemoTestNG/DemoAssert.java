package DemoTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoAssert {
	@Test
	public void tc_f1() {
		String ac = "FACEBOOK";
		String EX = "Facebook";
		
		Assert.assertEquals(ac, EX);
		Reporter.log("Matched", true);
		Assert.assertEquals(true, false);
	}

}
