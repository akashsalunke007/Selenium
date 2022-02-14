import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JustDial {
	public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
				
				ChromeOptions co = new ChromeOptions();
				co.addArguments("-DisaBle-nOtifications");
				
				WebDriver driver = new ChromeDriver(co);
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.manage().window().maximize();
				driver.get("https://www.justdial.com/");
				
	}
}
