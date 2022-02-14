import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeRead {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FileInputStream fis = new FileInputStream("./demo.xlsx");
		
		String LoginPage = driver.getTitle();
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet1");
		int rCount=sh.getPhysicalNumberOfRows();
		//System.out.println(rCount);
		
	 	int cCount = sh.getRow(1).getLastCellNum();
	 	//System.out.println(cCount);
	 	
	 	for (int i = 1; i < rCount; i++) {
			for (int j = 0; j <cCount-1 ; j+=2) {
				
				Cell c1 = sh.getRow(i).getCell(j);
				Cell c2 = sh.getRow(i).getCell(j+1);
				Thread.sleep(2000);
				WebElement lg = driver.findElement(By.xpath("//input[@name='username']"));
				lg.sendKeys(c1.toString());
				Thread.sleep(1000);
				WebElement pass = driver.findElement(By.xpath("//input[@name='pwd']"));
				pass.sendKeys(c2.toString(),Keys.ENTER);
				Thread.sleep(2000);
				String newPg = driver.getTitle();
				if (newPg.equals(LoginPage)) {
					driver.findElement(By.xpath("//input[@name='username']")).clear();
					driver.findElement(By.xpath("//input[@name='pwd']")).clear();
				}
				else {
					System.out.println("Login Successfull");
					break;
				}
				
			}
		}
	 	
	 	String newPg1 = driver.getTitle();
		if (newPg1.equals(LoginPage)) {
			System.out.println("Login Failed"
					+ "");
		}
	}

}
