package z.SelfPractice.Adv_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C3__MouseActionsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//double click
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		
		WebElement doubleClickVar = driver.findElement(By.xpath("//button[contains(text(),\"Double-Click\")]"));
		
		Actions action = new Actions(driver);
		action.doubleClick(doubleClickVar).perform();
	}

}
