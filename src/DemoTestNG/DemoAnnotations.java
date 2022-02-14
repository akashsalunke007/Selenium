package DemoTestNG;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoAnnotations {
	
	@BeforeSuite
	public void bs() {
		Reporter.log("BSuite", true);
	}
	
	@AfterSuite
	public void As() {
		Reporter.log("ASuite", true);
	}
	
	
	@BeforeTest
	public void bt() {
		Reporter.log("BTest", true);
	}
	
	@AfterTest
	public void At() {
		Reporter.log("ATest", true);
	}
	
	
	
	@BeforeClass
	public void bcl() {
		Reporter.log("Bclass", true);
	}
	
	@AfterClass
	public void AC() {
		Reporter.log("AClass", true);
	}
	
	@BeforeMethod
	public void bm() {
		Reporter.log("BMethod", true);
	}
	
	@AfterMethod
	public void AM() {
		Reporter.log("AMethod", true);
	}
	
	@Test
	public void test() {
		Reporter.log("Test", true);
	}
	
	
	
	
	

}
