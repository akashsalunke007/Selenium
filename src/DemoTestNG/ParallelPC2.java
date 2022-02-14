package DemoTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelPC2 {
	
	@Test
	public void tc_02() {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver1.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.in/");
		driver.close();
		
		}

}
