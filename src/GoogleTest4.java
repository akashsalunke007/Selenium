import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest4 {
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			
			searchB(driver).sendKeys("Java",Keys.ENTER);
			
			driver.navigate().back();
			
			
			searchB(driver).sendKeys("Selenium",Keys.ENTER);
	}
	
	public static WebElement searchB(WebDriver driver) {
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		return search;
	}

}
