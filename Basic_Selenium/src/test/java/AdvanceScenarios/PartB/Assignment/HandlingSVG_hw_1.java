package AdvanceScenarios.PartB.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSVG_hw_1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.clinique.in/");
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='OK, ACCEPT ALL']")).click();
			Thread.sleep(2000);
			//driver.findElement(By.cssSelector("[id=\"dismissBtn\"]")).click();
			
			//Thread.sleep(2000);
			
			driver.findElement(By.xpath("//*[name()='svg' and @class=\"ufc-cart-icon-svg\"]")).click();

		}
			
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		
//		driver.get("https://www.clinique.in/");
//		
//		Thread.sleep(2000);
//		//=================      https://www.clinique.in/
//		driver.findElement(By.xpath("(//span[text()=\"Search\"])[1]")).sendKeys("lipstick");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//*[name()='svg' and @class=\"header-search-icon\"])[1]")).click();
		
	}


