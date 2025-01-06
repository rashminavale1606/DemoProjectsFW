package AdvanceScenarios.PartB;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestions {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("puma");
		
		
		Thread.sleep(2000);
		  List<WebElement> allSugg = driver.findElements(By.xpath("//div[@class=\"left-pane-results-container\"]//div[@aria-label]"));
		  Thread.sleep(2000);
		  
		  for (WebElement sugg : allSugg) {
			
			  System.out.println(sugg.getText());
			  if(sugg.getText().contains("puma shoes for women")) {
				  
				  sugg.click();
				  break;

			  }
		}
	}

}
