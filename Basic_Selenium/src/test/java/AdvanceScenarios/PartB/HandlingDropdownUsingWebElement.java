package AdvanceScenarios.PartB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropdownUsingWebElement {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		
		
		// 17 aug 2024 --> 10 dec 2000
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[@value='20']")).click();
		driver.findElement(By.xpath("//option[text()='Oct']")).click();
		driver.findElement(By.xpath("//option[text()='2005']")).click();
		
	}

}
