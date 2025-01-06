package AdvanceScenarios.PartB;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBarUsingJavaScriptExecutorEx4 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		// *********   document.body.scrollHeight
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//scrollDOWN
		
		Thread.sleep(1000);
		
		
		
		//..........  -document.body.scrollHeight
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");//scrollUP
		
	}

}
