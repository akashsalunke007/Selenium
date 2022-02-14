import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TCAssignment {
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Women']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(.,'Faded Short Sleeve T-shirts')]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[contains(.,'Add to cart')]")).click();
		System.out.println("Product Successfully added to your shopping cart");    
		Thread.sleep(3000);
//		driver.close();
		//-----------------------------------  Tast Case 01 completed  ----------------------------------------------------------------
		
		
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Women']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(.,'Faded Short Sleeve T-shirts')]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[contains(.,'Add to cart')]")).click();
		//System.out.println("Product Successfully added to your shopping cart");    
		Thread.sleep(3000);
		
		String quantityString = driver.findElement(By.xpath("//span[@id='layer_cart_product_quantity']")).getText();
		//System.out.println("Total Number Of Product is : "+quantityString);
		
		int quantity = Integer.parseInt((String)quantityString);
		
		//System.out.println(quantity);
		
		if (quantity>0) {
			System.out.println("Quantity is Increased i.e.  :  "+quantity);
		}  
		else {
			System.out.println("Quantity is Zero");
		}
		
		
//		driver.close();
		
		//-----------------------------------  Tast Case 02 completed  ----------------------------------------------------------------		
		
		
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Women']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(.,'Faded Short Sleeve T-shirts')]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[contains(.,'Add to cart')]")).click();
		//System.out.println("Product Successfully added to your shopping cart");    
		Thread.sleep(3000);
		
		String quantityString1 = driver.findElement(By.xpath("//span[@id='layer_cart_product_quantity']")).getText();
		//System.out.println("Total Number Of Product is : "+quantityString);
		
//		int quantity1 = Integer.parseInt((String)quantityString1);
		
		//System.out.println(quantity);
		
//		if (quantity1>0) {
//			System.out.println("Quantity is Increased i.e.  :  "+quantity1);
//		}  
//		else {
//			System.out.println("Quantity is Zero");
//		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@title='Close window']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='View my shopping cart']")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='icon-trash']")).click();
		System.out.println("Items Removed Form Cart Successfully Successfully");
		Thread.sleep(2000);
		
//		driver.close();
		
		//----------------------------------- Tast Case 03 completed  ----------------------------------------------------------------
		
		
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Women']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(.,'Faded Short Sleeve T-shirts')]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[contains(.,'Add to cart')]")).click();
		System.out.println("Product Successfully added to your shopping cart");    
		Thread.sleep(3000);
		
		//String quantityString2 = driver.findElement(By.xpath("//span[@id='layer_cart_product_quantity']")).getText();
		//System.out.println("Total Number Of Product is : "+quantityString);
		
		//int quantity2 = Integer.parseInt((String)quantityString2);
		
		//System.out.println(quantity);
		
//		if (quantity2>0) {
//			System.out.println("Quantity is Increased i.e.  :  "+quantity2);
//		}  
//		else {
//			System.out.println("Quantity is Zero");
//		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@title='Close window']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='View my shopping cart']")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='icon-trash']")).click();
		//System.out.println("Items Removed Form Cart Successfully Successfully");
		Thread.sleep(2000);
		
		driver.navigate().back();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//div[contains(.,'$26.00')]/h5/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p/button/span[contains(.,'Add to cart')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(.,'Continue shopping')]/i")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(.,'$30.50')]/div[@class='right-block']/h5/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//p/button/span[contains(.,'Add to cart')]")).click();
		Thread.sleep(2000);
		
		//----------------------------------- Tast Case 04 completed  ----------------------------------------------------------------
		
		
		driver.close();
		
		
	}
}
