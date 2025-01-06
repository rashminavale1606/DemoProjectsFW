package z.SelfPractice.Adv_Scenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E3__AutoSuggestionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bigbasket.com");
		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("apples");
		
		List<WebElement> allSugg = driver.findElements(By.xpath("//ul[@class=\"overscroll-contain\"]"));
		
		for (WebElement sugg : allSugg) {
			
			System.out.println(sugg.getText());
			if(sugg.getText().contains("Apple - Shimla")) {
				
				sugg.click();
				break;
			}
		}
		
		
	}

}
