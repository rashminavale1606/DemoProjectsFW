package z.SelfPractice.Adv_Scenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E1__AutoSuggestionHandling {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bluetooth");
		
		List<WebElement> listOfSugg = driver.findElements(By.cssSelector("[class=\"two-pane-results-container\"]"));
		
		for (WebElement sugg : listOfSugg) {
			
			System.out.println(sugg.getText());
			
//			if(sugg.getText().contains("bluetooth earbuds")) {
//				sugg.click();
//				break;
//			}
		}
	}

}
