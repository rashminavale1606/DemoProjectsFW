package AdvanceScenarios.PartB.pOPUPS;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("iphone15", Keys.ENTER);
		
		 driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 128 GB)']")).click();
		

		 ///                 https://demo.automationtesting.in/Windows.html
		
		//switch from main to child
		 
		 String mainID = driver.getWindowHandle();
		 
		 System.out.println(mainID);
		 
		Set<String> allWindowIDs = driver.getWindowHandles();
		System.out.println(allWindowIDs);
		
		
		for (String id : allWindowIDs) {
			
		if (!mainID.equals(id)) {
			
			
			driver.switchTo().window(id);
			String ph = driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (Black, 128 GB)']")).getText();
			System.out.println(ph);
		}
		
		}
		
		
	}

}
