import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMethod {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		System.out.println(readCell("./demo.xlsx","Sheet1",1,2));

	}
	
	public static String readCell(String Path,String sheet,int r,int c) throws EncryptedDocumentException, InvalidFormatException, IOException{
		FileInputStream fis = new FileInputStream(Path);
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheet);
		Cell data = sh.getRow(r-1).getCell(c-1);
		return data.toString();
	}
	

}
