import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amezon2 {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement ele = driver.findElement(By.xpath("//img[@alt='Top Offers on pTron Accessories']"));
		js.executeScript("arguments[0].scrollInToView()", ele);
		
		
//		-------------------------------------------------------------------------------------------------------------------------
		
//		js.executeScript("window.scrollBy(1000,0)");
//		js.executeScript("window.scrollBy(document.body.scrollWidth,0)");
		
		
		
//		-----------------------------------------------------------------------------------------------
		
//		js.executeScript("window.scrollBy(0,1500)");
//		Thread.sleep(500);
//		js.executeScript("window.scrollBy(0,1500)");
//		Thread.sleep(500); 
//		js.executeScript("window.scrollBy(0,-1500)");
//		
//		Thread.sleep(1000);
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//
//		Thread.sleep(1000);
//		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		
		
		}

}
