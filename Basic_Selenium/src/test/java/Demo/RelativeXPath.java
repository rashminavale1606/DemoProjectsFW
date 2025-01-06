package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.xpath("//input[@data-test=\"username\"]")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@class=\"btn_action\"]")).click();
		
		

	}

}
