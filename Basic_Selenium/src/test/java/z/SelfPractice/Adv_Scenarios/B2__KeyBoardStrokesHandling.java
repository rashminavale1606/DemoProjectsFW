package z.SelfPractice.Adv_Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B2__KeyBoardStrokesHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// open amzon search boat headphones and perform action enter using KeayboardStrokes
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		driver.findElement(By.cssSelector("[name=\"field-keywords\"]")).sendKeys("Boat Headphones",Keys.ENTER);
	}

}
