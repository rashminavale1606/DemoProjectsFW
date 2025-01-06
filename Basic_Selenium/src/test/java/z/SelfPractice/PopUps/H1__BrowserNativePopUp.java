package z.SelfPractice.PopUps;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class H1__BrowserNativePopUp {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		//WebDriver driver=new ChromeDriver();
		
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
  
		WebDriver driver=new ChromeDriver(opt);
      driver.get("https://www.irctc.co.in/nget/train-search");
		
		
//	      driver.get("https://www.irctc.co.in/nget/train-search");
//	      
//	     Robot rob = new Robot();
//	     Thread.sleep(1000);
//	     rob.keyPress(KeyEvent.VK_TAB);
//	     rob.keyRelease(KeyEvent.VK_TAB);
//	     Thread.sleep(1000);
//	     rob.keyPress(KeyEvent.VK_TAB);
//	     rob.keyRelease(KeyEvent.VK_TAB);
//	     Thread.sleep(1000);
//	     rob.keyPress(KeyEvent.VK_TAB);
//	     rob.keyRelease(KeyEvent.VK_TAB);
//	     Thread.sleep(1000);
//	     rob.keyPress(KeyEvent.VK_ENTER);
//	     rob.keyRelease(KeyEvent.VK_ENTER);
	}

}
