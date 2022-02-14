import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice {
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		
		//------------------------------------------------------TC1-----------------------------------------------------------------
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Rings",Keys.ENTER);
		
		WebElement img = driver.findElement(By.xpath("//img[@alt='The Thom Ring']"));
		img.click();
		Set<String> Window = driver.getWindowHandles();
		
		ArrayList<String> win = new ArrayList<>(Window);
		
		driver.switchTo().window(win.get(1));
		
		
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		
		WebElement msg = driver.findElement(By.xpath("//div[@class='formErrorContent']"));
		
		System.out.println(msg.getText());
		driver.close();
		
		
		//--------------------------------------------------------TC2---------------------------------------------------------------
		

		
		
		
		
		
		
	}

}
