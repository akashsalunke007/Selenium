import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActTime {
	public static void main(String[] args) throws InterruptedException{
			
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			WebElement uname = driver.findElement(By.xpath("//input[@name='username']"));
			uname.sendKeys("admin");
			
			WebElement pass = driver.findElement(By.xpath("//input[@name='pwd']"));
			pass.sendKeys("manager");
			
			WebElement loginB = driver.findElement(By.id("loginButton"));
			loginB.click();
			
			WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10)); 
//			w.until(ExpectedConditions.titleContains("act"));
			System.out.println(w.until(ExpectedConditions.titleContains("acti")));
			
//			driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
//			
//			WebElement uname1 = driver.findElement(By.xpath("//input[@name='username']"));
//			uname1.sendKeys("admin");
//			
//			WebElement pass1 = driver.findElement(By.xpath("//input[@name='pwd']"));
//			pass1.sendKeys("manager");

			
			
			//driver.close();
			
	}
}