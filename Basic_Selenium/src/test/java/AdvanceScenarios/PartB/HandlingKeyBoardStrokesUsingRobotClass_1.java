package AdvanceScenarios.PartB;

import java.awt.Robot;
import java.awt.event.KeyEvent;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyBoardStrokesUsingRobotClass_1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		
		Thread.sleep(1000);
		
	 Robot rob = new Robot();
	 
	 Thread.sleep(1000);
		
	 rob.keyPress(KeyEvent.VK_CONTROL);
	 rob.keyPress(KeyEvent.VK_A);
	 rob.keyRelease(KeyEvent.VK_CONTROL);
	 rob.keyRelease(KeyEvent.VK_A);
		
	 Thread.sleep(2000);
		
	rob.keyPress(KeyEvent.VK_CONTROL);
	rob.keyPress(KeyEvent.VK_C);
	rob.keyRelease(KeyEvent.VK_CONTROL);
	rob.keyRelease(KeyEvent.VK_C);

	Thread.sleep(2000);
	
	rob.keyPress(KeyEvent.VK_TAB);
	rob.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	
	rob.keyPress(KeyEvent.VK_CONTROL);
	rob.keyPress(KeyEvent.VK_V);
	rob.keyRelease(KeyEvent.VK_CONTROL);
	rob.keyRelease(KeyEvent.VK_V);
	}

}
