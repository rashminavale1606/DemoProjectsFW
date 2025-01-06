package z.SelfPractice.Adv_Scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class F1__ListBox_DropDown_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// F1__ListBox_DropDown_Handling
		// using select method
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com");

		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();

		WebElement day = driver.findElement(By.cssSelector("[title=\"Day\"]"));

		Select select = new Select(day);

		select.selectByIndex(2);

		WebElement month = driver.findElement(By.name("birthday_month"));

		Select selectMonth = new Select(month);
		
		selectMonth.selectByVisibleText("Jun");

		
		WebElement yearElement=driver.findElement(By.id("year"));
		
		Select selectYear = new Select(yearElement);
		
		selectYear.selectByValue("1999");
	}

}
