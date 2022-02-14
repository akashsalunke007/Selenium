import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		//driver.manage().window().minimize();
		driver.quit();
			
		}

}
