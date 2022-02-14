import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSelect {
	public static void main(String[] args) throws InterruptedException{
			
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("file:///D:/HTML/Select.html");
			Thread.sleep(2000);
			
			WebElement op = driver.findElement(By.xpath("//select[@id='b']"));
			
			Select s = new Select(op);
			
			if (s.isMultiple()) {
				
				List<WebElement> opt = s.getOptions();
				
				for (WebElement w : opt) {
					
					s.selectByVisibleText(w.getText());
					
				}
								
			}
			
			WebElement first = s.getFirstSelectedOption();
			System.out.println(first.getText());
			Thread.sleep(1000);
			
			System.err.println("____________________________________");
			
			List<WebElement> all = s.getAllSelectedOptions();
			
			for (WebElement ele : all) {
				System.out.println(ele.getText());
			}
			
			
			s.deselectByIndex(0);
			s.deselectByValue("vada pav");
			s.deselectByVisibleText("rosogola");
			Thread.sleep(500);
			
			s.deselectAll();
			
			
			
			
	}
}









