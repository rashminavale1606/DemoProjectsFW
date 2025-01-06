package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//case 3: selenium: 4.23.0 webdriver: 5.9.1
		
				WebDriver driver = new FirefoxDriver();
				
				//Method1:get()-----> Launching and application
				
				driver.get("https://www.amazon.in/");
				
				//Method 2: getTitle()  ------> feteches title of web page 
				
//				String title = driver.getTitle();
//				System.out.println(title);
				
				//or
				
				System.out.println(driver.getTitle());
				
				//method3: getCurrentUrl() ----> fetches the current url of web page
				 String Url = driver.getCurrentUrl();
				 System.out.println(Url);
				 
				 //Method 4:  getPageSource() -----> written the source code of web page in the console
				 
//				String source=driver.getPageSource();
//				
//				System.out.println(source);
				 //commenting getPageSource() because sometimes other methods will not execute or give output 
				 
				 
				 //METHOD 5:manage();
				 
//				 Options opt = driver.manage();
//				 Window win = opt.window();
//				win.minimize();
				//OR
				 
				 driver.manage().window().maximize();
				 driver.manage().window().fullscreen();
	}

}
