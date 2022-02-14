package DemoTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoParameters {
	
	@Test(invocationCount = 4)
	public void test_01() {
		Reporter.log("Test_01", true);
	}
	
	@Test(enabled = false)
	public void test_02() {
		Reporter.log("Test_02", true);
	}
	
	@Test
	public void test_03() {
		Reporter.log("Test_03", true);
	}
	

}
