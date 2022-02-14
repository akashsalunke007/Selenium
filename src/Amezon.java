import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amezon {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//driver.manage().window().fullscreen();
		//driver.manage().window().minimize();
		//driver.quit();
		
		}

}
