package z.SelfPractice.Frameworks.TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F_TakeScreenShot {

	public static void main(String[] args) throws Throwable {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.in");
	    driver.manage().window().maximize();	
	    
	    TakesScreenshot ts = (TakesScreenshot)driver;
	    
	   File src = ts.getScreenshotAs(OutputType.FILE);
	   File dest = new File("./SelfScreenshot.png");
	   
	   FileUtils.copyFile(src, dest);
	}
	
	
}
