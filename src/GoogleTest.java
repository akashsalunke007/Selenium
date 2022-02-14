
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		driver.navigate().to("https://www.naukri.com/");
		
		//String handle = driver.getWindowHandle();
		
		Set<String> winSet = driver.getWindowHandles();
		System.out.println(winSet);
		
		List<String> winList = new ArrayList<>(winSet);
		System.out.println(winList);
		
		
		for (int i = winList.size()-1; i >= 0; i--) {
			
			driver.switchTo().window(winList.get(i));
			driver.close();
			Thread.sleep(2000);
			
		}
		
		
		
		
		driver.close();
	
		}
}