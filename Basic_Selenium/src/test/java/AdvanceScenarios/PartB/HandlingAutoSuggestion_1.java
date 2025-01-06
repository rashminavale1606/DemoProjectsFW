package AdvanceScenarios.PartB;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingAutoSuggestion_1 {

	@Test
	public static void handlingAutoSuggestion_1() throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com/");
		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("apple");
		
		
		Thread.sleep(2000);
		List<WebElement> allsugg = driver.findElements(By.xpath("//ul[@class=\"overscroll-contain\"]//span[b]"));
		Thread.sleep(2000);
		
		for (WebElement sugg : allsugg) {
			
			System.out.println(sugg.getText());
			
			//System.out.println(sugg.getText().contains("Apple - Red Delicious, Economy"));
			
			//here sugg element, searched till (baby apple shimla) provided element contains
			//otherwise it was giving all suggestions in console 
			
			if(sugg.getText().contains("Baby Apple Shimla")){
				
				System.out.println("**************************************************");
					sugg.click();
					System.out.println("element clicked successfully!");
					
					break;
			}
		}

}
}
