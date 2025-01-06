package z.SelfPractice.Adv_Scenarios;

import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A__MultipleWebElement_Handling {

	@Test
	public void  a__MultipleWebElement_Handling() throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		//PRINT ALL WEB LINKS 
		List<WebElement> allLinks =	driver.findElements(By.xpath("//a"));// (using attribute href)==>
//		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class=\"_3sdu8W emupdz\" ]//a"));
		
		// fetch all the links one by one
		Thread.sleep(1000);
		// using for loop
		System.out.println("print all visible text");
		int count=0;
		for (WebElement links : allLinks) {
			
			//print all visible text
			
			System.out.println(links.getText());
			System.out.println("Links:");
			System.out.println(links.getAttribute("href"));
			System.out.println("******************************");
			count++;
			System.out.println("##############");
			System.out.println("Tag Name:");
			System.out.println(links.getTagName());
			
			
		}
		Thread.sleep(1000);
		System.out.println("Count: "+count);
		
	}

}
