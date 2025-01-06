package AdvanceScenarios.PartB;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWebElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");

		 List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		 int count=0;
		 for (WebElement link : allLinks) {
			 
			// System.out.println(link.getText());--> visible text
			 
			 System.out.println(link.getAttribute("href"));//---> link
			  count++;
			  
			
		}
		 
		 System.out.println(count);
	}

}
