package z.SelfPractice.Frameworks.DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.hpsf.Property;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_FetchingData_PropertiesFile {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		//Normal Approach
//		driver.get("https://www.saucedemo.com/v1/");
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
		
		//step1: create file path
		
		FileInputStream fis = new FileInputStream("./src/test/resources/self_DDT.properties");
		
		//step2: load properties
		
		Properties pro = new Properties();
		pro.load(fis);
		
		//step3: fetching the data from external file
		
		String URL = pro.getProperty("url");
		String UN = pro.getProperty("username");
		String PW = pro.getProperty("password");
		
		driver.get(URL);
		driver.findElement(By.id("user-name")).sendKeys(UN);
		driver.findElement(By.id("password")).sendKeys(PW);
		
		driver.findElement(By.id("login-button")).click();

	}

}
