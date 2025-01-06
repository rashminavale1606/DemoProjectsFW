package z.SelfPractice.Adv_Scenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F__ListBox_DropDown_Handling {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		//By using KeyBoardStrokes
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		
		WebElement day = driver.findElement(By.cssSelector("[title=\"Day\"]"));
		
		day.click();
		Robot robo = new Robot();
		
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		
		day.click();
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		
		month.click();
	
		month.sendKeys(Keys.ARROW_UP);
		month.sendKeys(Keys.ARROW_UP);
		month.sendKeys(Keys.ARROW_UP);
		month.click();
		
		WebElement yearElement=driver.findElement(By.id("year"));
		
		yearElement.click();
		
		yearElement.sendKeys(Keys.ARROW_DOWN);
		yearElement.sendKeys(Keys.ARROW_DOWN);
		yearElement.click();
	}

}
