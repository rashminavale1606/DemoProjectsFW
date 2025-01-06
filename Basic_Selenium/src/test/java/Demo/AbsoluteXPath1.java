package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AbsoluteXPath1 {

	
	@Test
	public static void AbsoluteXPath1() {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/v1/");
		
		driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/form/input[1]")).sendKeys("standard_user");
		driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/form/input[2]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("html/body/div[2]/div[1]/div/div/form/input[3]")).click();
	}

}