package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateMethods {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();

		Thread.sleep(1000); // THROWABLE EXCEPTION

		/*
		 * alternative approch to launch the web application NOT RECOMMENDED IT WILL NOT
		 * WAIT TO LOAD ALL THE ELEMENTS IN GUI CHANCES OF FAILING TEST SCRIPTS
		 * 
		 */
		// driver.navigate().to("https://www.makemytrip.com/");

		// GET METHOD IS HIGHLY RECOMMONDED TO LAUNCH THE APPLICATION

		driver.get("https://www.instagram.com/");

		Thread.sleep(2000);// 2 SEC
		
		//METHOD 8: navigate(); 

		// back() -->
		driver.navigate().back();

		Thread.sleep(2000);
		// forword()-->
		driver.navigate().forward();

		Thread.sleep(2000);

		// refresh()
		driver.navigate().refresh();

	}

}
