import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ActitimeFullSheetRead {

	@Test(dataProviderClass = DataPFullSheet.class, dataProvider = "read")
	public void tc_1(String user, String pass) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver1.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String fT = driver.getTitle();

		WebElement uname = driver.findElement(By.xpath("//input[@name='username']"));
		uname.sendKeys(user);

		WebElement pass1 = driver.findElement(By.xpath("//input[@name='pwd']"));
		pass1.sendKeys(pass);

		WebElement loginB = driver.findElement(By.id("loginButton"));
		loginB.click();

		String nT = driver.getTitle();

		if (fT.equals(nT)) {
			Reporter.log("Login Failed", true);
		} else {
			Reporter.log("Login Successfull", true);
			Reporter.log(nT, true);
		}

	}

}
