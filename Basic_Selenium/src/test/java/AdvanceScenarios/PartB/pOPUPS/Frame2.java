package AdvanceScenarios.PartB.pOPUPS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/frames");

		driver.findElement(By.linkText("Nested Frames")).click();

		/*
		 * 
		 * 
		 * 
		 * //switching to parent frame //approach:3 WebElement topFrame =
		 * driver.findElement(By.xpath("//frame[@name=\"frame-top\"]"));
		 * driver.switchTo().frame(topFrame);
		 * 
		 * //from parent to child frame //approach:2
		 * driver.switchTo().frame("frame-left"); String leftFrame =
		 * driver.findElement(By.xpath("//body[contains(text(),' LEFT')]")).getText();
		 * System.out.println(leftFrame)
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

	//	System.out.println("switching from driver to top frame");
		//WebElement top = driver.findElement(By.name("frame-top"));
		driver.switchTo().frame("frame-top");

	//WebElement for Frame2 left
		driver.switchTo().frame("frame-left");
		String left = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText();
		

	
		//System.out.println("switched from top to left frame");
		System.out.println(left);
		
		
		driver.switchTo().parentFrame();

		// ***************
		driver.switchTo().frame("frame-right");
		String right = driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]")).getText();
		// String string = right.getText();

		//System.out.println("switched from left to right frame");
		System.out.println(right);
		
		//travel from right to bottom 
		
//		driver.switchTo().parentFrame();// right to top 
//		driver.switchTo().parentFrame();// top to main frame
		
		driver.switchTo().defaultContent();// right to main frame
		
		driver.switchTo().frame("frame-bottom");
		
		WebElement bottom = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]"));
		String bottomText = bottom.getText();
		System.out.println(bottomText);

	}

}
