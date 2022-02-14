package DemoTestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void tc_1(String bname) {
		
		if (bname.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			driver = new ChromeDriver();		
		}		
		else if (bname.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./software/msedgedriver.exe");
			driver = new EdgeDriver();
					
		}
		else if (bname.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
			driver = new FirefoxDriver();
					
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//driver.close();
		
		}

}
