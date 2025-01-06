package z.SelfPractice.Frameworks.DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_FetchingData_InsertingData {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		FileInputStream fis1 = new FileInputStream("./src/test/resources/self_ddt_RM.properties");
		
		Properties pro = new Properties();
		
		pro.load(fis1);
		
		String URL = pro.getProperty("url");
		String UN = pro.getProperty("username");
		String PW = pro.getProperty("password");
		
		driver.get(URL);
		driver.findElement(By.name("user-name")).sendKeys(UN);
		driver.findElement(By.id("password")).sendKeys(PW);
		driver.findElement(By.id("login-button")).click();

	}

}
