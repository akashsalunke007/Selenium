import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class ValidationLogin{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver driver1 = new ChromeDriver();
		
		driver1.manage().window().maximize();
		
		driver1.get("https://demo.actitime.com/login.do");
		
		String titleB = driver1.getTitle();
		System.out.println(titleB);
		
		WebElement uname = driver1.findElement(By.id("username"));
		uname.sendKeys("admin");
		
		WebElement pass = driver1.findElement(By.name("pwd"));
		pass.sendKeys("manager1",Keys.ENTER);
		
//		WebElement loginB = driver1.findElement(By.id("loginButton"));
//		loginB.click();
		
		Thread.sleep(1000);
		String titleA = driver1.getTitle();
		System.out.println(titleA);
		
		
		
		if (titleB.equals(titleA)) {
			System.out.println("Login Failed");
		}
		else {
			System.out.println("Login Succesul");
		}
		
		
		driver1.close();
		
		
		
		
	}
}