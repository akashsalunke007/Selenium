import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnePlus {
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		  WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		  search.sendKeys("OnePlus",Keys.ENTER);
		  	  
		  
		  WebElement nxt = driver.findElement(By.xpath("//a/span[contains(.,'Next')]"));
		  
		  
		  for (int i = 1; i >0;) {
			  
			WebElement next = nxt;
			next.click();
			
			if (!nxt.isDisplayed()) {
				System.out.println("Next Link Not Found");
				break;
			}  
//			
			
//			if (link.isDisplayed()) {
//				link.click();
//				System.out.println("jaskjh");
//				break;
//			}
			
		}
	}
}