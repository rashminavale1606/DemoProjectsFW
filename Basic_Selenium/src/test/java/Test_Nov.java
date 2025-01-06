import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_Nov {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		Thread.sleep(3000);
		//handle nested frames from qsp
//		

//
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		Thread.sleep(1000); 
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Admin@1234");
		Thread.sleep(1000);
		driver.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	}

}
