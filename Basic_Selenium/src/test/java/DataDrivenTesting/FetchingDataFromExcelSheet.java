package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcelSheet {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("D:\\QSpider\\ExcelData.xlsx");
		
		
		Workbook book = WorkbookFactory.create(fis); // input stream

		Sheet sheet1 = book.getSheet("Sheet1");
		
		Row row = sheet1.getRow(10);
		
		Cell cell = row.getCell(5);
		
		String excelData = cell.getStringCellValue();
		
		System.out.println(excelData);
	}

}
