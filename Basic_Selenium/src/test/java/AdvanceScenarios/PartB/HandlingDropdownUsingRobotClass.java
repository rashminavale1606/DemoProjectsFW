package AdvanceScenarios.PartB;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropdownUsingRobotClass {

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
		
		
		Robot rob = new Robot();
		
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
day.click();
		
		Thread.sleep(2000);
		 WebElement month = driver.findElement(By.id("month"));
		 
		 month.click();
		 
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
			
			 month.click();
			 
			 Thread.sleep(2000);
			 WebElement year = driver.findElement(By.id("year"));
			 year.click();
			 
			 rob.keyPress(KeyEvent.VK_UP);
				rob.keyRelease(KeyEvent.VK_UP);
				
				year.click();
		 
	}

}
