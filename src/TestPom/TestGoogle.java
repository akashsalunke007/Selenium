package TestPom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom.Google1;

public class TestGoogle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		Google1 g1 = new Google1(driver);
		
		g1.sendText("java");
		driver.navigate().back();
		g1.sendText("selenium");
	
	}

}
