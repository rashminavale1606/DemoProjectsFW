package testNg.pkg;

package AdvanceScenarios.PartB.pOPUPS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertPopupTestng {

	

	

		public static void alertPopupTestng  {
			// TODO Auto-generated method stub

			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//			driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

//		 Alert alt = driver.switchTo().alert();
//		 alt.accept();
		//or
//		 driver.switchTo().alert().accept();//accept----->to click ok button in alert
		
//		 String ele = driver.switchTo().alert().getText();//getText()---->to fetch the alert message
//		 System.out.println(ele);
			
			
//			WebElement confirmYes_or_No = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
//			
//			confirmYes_or_No.click();
			
			//driver.switchTo().alert().accept();  ---> to click ok button
			
//			driver.switchTo().alert().dismiss();  -----------> to click cancel
			
			
			driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
			
			driver.switchTo().alert().sendKeys("good");
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			
			
		}

	}


