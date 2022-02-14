import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentExpectedCondition {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.manage().window().maximize();
				driver.get("file:///D:/Selenium/WebDriverWait%20Examples/sam1.html");
				
				WebElement txb1 = driver.findElement(By.xpath("//input[@name='textA']"));
				txb1.sendKeys("name");
				
				new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.textToBePresentInElementValue(txb1, "name"));
				
				
//			new WebDriverWait(driver, Duration.ofSeconds(10)).until(new ExpectedCondition<Boolean>() {
//
//					@Override
//					public Boolean apply(WebDriver dr) {
//						 
//						WebElement ele = dr.findElement(By.xpath("//input[@name='textA']"));
//						return ele.getAttribute("value").equalsIgnoreCase("name");
//					}
//					
//				});	
				
				
				
				driver.findElement(By.xpath("//input[@name='textB']")).sendKeys("Akash");
	}

}
