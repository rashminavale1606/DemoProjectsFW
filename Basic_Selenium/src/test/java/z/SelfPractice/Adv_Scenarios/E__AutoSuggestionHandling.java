package z.SelfPractice.Adv_Scenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E__AutoSuggestionHandling {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("[name=\"q\"]")).sendKeys("iphone");
		Thread.sleep(1000);
		List<WebElement> listsOfSugg = driver.findElements(By.xpath("//ul[@class=\"_1sFryS _2x2Mmc _3ofZy1\"]//li"));
		
		// print all options 
		//select 3rd option
		Thread.sleep(1000);
		int count=0;
		for (WebElement list : listsOfSugg) {
			
			System.out.println(list.getText());
			System.out.println("***************");
			count++;
			
			if(list.getText().contains("iphone 14")) {
				list.click();
				break;
			}
		}
	}

}
