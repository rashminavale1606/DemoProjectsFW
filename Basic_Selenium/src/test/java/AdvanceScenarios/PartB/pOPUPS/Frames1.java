package AdvanceScenarios.PartB.pOPUPS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// https://demo.automationtesting.in/Frames.html
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.automationtesting.in/Frames.html");
		
//		driver.switchTo().frame(1);
//		
//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("rashmi");
		
		
//		driver.switchTo().frame("singleframe");//string name or id--> id selected -->frame
//		
//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("MH");
		
		//SingleFrame
		
//		driver.switchTo().frame("SingleFrame");//string name or id--> nameselected -->frame
////		
//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("nnd");
		
		WebElement frame = driver.findElement(By.cssSelector("[id=\"singleframe\"]"));
		
		driver.switchTo().frame(frame);
		
		driver.findElement(By.cssSelector("[type=\"text\"]")).sendKeys("bk hall");
		
	}

}
