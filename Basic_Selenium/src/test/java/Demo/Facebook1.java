package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
	
		
		Thread.sleep(2000);
		WebElement radio = driver.findElement(By.xpath("//input[@value=\"1\"]"));
		
		radio.click();
		
		if(radio.isSelected())
		{
			System.out.println("radio btn is selected");
		}
		else {
			System.out.println("radio is not selected ");
		}
	}

}
