package DemoTestNG;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DataPFullSheet {

	@DataProvider
	public static String[][] read() throws EncryptedDocumentException, InvalidFormatException, IOException {

		String[][] data;

		FileInputStream fis = new FileInputStream("./demo.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sh = wb.getSheet("Sheet2");
		
		int rCount = sh.getPhysicalNumberOfRows();
		//System.out.println(rCount);

		int cCount = sh.getRow(0).getLastCellNum();
		//System.out.println(cCount);
		data = new String[rCount-1][cCount];

		for (int i = 1; i < rCount; i++) {
			for (int j = 0; j < cCount; j++) {
				Cell cl = sh.getRow(i).getCell(j);
				data[i-1][j] = cl.toString();
			}

		}

		return data;

	}

}
