import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest2 {
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
		driver.findElement(By.name("q")).sendKeys("Java");	
		Thread.sleep(2000);
		
		List<WebElement> search = driver.findElements(By.xpath("//ul[@jsname='bw4e9b'][1]/li"));
		Thread.sleep(2000);
		for (WebElement s : search) {
			System.out.println(s.getText());
		}
		
		search.get(2).click();
		
		//System.out.println(links.size());
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
	
		
		 
		//driver.close();
		
		
	}
}