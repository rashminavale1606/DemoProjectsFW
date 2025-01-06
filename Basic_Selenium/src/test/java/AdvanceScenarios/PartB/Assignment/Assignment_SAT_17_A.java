package AdvanceScenarios.PartB.Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_SAT_17_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		//V4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		WebElement email_or_contactNo = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		
		email_or_contactNo.sendKeys("8668729144");
		
		WebElement otp = driver.findElement(By.xpath("//button[text()='Request OTP']"));
		otp.click();
		
		
//		DISABLED
//		boolean flag = otp.isEnabled();
//		
//		if(otp.isEnabled()) {
//			
//			((JavascriptExecutor)driver).executeScript("arguments[0].disabled=true",otp);
//		}
//		
//		System.out.println(otp.isEnabled());
		
		
//		List<WebElement> otpNo = driver.findElements(By.xpath("//input[@class=\"r4vIwl IX3CMV\"]"));
//		for (int i = 0; i < otpNo.size(); i++) {
//			if(otp.isEnabled()) {
//				
//				((JavascriptExecutor)driver).executeScript("arguments[0].disabled=true",otpNo);
//				
//				//     https://www.flipkart.com/account/?rd=0&link=home_account
//				//driver.get("https://www.flipkart.com/account/?rd=0&link=home_account");
//			}
//			
//		}
		
		WebElement otpTF = driver.findElement(By.xpath("//div[@class=\"XDRRi5\"]"));
		
		//otpTF.sendKeys("123456", Keys.33dw3)
		
		WebElement verify = driver.findElement(By.xpath("//div[@class=\"Sm1-5F col col-3-5\"]"));
		
		if(otp.isEnabled()) {
			
			((JavascriptExecutor)driver).executeScript("arguments[0].disabled=true",verify);
			
			//     https://www.flipkart.com/account/?rd=0&link=home_account
			
		}
		
		driver.get("https://www.flipkart.com/account/?rd=0&link=home_account");
		
	}

}
