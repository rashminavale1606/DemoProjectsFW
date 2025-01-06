package AdvanceScenarios.PartB;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyBoardStrokesUsingKeys_1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		
		//case-1
//		WebElement username = driver.findElement(By.id("user-name"));
//		username.sendKeys("standard_user",Keys.TAB);
//		
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("secret_sauce",Keys.ENTER);
//		
//	driver.navigate().back();
	
		
		//case-2
//		driver.findElement(By.id("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);

		
		//Trying to enter multiple times
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user",Keys.CONTROL+"a");
		Thread.sleep(2000);
		username.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(2000);
		username.sendKeys(Keys.TAB, Keys.CONTROL+"v");
	}

}
