package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RelativeXPath2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,\"Search\")]")).sendKeys("bluetooth");
		driver.findElement(By.xpath("//input[contains(@id,\"submit-button\")]")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		////a[text()="Today's Deals"]
		driver.findElement(By.xpath("//a[contains(text(),\"Deals\")]")).click();

	}

}
