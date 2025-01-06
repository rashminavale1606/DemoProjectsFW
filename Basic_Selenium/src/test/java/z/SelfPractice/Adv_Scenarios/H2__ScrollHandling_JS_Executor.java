package z.SelfPractice.Adv_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H2__ScrollHandling_JS_Executor {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

//		WebDriver driver = new ChromeDriver();
//		driver.get("https://demo.automationtesting.in/Windows.html");
//		driver.manage().window().maximize();
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		Thread.sleep(1000);
//		js.executeScript("window.scrollBy(100,0)");
//		Thread.sleep(1000);
//		js.executeScript("window.scrollBy(-100,0)");
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.facebook.com");
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();

		WebElement ele = driver.findElement(By.xpath("//span[text()=\"Instagram Lite\"]"));
//		Point loc = ele.getLocation();
//	    System.out.println(loc.getX());
//	    System.out.println(loc.getY());
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("window.scrollBy(667,679)");
      Thread.sleep(1000);
      ele.click();
	}

}
