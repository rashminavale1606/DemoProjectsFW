package Demo.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_Synax1_Loc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.cssSelector("a[href=\"/minitv?ref_=nav_avod_desktop_topnav\"]")).click();
		driver.findElement(By.cssSelector("span[data-testid=\"appnavbar-menuitem-ct-web-series\"]")).click();
//		
//		driver.findElement(By.cssSelector("[id=\"B082WYMTWF\"]")).click();
		
		//CSS SELECTOR: SYNTAX1: [attName='attValue']

	}

}
