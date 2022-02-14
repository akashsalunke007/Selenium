import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestXpath {
	public static void main(String[] args) throws InterruptedException{
			
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[@rel='async']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Akash");
			driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Salunke");
			driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("salunkeakash35@gmail.com");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("salunkeakash35@gmail.com");
			driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("nahi_bataunga");
			WebElement male = driver.findElement(By.xpath("//input[@value='2']"));
			
			male.click();
			Thread.sleep(500);		
			System.out.println(male.isSelected());
			Point loc = male.getLocation();
			System.out.println(loc);
			System.out.println("  Y  :  "+loc.getX() +"  Y  :"+ loc.getY());
			
			WebElement D = driver.findElement(By.xpath("//select[@id='day']"));
			Select day = new Select(D);
			day.selectByIndex(24);
			
			WebElement m = driver.findElement(By.xpath("//select[@id='month']"));
			Select mon = new Select(m);
			mon.selectByValue("6");
			
			List<WebElement> options = mon.getOptions();

			for (WebElement opt : options) {
				System.out.println(opt.getText());
			}
			
			
			WebElement y = driver.findElement(By.xpath("//select[@id='year']"));
			Select year = new Select(y);
			year.selectByVisibleText("1998");
			
			
			
			
			Thread.sleep(5000);
			//driver.close();
			
	}
}
			