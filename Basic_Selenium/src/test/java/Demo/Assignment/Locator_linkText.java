package Demo.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_linkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		//LOCATOR 4: linkText()
		driver.findElement(By.linkText("Today's Deals")).click();
		
		
		//LOCATOR 5: partialLinkText()
		//Amazon miniTV ==> valid partial value: Amazon or miniTV ==> invalid: Amaz TV
		driver.findElement(By.partialLinkText("miniTV")).click();
	}

}
