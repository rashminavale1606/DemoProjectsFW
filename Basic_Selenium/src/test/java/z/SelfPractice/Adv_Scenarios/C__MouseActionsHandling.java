package z.SelfPractice.Adv_Scenarios;
import org.openqa.selenium.By;
/**
 * @author admin
 * @category 
 * moveToElement(Webelement ele)
 * contextClick(WebElement ele)
 *
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class C__MouseActionsHandling {

	@Test
	public void c__MouseActionsHandling() throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		Thread.sleep(1000);
		 WebElement deals = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		 
		Thread.sleep(1000);
		
		 Actions actions = new Actions(driver);
		 
		 actions.moveToElement(deals).perform();//highlight ele
		 
		 Thread.sleep(1000);
		 
		 WebElement mob = driver.findElement(By.linkText("Mobiles"));
		 
		 Thread.sleep(1000);
		 
		 actions.contextClick(mob).perform();
		 //performs right click action on mob
	}

}
