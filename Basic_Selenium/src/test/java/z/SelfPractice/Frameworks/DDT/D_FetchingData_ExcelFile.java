package z.SelfPractice.Frameworks.DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class D_FetchingData_ExcelFile {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("./src/test/resources/self_Fetch.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		
		//step3: sheet access
		Sheet sheet = book.getSheet("Sheet1");
		
		//step 4 row
		
		Row row = sheet.getRow(2);
		
		//step 5 cell
		
		Cell cell = row.getCell(5);
		
		
		// fetching data 
		
		String excelData = cell.getStringCellValue();
		System.out.println(excelData);
		
		
//		
//		Workbook book1 = WorkbookFactory.create(fis);
//		Sheet s1 = book1.getSheet("Sheet1");
//		Row r1 = s1.getRow(5);
//		Cell c1 = row.getCell(2);
//		String data = c1.getStringCellValue();
//		System.out.println(data);
		
//		Row r2 = sheet.getRow(2);
//		Cell c2 = row.getCell(5);
//		System.out.println(c2.getStringCellValue());
		
	}

}
