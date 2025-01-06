package z.SelfPractice.Adv_Scenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class H__ScrollHandling_RobotClass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		Robot scroll = new Robot();
		
		Thread.sleep(1000);
		
		scroll.keyPress(KeyEvent.VK_PAGE_DOWN);
		scroll.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(1000);
		scroll.keyPress(KeyEvent.VK_PAGE_DOWN);
		scroll.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(1000);
		scroll.keyPress(KeyEvent.VK_PAGE_DOWN);
		scroll.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		
		Thread.sleep(1000);
		scroll.keyPress(KeyEvent.VK_PAGE_UP);
		scroll.keyRelease(KeyEvent.VK_PAGE_UP);
		
		
		Thread.sleep(1000);
		scroll.keyPress(KeyEvent.VK_PAGE_UP);
		scroll.keyRelease(KeyEvent.VK_PAGE_UP);
	}

}
