package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXPath2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chat.qspiders.com/student-dashboard");
		
		driver.findElement(By.xpath("html/body/div/section[2]/article/aside[2]/div/section/article/aside[1]/div[3]/div/span/input")).sendKeys("Shobha");
	}

}
