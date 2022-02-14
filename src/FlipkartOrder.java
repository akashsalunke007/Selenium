import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.browser.model.Bucket;

public class FlipkartOrder {
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("I Phone 12 pro max",Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='col col-7-12']/div[contains(.,'APPLE iPhone 12 Pro Max (Gold, 512 GB)')]")).click();
		Thread.sleep(2000);
		
		Set<String> allWindows = driver.getWindowHandles();
		//allWindows.remove(driver.getWindowHandle());
		
		ArrayList<String> alWin = new ArrayList<>(allWindows);
		
		driver.switchTo().window(alWin.get(1));
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(.,'Place Order')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("salunkeakash35@gmail.com",Keys.ENTER);
		
		Thread.sleep(5000);
		driver.close();
	}
}
