import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		FileInputStream fis=new FileInputStream("./demo.xlsx");

			
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet1");
		int rCount=sh.getPhysicalNumberOfRows();
		System.out.println(rCount);
		
	 	int cCount = sh.getRow(1).getLastCellNum();
	 	System.out.println(cCount);
	 	
	 	for (int i = 1; i < rCount; i++) {
			for (int j = 0; j <cCount ; j++) {
				Cell c = sh.getRow(i).getCell(j);
				System.out.println(c.toString());
			}
		}
	}

}
