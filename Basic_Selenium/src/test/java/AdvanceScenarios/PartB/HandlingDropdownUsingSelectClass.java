package AdvanceScenarios.PartB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownUsingSelectClass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		
		
		// 17 aug 2024 --> 10 dec 2000
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("day"));
		
//		day.click();
		
		Select select1 = new Select(day);
		//select1.selectByIndex(9);
		//select1.selectByValue("7");
		select1.selectByVisibleText("2");
		
		Thread.sleep(2000);
		 WebElement month = driver.findElement(By.id("month"));
		 
	//	 month.click();
		 
		 Select select2 = new Select(month);
		 
//		 select2.selectByIndex(11);
		 
		// select2.selectByValue("9");
		 select2.selectByVisibleText("Jul");
		 
		 Thread.sleep(2000);
		 WebElement year = driver.findElement(By.id("year"));
		// year.click();
		 
		 Select select3 = new Select(year);
		                                                  
		                                                		  
//		 select3.selectByIndex(24);
		 
		 
		// select3.selectByValue("2019");
		 
		 select3.selectByVisibleText("1996");
		// year.click();
	}

}
