package z.SelfPractice.Adv_Scenarios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objectRepo.Self_LoginPage;

public class POMImplementaion {

	public static void main(String[] args) throws Throwable {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FileInputStream fis = new FileInputStream("./src/test/resources/self_DDT.properties");
		
		Properties pro = new Properties();
		pro.load(fis);
		
		String URL = pro.getProperty("url");
		String UN =pro.getProperty("username");
		String PW =pro.getProperty("password");
		
		driver.get(URL);
		
//		Self_LoginPage loginPage = new Self_LoginPage(driver);
//		loginPage.getUsername().sendKeys(UN);
//		loginPage.getPasswordElement().sendKeys(PW);
//		loginPage.getLoginElement().click();
		
		Self_LoginPage loginPage = new Self_LoginPage(driver);
		loginPage.loginPageInfo(UN, PW);
	
		
		
	}
}
