package z.SelfPractice.Adv_Scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class G1__Wait_Explicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/");
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.id("login-button"));
		
		WebDriverWait exWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		exWait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
		
		String tp = driver.findElement(By.xpath("//div[text()=\"Sauce Labs Backpack\"]")).getText();
		exWait.until(ExpectedConditions.titleContains("rashmi"));
		System.out.println(tp);
		
		//TimeoutException
	}

}
