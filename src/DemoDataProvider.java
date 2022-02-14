import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDataProvider {
	
	@DataProvider
	public static String[][] DP(){
		String data[][] = new String[3][2];
		data[0][0] = "UserA";
		data[0][1] = "A";
		data[1][0] = "UserB";
		data[1][1] = "B";
		data[2][0] = "UserC";
		data[2][1] = "C";
		
		return data;
	}
	
	
	
	@Test(dataProvider = "DP")
	public void tc_01(String name, String pass)
	{
		Reporter.log(name+"    "+pass,true);
	}

}
