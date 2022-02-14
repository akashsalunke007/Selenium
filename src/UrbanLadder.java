import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class UrbanLadder {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		
		 List<WebElement> menu = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/descendant::li"));
		 Actions a = new Actions(driver);
		 
		 for(WebElement m : menu){
			 System.out.println(m.getText());
			 a.moveToElement(m).perform();
			 Thread.sleep(500);
			 
		 }
		driver.close();
	}
}
