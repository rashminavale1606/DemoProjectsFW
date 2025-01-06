package z.SelfPractice.PopUps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C1__FramePopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Frames.html");
//Approach1:---->Switching Frames using index
//		driver.switchTo().frame(1);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Qspiders");
		
//Approach2:----->Switching Frames using id Attribute
//		driver.switchTo().frame("singleframe");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");

		//Switching Frames using name Attribute
//	    driver.switchTo().frame("SingleFrame");
//	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi");

//Approach3:----->	Switching Frames using webElement
		WebElement frame = driver.findElement(By.cssSelector("[id=\"singleframe\"]"));
	    driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Shobha");
	}

}
