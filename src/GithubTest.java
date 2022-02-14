import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GithubTest {
		public static void main(String[] args) throws InterruptedException{
				
				System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				driver.get("https://github.com/login");
				
				Thread.sleep(2000);
				
				WebElement email = driver.findElement(By.id("login_field"));
				email.sendKeys("salunkeakash35@gmail.com");
				
				WebElement pass = driver.findElement(By.id("password"));
				pass.sendKeys("Akki007$");
				
				WebElement login = driver.findElement(By.name("commit"));
				login.click();
				
				Thread.sleep(2000);
				driver.close();
		}

}
