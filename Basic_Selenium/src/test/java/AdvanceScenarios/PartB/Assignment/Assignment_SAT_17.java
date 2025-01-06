package AdvanceScenarios.PartB.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_SAT_17 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//create account btn
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		
		//firstname TF
		driver.findElement(By.name("firstname")).sendKeys("Kartik");
		
		
		//lastnameTF
		driver.findElement(By.name("lastname")).sendKeys("Aryan");
		
		
		//mob_or_email TF
		WebElement mob_or_email = driver.findElement(By.xpath("//input[@aria-label=\"Mobile number or email address\"]"));
		
		mob_or_email.sendKeys("8668729144");
		
		
		//password TF
		WebElement password = driver.findElement(By.id("password_step_input"));
		password.sendKeys("Kartik@16");
		
		
		//birthday_day dropdown
		WebElement birthday_day = driver.findElement(By.name("birthday_day"));
		
		Select selectDOB = new Select(birthday_day);
		
		selectDOB.selectByValue("20");
		
		
		//birthday_month dropdown
		WebElement month = driver.findElement(By.cssSelector("#month"));
		
		Select selectMonth = new Select(month);
		
		selectMonth.selectByVisibleText("Jun");
		
		
		//birthday_year dropdown
		
		WebElement year = driver.findElement(By.cssSelector("[title=\"Year\"]"));
		
		Select selectYear = new Select(year);
		
		selectYear.selectByValue("1985");
		
		
		//gender radio btn
		WebElement gender = driver.findElement(By.xpath("//input[@name=\"sex\"]/preceding-sibling::label[text()='Male']"));
		
		gender.click();
		
		
		//sign up 
		driver.findElement(By.cssSelector("[name=\"websubmit\"]")).click();
		
		
		//confirmation btn
//		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		
		//puzzle
	}

}
