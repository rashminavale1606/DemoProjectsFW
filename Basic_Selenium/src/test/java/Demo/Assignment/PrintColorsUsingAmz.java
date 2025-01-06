package Demo.Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintColorsUsingAmz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		driver.findElement(By.xpath("//u[contains(text(),\"+4 colors/patterns\")]")).click();
		
		List<WebElement> colorsOfIphone = driver.findElements(By.xpath("//li[@data-csa-c-type=\"item\"]"));
		
		int count = 0;
		for (WebElement color : colorsOfIphone) {
			
			System.out.println(color.getText());
			count++;
			
		}
		System.out.println("Total: "+count);
	}

}
