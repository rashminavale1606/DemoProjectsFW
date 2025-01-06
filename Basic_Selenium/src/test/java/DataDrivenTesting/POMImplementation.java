package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import objectRepo.LoginPage;

public class POMImplementation {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		FileInputStream files = new FileInputStream("D:\\QSpider\\Selenium\\CommonPath_DDT.properties");
		
		Properties pro = new Properties();
		
		pro.load(files);
		
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		
		
		driver.get(URL);
//		driver.findElement(By.cssSelector("[type='text']")).sendKeys(USERNAME);
//		driver.findElement(By.cssSelector("[type='password']")).sendKeys(PASSWORD);
//		
//		driver.findElement(By.cssSelector("[value='LOGIN']")).click();
		
//		LoginPage login = new LoginPage(driver);
//		
//		login.getUsernameTextField().sendKeys(USERNAME);
//		login.getPasswordTextField().sendKeys(PASSWORD);
//		login.getLoginBtton().click();
		
		LoginPage login = new LoginPage(driver);
		login.loginToApplication(USERNAME, PASSWORD);
		
		

	}

}
