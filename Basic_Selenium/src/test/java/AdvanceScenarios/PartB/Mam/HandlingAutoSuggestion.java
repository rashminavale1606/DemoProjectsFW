package AdvanceScenarios.PartB.Mam;

public class HandlingAutoSuggestion {

	

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	

		public static void main(String[] args) throws Throwable {
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.flipkart.com");
	 driver.findElement(http://By.name("q")).sendKeys("puma");
	 
	 Thread.sleep(2000);
	 List<WebElement> allSugg = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//li"));
		Thread.sleep(1000);
		for (WebElement sugg : allSugg) 
		{
			System.out.println(sugg.getText());
			if(sugg.getText().contains("puma slippers men"))
			{
				http://sugg.click();
				break;
			}
		}
		}
		}

