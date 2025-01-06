package AdvanceScenarios.PartB;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropdownUsingKeyClass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		
		
		// 13 aug 2024 --> 20 may 2019
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("day"));
		
		day.click();
		day.sendKeys(Keys.ARROW_DOWN);
		day.sendKeys(Keys.ARROW_DOWN);
		day.sendKeys(Keys.ARROW_DOWN);
		day.sendKeys(Keys.ARROW_DOWN);
		day.sendKeys(Keys.ARROW_DOWN);
		day.sendKeys(Keys.ARROW_DOWN);
		day.sendKeys(Keys.ARROW_DOWN);
		
		day.click();
		
		Thread.sleep(2000);
		 WebElement month = driver.findElement(By.id("month"));
		 
		 month.click();
		 month.sendKeys(Keys.ARROW_UP);
		 month.sendKeys(Keys.ARROW_UP);
		 month.sendKeys(Keys.ARROW_UP);
		 
		 month.click();
		 
		 Thread.sleep(2000);
		 WebElement year = driver.findElement(By.id("year"));
		 year.click();
		 year.sendKeys(Keys.ARROW_DOWN);
		 year.sendKeys(Keys.ARROW_DOWN);
		 year.sendKeys(Keys.ARROW_DOWN);
		 year.sendKeys(Keys.ARROW_DOWN);
		 year.sendKeys(Keys.ARROW_DOWN);
		 
		 year.click();
		 
	}

}
