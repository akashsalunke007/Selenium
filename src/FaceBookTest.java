import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookTest {
	public static void main(String[] args) throws InterruptedException{
			
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(2000);
			
			WebElement email = driver.findElement(By.id("email"));
			email.sendKeys("7028328430");
			
			WebElement pass = driver.findElement(By.id("pass"));
			pass.sendKeys("24289838S");
			
			WebElement login = driver.findElement(By.name("login"));
		
//			System.out.println(login.isEnabled());
//			System.out.println(login.isDisplayed());
//			System.out.println(login.getTagName());
			
			login.click();
			
			
//			driver.findElement(By.linkText("Forgotten password?")).click();
//			WebElement fp = driver.findElement(By.partialLinkText("Forgotten"));			
//			
//			System.out.println(fp.getAttribute("name"));   //Gives null because no attribute is present 
//			System.out.println(fp.getCssValue("color"));
			
			
			
			
			
			Thread.sleep(4000);
			
			//driver.close();
			
	}
}
