package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmptyBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//case -1: selenium version: 3.141.59
		
//		String key = "webdriver.chrome.driver";
//		
//		String Value = "C:\\Users\\admin\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64";
//		4
		
		
		//case2
		
//		WebDriverManager.chromedriver().setup();
//		
//		WebDriver driver = new ChromeDriver();
		
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver ffdriverDriver = new FirefoxDriver();
//		
		
		//case 3: selenium: 4.23.0 webdriver: 5.9.1
		
		WebDriver driver = new FirefoxDriver();
		
		//Method1:get()-----> Launching and application
		
		driver.get("https://www.amazon.in/");
		
		//Method 2: getTitle()  ------> feteches title of web page 
		
//		String title = driver.getTitle();
//		System.out.println(title);
		
		//or
		
		System.out.println(driver.getTitle());
		
		//method3: getCurrentUrl() ----> fetches the current url of web page
		 String Url = driver.getCurrentUrl();
		 System.out.println(Url);
	}

}
