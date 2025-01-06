package Demo.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintConsole1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.cssSelector("input[title=\"Search for Products, Brands and More\"]")).sendKeys("reebok");
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		String result = driver.findElement(By.cssSelector("href=\"/footwear/pr?sid=osp&q=reebok&otracker=categorytree\"")).getText();
		System.out.println(result);
		
	}

}
