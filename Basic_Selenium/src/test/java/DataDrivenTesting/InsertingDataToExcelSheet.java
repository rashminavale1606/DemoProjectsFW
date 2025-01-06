package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertingDataToExcelSheet {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
	FileInputStream fis = new FileInputStream("D:\\QSpider\\ExcelData.xlsx");
		
		
		Workbook book = WorkbookFactory.create(fis); // input stream
		
		Sheet sheet1 = book.getSheet("Sheet1");
		
		Row row = sheet1.createRow(5);
		Cell cel = row.createCell(0);
		
		 cel.setCellValue("Cats");//string
		 
		FileOutputStream fos = new FileOutputStream("D:\\QSpider\\ExcelData.xlsx");
		
		book.write(fos);
		
		book.close();
		
	

}
}

/*
 * package frameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertDataToExcelSheet {

	public static void main(String[] args) throws Throwable {
	
		//step1:-path connection
		//	FileInputStream fis = new FileInputStream("C:\\Users\\Shobha\\Downloads\\ExcelData2.xlsx");
			FileInputStream fes = new FileInputStream("./src/test/resources/ExcelData2.xlsx");
			//step2:- ExcelFile in read mode
			Workbook book = WorkbookFactory.create(fes);

			//step3:-getting control on sheet
		    Sheet sheet = book.getSheet("Sheet1");
		    
		    Row row = sheet.createRow(5);
	 
		   Cell cel = row.createCell(5);
	
		   cel.setCellValue("Shobha");
		   
		   FileOutputStream fos = new FileOutputStream("./src/test/resources/ExcelData2.xlsx");
		   book.write(fos);
		   book.close();
	}

}
 * 
 */