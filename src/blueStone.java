import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class blueStone {
public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
		
		
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(3000);
		
		 WebElement close = driver.findElement(By.xpath("//button[@id='deny']"));
		 a.moveToElement(close).perform();
		 close.click();
		Thread.sleep(1000);
		
		WebElement coin = driver.findElement(By.xpath("//a[@title='Coins']"));
		coin.click();
		
		
		a.moveToElement(coin).perform();
		

	}

}
