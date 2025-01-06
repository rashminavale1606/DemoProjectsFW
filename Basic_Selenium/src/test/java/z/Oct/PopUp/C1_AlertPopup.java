package z.Oct.PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1_AlertPopup {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//
//		WebElement JSAlert = driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]"));
//		JSAlert.click();
//		Thread.sleep(1000);
//		driver.switchTo().alert().accept();
//		String res = driver.findElement(By.cssSelector("p#result")).getText();
//		System.out.println(res);
		
//		WebElement JSAlert = driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]"));
		WebElement JSAlert = driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]"));
	JSAlert.click();
		Thread.sleep(1000);
		Alert msg = driver.switchTo().alert();
		msg.sendKeys("Happy Navratri");
		msg.dismiss();
		
		String res = driver.findElement(By.cssSelector("p#result")).getText();
		System.out.println(res);
		
		
		
		
	}

}
