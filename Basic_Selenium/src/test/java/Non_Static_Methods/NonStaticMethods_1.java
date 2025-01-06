package Non_Static_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.sdk.metrics.internal.view.DropAggregation;

public class NonStaticMethods_1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

//		driver.get("https://www.amazon.in/");
		
//		WebElement ele = driver.findElement(By.linkText("Today's Deals"));
		
//		Actions actions = new Actions(driver);
//		
//		actions.moveToElement(ele).perform();
		
		
//		  WebElement link = driver.findElement(By.linkText("Mobiles"));
//		  
//		  Actions act = new Actions(driver);
//		  
//		 act.contextClick(link).perform();
		
		
//		driver.get("https://www.saucedemo.com/v1/");
//		
//		 WebElement un = driver.findElement(By.id("user-name"));
//		WebElement pwd = driver.findElement(By.name("password"));
//		WebElement login = driver.findElement(By.className("btn_action"));
//		Actions actions = new Actions(driver);
//		
//		actions.sendKeys(un, "standard_user").perform();
//		actions.sendKeys(pwd, "secret_sauce").perform();
//		actions.click(login).perform();
		
//		actions.sendKeys(un, "standard_user").sendKeys(pwd, "secret_sauce").click(login).build().perform();
		
		
//		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
//		
//		WebElement drag = driver.findElement(By.id("draggable"));
//		
//		WebElement drop = driver.findElement(By.id("droppable"));
//		
//		Actions actions = new Actions(driver);
//		
////		actions.clickAndHold(drag).release(drop).perform();
//		
//		actions.dragAndDrop(drag, drop).perform();
		
		
//		
//		driver.get("https://demo.guru99.com/test/simple_context_menu.html ");
//		
//	    WebElement ele = driver.findElement(By.xpath("//button[text()=\"Double-Click Me To See Alert\"]"));
//	    
//	    Actions actions = new Actions(driver);
//	    
//	    actions.doubleClick(ele).perform();
		
		
		
		driver.get("https://www.makemytrip.com");
		 Actions actions = new Actions(driver);
		 Thread.sleep(2000);
		 actions.moveByOffset(10, 20).click().perform();
//		  
	}

}
