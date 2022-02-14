import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemoqa {
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		WebElement msg = driver.findElement(By.xpath("//span[@id='confirmResult']"));
		System.out.println(msg.getText());
		
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		
		driver.switchTo().alert().sendKeys("Akash");
		driver.switchTo().alert().accept();
		WebElement msg1 = driver.findElement(By.xpath("//span[@id='promptResult']"));
		System.out.println(msg1.getText());
		
		
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
	}

}
