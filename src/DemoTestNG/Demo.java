  package DemoTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	public WebDriver driver;
	@BeforeMethod
	public void beforeM() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
	@AfterMethod
	public void afterM() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
		
	}
	
	
	@Test
	public void search1() {
		
	driver.findElement(By.name("q")).sendKeys("Java",Keys.ENTER);	
	Reporter.log("Search1", true);
	
	}
	
	
	@Test
	public void search() {
		
	driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);	
	Reporter.log("Search", true);
	
	}

}
