package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v125.page.model.Screenshot;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Youtube {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\Downloads\\yt.properties");
		
		Properties pro = new Properties();
		
		pro.load(fis);

		String URL = pro.getProperty("url");
		String SEARCH = pro.getProperty("search");
		
		driver.get(URL);
		
		driver.findElement(By.cssSelector("[name=\"search_query\"]")).sendKeys(SEARCH);
		WebElement clickbtn = driver.findElement(By.xpath("//*[name()='svg']/ancestor::button[@id=\"search-icon-legacy\"]"));
		
		clickbtn.click();
		Thread.sleep(1000);
		
		WebElement play = driver.findElement(By.xpath("(//a[contains(@aria-label,\"Ali Gatie\")])[1]"));
		
		play.click();
		
		//click.sendKeys(Keys.ENTER);
		
		//driver.findElement(By.cssSelector("[id=\"skip-button:3\"]")).click();
		
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//button[@id=\"skip-button:3\"]")).click();
		
	
	}

}
