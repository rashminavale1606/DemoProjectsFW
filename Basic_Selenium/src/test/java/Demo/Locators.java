package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators {

	@Test
	public static void locators() {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/v1/");
		//Syntax 1: Attribute name = value
		//id="user-name"
		
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
		
		//SYNTAX 2: NAME() ==> ATTRIBUTE NAME = "ATTRIBUTE VALUE"
		//name() 
		
//		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		
		//HERE PASSWORD IS NOT UNIQUE, TO GET IT UNIQUE VALUE ,
		//CTRL+F==> WRITE THE VALUE OF ID IN DOUBLE QUOTES 
		//CHECK IF ITS GIVING YOU UNIQUE VALUE 
		//HOLA! ITS BGIVING UNIQUE VALUE 
		
//		driver.findElement(By.name("password")).sendKeys("secret_sauce");
//		driver.findElement(By.id("login-button")).click();
		
		
		//SYNATX: className() ---> ATTRIBUTE NAME = "ATTRIBUTE VALUE"
//		driver.findElement(By.name("user-name")).sendKeys("standard_user");
//
//		driver.findElement(By.name("password")).sendKeys("secret_sauce");
//		
//		driver.findElement(By.className("btn_action")).click();
		
		//LOCATOR 6: CSSSELECTOR  
		//SYNTAX 1:  ATTNAME = 'ATTVALUE'
		
		driver.findElement(By.cssSelector("[type='text']")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("secret_sauce");
//		
		driver.findElement(By.cssSelector("[value='LOGIN']")).click();
		
		
		

	}

}
