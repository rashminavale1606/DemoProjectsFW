package AdvanceScenarios.PartB;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBarUsingJavaScriptExecutor {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.amazon.in");
//
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//
//		for (int i = 0; i < 5; i++) {
//			//scroll down ---> +ve y coordinate 
//			js.executeScript("window.scrollBy(0,800)");// string
//			Thread.sleep(1000);
//		}
//
//		Thread.sleep(2000);
//		for (int i = 0; i < 3; i++) {
//
//			
//			//scroll up ---> -ve y coordinate 
//			js.executeScript("window.scrollBy(0,-800)");// string
//			Thread.sleep(1000);
//		}

		driver.get("https://demo.automationtesting.in/Windows.html");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(100,0)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(-100,0)");
		Thread.sleep(1000);

//		for (int i = 0; i < 5; i++) {
//
//			js.executeScript("window.scrollby(100,0)");
//			Thread.sleep(2000);
//		}
//
//		for (int i = 0; i < 5; i++) {
//
//			js.executeScript("window.scrollby(-100,0)");
//			Thread.sleep(1000);
//		}
	}

}
