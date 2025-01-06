package DataDrivenTesting;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InsertDataToProperties {

//	public static void main(String[] args) throws Throwable   {
//		// TODO Auto-generated method stub
//		
//		// ./src/test/resources/Data1.properties
//		
//		FileInputStream fis = new FileInputStream("./Basic_Selenium/src/test/resources/empty.properties"); 
//		Properties pro = new Properties();
//		
//		pro.setProperty("url", "https://www.saucedemo.com/v1/");
//		pro.setProperty("username", "standard_user");
//		pro.setProperty("password", "secret_sauce");
//		
//		FileOutputStream fos = new FileOutputStream("./Basic_Selenium/src/test/resources/empty.properties");
//		
//		pro.store(fos, "CommonInsertData");
//		
//	}
	
	




	public static void main(String[] args) throws Throwable {

		// step1:-connecting the physical file path to the script
		FileInputStream fis = new FileInputStream("./src/test/resources/empty.properties");//read mode
		
       Properties pro = new Properties();
       pro.setProperty("url", "https://www.saucedemo.com/v1/");
       pro.setProperty("username", "standard_user");
       pro.setProperty("password", "secret_sauce");
       
       
	  FileOutputStream fos = new FileOutputStream("./src/test/resources/empty.properties");//write mode
	  pro.store(fos, "CommomData");
	
	}

}


