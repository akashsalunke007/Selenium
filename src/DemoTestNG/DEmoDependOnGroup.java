package DemoTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DEmoDependOnGroup {

	@Test(groups = "Functional")
	public void tc_f1() {
		Reporter.log("func1", true);
	}

	@Test(groups = "Functional")
	public void tc_f2() {
		Reporter.log("func2", true);
	}

	@Test(groups = "Functional")
	public void tc_f3() {
		Reporter.log("func3", true);
	}

	@Test(groups = "Integration", dependsOnGroups = "Functional")
	public void tc_i1() {
		Reporter.log("inte1", true);
	}

	@Test(groups = "Integration", dependsOnGroups = "Functional")
	public void tc_i2() {
		Reporter.log("inte2", true);
		Assert.fail();
	}

	@Test(groups = "Integration", dependsOnGroups = "Functional")
	public void tc_i3() {
		Reporter.log("inte3", true);
	}

	@Test(groups = "System", dependsOnGroups = "Integration")
	public void tc_s1() {
		Reporter.log("System1", true);
	}

	@Test(groups = "System", dependsOnGroups = "Integration")
	public void tc_s2() {
		Reporter.log("System2", true);
	}

}
