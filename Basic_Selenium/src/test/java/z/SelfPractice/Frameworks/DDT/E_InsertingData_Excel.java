package z.SelfPractice.Frameworks.DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class E_InsertingData_Excel {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		// ./src/test/resources/self_Fetch.xlsx
		
	FileInputStream fis = new FileInputStream("./src/test/resources/self_Fetch.xlsx");
	
	Workbook book1 = WorkbookFactory.create(fis);
	
	Sheet sheet1 = book1.getSheet("Sheet1");
	Row row1 = sheet1.createRow(6);
	Cell cell1 = row1.createCell(8);
	
	cell1.setCellValue("narayan");
	
	FileOutputStream fos = new FileOutputStream("./src/test/resources/self_Fetch.xlsx");
	book1.write(fos);
	
	book1.close();
	}

}
