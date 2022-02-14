import java.security.DrbgParameters.NextBytes;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest3 {
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		  WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		  search.sendKeys("Java",Keys.ENTER);
		  
		  Thread.sleep(5000);
		  
		  
		  WebElement nxt = driver.findElement(By.xpath("//a/span[contains(.,'Next')]"));
		  
		  for (int i = 1; i >0; i++) {
			if (nxt.isDisplayed()) {
				nxt.click();
				Thread.sleep(5000);
			}  
			break;
		}
	}
}