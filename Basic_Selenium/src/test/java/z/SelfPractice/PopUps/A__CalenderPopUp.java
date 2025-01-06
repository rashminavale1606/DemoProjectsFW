package z.SelfPractice.PopUps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A__CalenderPopUp {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act = new Actions(driver);
		act.moveByOffset(10, 20).click().perform();
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		String month= "December 2024";
		String dateString= "16";
		WebElement select = driver.findElement(By.xpath("//div[text()='"+month+"']"
										+ "/ancestor::div[@class=\"DayPicker-Month\"]"
															+ "//div[@class='"+dateString+"']"
															+ "//p[text()=\"27\"]"));
	
		select.click();
	
	}

}
