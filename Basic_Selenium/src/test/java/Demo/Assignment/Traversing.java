package Demo.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Traversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[contains(@title,\"Search\")]")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

//		String name = driver.findElement(By.xpath("//a[contains(@title,\"Smashic \")]")).getText();
//		String price  = driver.findElement(By.xpath("//div[text()=\"₹2,609\"]")).getText();
		
//		System.out.println("  "+price);
		/*
		 *   //a[contains(@title,"Smashic ")]
		 */
		
		String phPrice = driver.findElement(By.xpath("//div[@class=\"KzDlHZ\"]/../following-sibling::div//div[@class=\"Nx9bqj _4b5DiR\"]")).getText();
		
		System.out.println("phPrice is: "+phPrice);
	}

}
