package Demo.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID_Locator {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("puma");
		//HERE IN ABOVE LOCATOR, ID IS NOT UNIQUE AS IT IS GIVING 1 OF 2 FOR VALUE OF ID() LOCATOR 
		//OTHERWISE DRIVER ACTION WILL GO WROMG IF THE GIVEN LOCATOR IS NOT UNIQUE
		// IF A LOCATOR IS NOT GIVING UNIQUE VALUE JUST GO FOR ANOTHER VALUE
		
		
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15 pro max");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		
	}

}
