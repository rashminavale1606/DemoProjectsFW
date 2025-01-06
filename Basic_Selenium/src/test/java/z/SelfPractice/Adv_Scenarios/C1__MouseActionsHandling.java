package z.SelfPractice.Adv_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C1__MouseActionsHandling {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		
		
		Thread.sleep(1000);
			WebElement username = driver.findElement(By.id("user-name"));
			WebElement password = driver.findElement(By.id("password"));
			WebElement login = driver.findElement(By.cssSelector("[type=\"submit\"]"));
			
			Thread.sleep(1000);
			
			Actions act = new Actions(driver);
//			act.sendKeys(username,"standard_user").perform();
//			act.sendKeys(password,"secret_sauce").perform();
//			act.click(login).perform();
			
			Thread.sleep(1000);
			act.sendKeys(username,"standard_user").sendKeys(password,"secret_sauce").click(login).build().perform();
		
		

	}

}
