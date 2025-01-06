package z.SelfPractice.Adv_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
/**
 * @author admin
 * @category USING KEYS CLASS
 *
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class B__KeyBoardStrokeHandling {

	@Test
	public void b__KeyBoardStrokeHandling() throws Throwable{
		// TODO Auto-generated method stub

		//B__KeyBoardStrokeHandling
		// USING KEYS CLASS 
		Thread.sleep(1000);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.saucedemo.com/v1/");
		
		WebElement userName = driver.findElement(By.id("user-name"));
		
		Thread.sleep(1000);
		userName.sendKeys("standard_user", Keys.CONTROL+"a");
		Thread.sleep(1000);
		userName.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(1000);
		userName.sendKeys(Keys.TAB,Keys.CONTROL+"v",Keys.ENTER);
	}

}
