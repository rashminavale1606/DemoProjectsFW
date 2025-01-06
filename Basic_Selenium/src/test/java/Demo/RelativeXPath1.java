package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v125.audits.model.BlockedByResponseIssueDetails;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RelativeXPath1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		
		
		//SYNTAX 1: //HTMLTAG[@ATTNAME='ATTVALUE']
	
//		driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]")).sendKeys("reebok");
//		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
//		String result = driver.findElement(By.xpath("//a[@title=\"Epsilon Running Shoes For Men\"]")).getText();
//		System.out.println(result);
//
//		
		
		//     >VISIBLE TEXT ONLY<
		//SYNTAX 2 = //HTMLTAG[TEXT()='ATTVALUE']
		
//		driver.findElement(By.xpath("//span[text()=\"Login\"]")).click();
		
		//go to search bar ---> iphone---> print iphone name and prize
		driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\"]")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		String phName = driver.findElement(By.xpath("//div[text()=\"Apple iPhone 15 (Black, 128 GB)\"]")).getText();
		System.out.println(phName);
		
		
	}

}
