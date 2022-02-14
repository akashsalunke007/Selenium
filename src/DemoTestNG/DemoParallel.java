package DemoTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoParallel {
	
	@Test
	public void tc_f1() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver1.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.close();
		
	}

	
	
	@Test
	public void tc_f2() {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver1.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com/");
		
		driver.close();

	}

}
