package z.SelfPractice.Adv_Scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C4__MouseActionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//moveByOffset
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		
		Actions action = new Actions(driver);
		
		action.moveByOffset(10,20).click().perform();
	}

}
