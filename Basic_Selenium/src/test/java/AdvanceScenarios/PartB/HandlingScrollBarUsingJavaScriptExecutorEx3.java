package AdvanceScenarios.PartB;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBarUsingJavaScriptExecutorEx3 {

	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement ele = driver.findElement(By.xpath("//a[text()=\"Instagram\"]"));
		
		Point loc = ele.getLocation();
		System.out.println(loc.getX());
		System.out.println(loc.getY());
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView()",ele); 
		Thread.sleep(1000);
		ele.click();
	}

}
