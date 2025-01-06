package Task_Training_nov;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task_29_Nov {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		driver.findElement(By.xpath("//p[contains(text(),\"UI Testing Concepts\")]")).click();
		
//		WebElement scrollele = driver.findElement(By.xpath("//ul[@class=\"pt-2 pe-1\"]"));
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		driver.findElement(By.xpath("//ul[@class=\"pt-2 pe-1\"]//li/section[contains(text(),\"Date & Time Picker\")]")).click();
		
		driver.findElement(By.xpath("//a//section[text()=\"Time Picker\"]")).click();
		
		driver.findElement(By.xpath("//button[@aria-label=\"Choose time\"]")).click();
		
		driver.findElement(By.xpath("//div//ul//li//a[text()=\"Time Picker Clock\"]//div//ul//li//a[text()=\"Time Picker Clock\"]")).click();
		
		
		//choose hour
		
		Actions actions = new Actions(driver);
		
		actions.click(driver.findElement(By.xpath("//div[@aria-label=\"Select hours. Selected time is 7:00 AM\"]"))).perform();
		
		

	}

}
