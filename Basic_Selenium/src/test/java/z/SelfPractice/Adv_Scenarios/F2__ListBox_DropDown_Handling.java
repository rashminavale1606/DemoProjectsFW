package z.SelfPractice.Adv_Scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2__ListBox_DropDown_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();

		WebElement day = driver.findElement(By.xpath("//option[@value=\"11\"]"));
		
		day.click();
	}

}
