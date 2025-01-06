package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ColorIphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 14");
		driver.findElement(By.xpath("//input[@value=\"Go\"]")).click();

		List<WebElement> colors = driver.findElements(By.xpath(
				"//div[@class=\"a-section\"]//span[text()='Apple iPhone 14 (128 GB) - Blue']/../../../following-sibling::div[2]//a[@role=\"button\"]"));

		for (int i = 0; i < colors.size(); i++) {

			WebElement colorElement = colors.get(i);
//	
			System.out.println(colorElement.getText() + "->");

		}

	

	}

}
