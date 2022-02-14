import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActimeTestCase {
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//new 
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement uname = driver.findElement(By.xpath("//input[@name='username']"));
		uname.sendKeys("admin");
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='pwd']"));
		pass.sendKeys("manager");
		
		WebElement loginB = driver.findElement(By.id("loginButton"));
		loginB.click();
		
		
		driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']/div[@class='popup_menu_icon']/div[@class='menu_icon']")).click();
		
		driver.findElement(By.xpath("//a[contains(.,'About your actiTIME')]")).click();
		
		
		
		WebElement txt = driver.findElement(By.xpath("//td[@class='aboutCopyright']"));
		System.out.println(txt.getText());
		
		
		
	}
}
