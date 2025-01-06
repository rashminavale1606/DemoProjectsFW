package Demo.Assignment;

import javax.naming.spi.DirStateFactory.Result;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		//driver.manage().window().fullscreen();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.cssSelector("[type=\"text\"]")).sendKeys("reebok");
		driver.findElement(By.cssSelector("button[title=\"Search for Products, Brands and More\"]")).click();
	 String result = driver.findElement(By.linkText("Men's Sports Shoes")).getText();
	 System.out.println(result);
	}

}
