package z.SelfPractice.Adv_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D__SVG_ElementHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.kayak.co.in/");
		
		WebElement svg = driver.findElement(By.xpath("//*[name()='svg' and @class=\"oLv- oLv--mod-saved\"]"));
		
		svg.click();
		
	}

}
