package AdvanceScenarios.PartB;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingWaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		/*
		 * v3-    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.Seconds)
		 * 
		 * v4:  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 * 
		 *  */
		
		//v4 selenium
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		
//		login.click();
//*********		EXPLICIT WAIT *****
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		
//		
//		String ele = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).getText();
//		
//		//Swag Labs. 
//		//wait.until(ExpectedConditions.titleContains("swag Labs"));==TimeoutException:
//		
//		
//		wait.until(ExpectedConditions.titleContains("Swag Labs"));
//		System.out.println(ele);
		
		
		//FLUENTWAIT*********
		
		FluentWait wait1 = new FluentWait(driver);
		
		wait1.pollingEvery(Duration.ofSeconds(1));
		
		wait1.until(ExpectedConditions.elementToBeClickable(login));
		
		login.click();
	}

}
