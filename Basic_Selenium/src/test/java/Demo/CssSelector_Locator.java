package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		//SYNTAX 1: [ATTnAME='ATTVALUE'] ---> REMEMBER [] AND '' SINGLE QUOTE FPR ATT VALUE
		
//		driver.findElement(By.cssSelector("[type='text']")).sendKeys("Samsung");
//		driver.findElement(By.cssSelector("[value='Go']")).click();
		
		
		// SYNATX 2: HTMLTAG[ATTNAME="ATTVALUE"] 
		
//		driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("standard_user");
//		driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("secret_sauce");
//		
//		driver.findElement(By.cssSelector("input[value=\"LOGIN\"]")).click();
		
		//SYNTAX 3: APPLICABLE TO ONLY ID ATTRIBUTE
		// #ATTRIBUTEVALUE
		
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		
		//SYNTAX4: 
		//HTMLTAG#ID
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		
		
		//SYNTAX 5: APPLICABLE ONLY TO CLASS
		//.CLASSNAME
		
//		driver.findElement(By.cssSelector(".btn_action")).click();
		//SYNTAX 6: 
		//HTMLTAG.CLASSNAME
		driver.findElement(By.cssSelector("input.btn_action")).click();
		
		
	}

}
