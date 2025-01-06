package AdvanceScenarios.PartB;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBarUsingJavaScriptExecutorEx2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement ele = driver.findElement(By.xpath("//a[text()=\"Help\"]"));
		
		System.out.println(ele.getLocation().getX());
		System.out.println(ele.getRect().getY());
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(320,825)");
		
		Thread.sleep(2000);
		ele.click();
		
	}

}
