import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AnnonomusClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
//		driver.findElement(By.xpath("//a[@rel='async']")).click();
		
		WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		ww.until(new ExpectedCondition<Boolean>() {

			@Override
			public Boolean apply(WebDriver driver) {
				
				WebElement cna = driver.findElement(By.xpath("//a[@rel='async']"));
				return cna.isDisplayed();
			}
		});
		
		driver.findElement(By.xpath("//a[@rel='async']"));
		
	}

}
