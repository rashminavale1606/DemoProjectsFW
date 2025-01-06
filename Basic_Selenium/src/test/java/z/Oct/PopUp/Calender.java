package z.Oct.PopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calender {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions actions = new Actions(driver);
		actions.moveByOffset(10,20).click().perform();
		
		driver.findElement(By.xpath("//span[text()=\"Departure\"]")).click();
		
//		Robot robo=new Robot();
//		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
//		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
		driver.findElement(By.cssSelector("[aria-label=\"Next Month\"]")).click();
		String month="December 2024";
		String date ="16";
		
		WebElement select = driver.findElement(By.xpath("//div[text()=\""+month+"\"]"
				+ "/../following-sibling::div[@class=\"DayPicker-Body\"]"
				+ "//div[@class=\"dateInnerCell\"]//p[text()=\""+date+"\"]"));
		
		select.click();
		
	}

}
