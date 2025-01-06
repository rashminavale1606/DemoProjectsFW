package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OlyampicsTable {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://olympics.com/en/paris-2024/medals");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),\"Yes\")]")).click();
		
		//driver.manage().window().fullscreen();
		
		
		
		
		//    (//span[@class="elhe7kv5 emotion-srm-uu3d5n"])[1] =====> usa
		
		//     (//span[@class="elhe7kv5 emotion-srm-uu3d5n"])[1]/../following-sibling::span[1] ---> gold
		 String cpuse = driver.findElement(By.xpath("(//div[@data-testid=\"noc-row\"]//span[@class=\"elhe7kv5 emotion-srm-uu3d5n\"])[1]")).getText();
		
		String gold=driver.findElement(By.xpath("//span[text()=\"United States of America\"]/../following-sibling::span[1]")).getText();
		String silverString=driver.findElement(By.xpath("//span[text()=\"United States of America\"]/../following-sibling::span[2]")).getText();
		String bronzeString=driver.findElement(By.xpath("//span[text()=\"United States of America\"]/../following-sibling::span[3]")).getText();
		String totalString=driver.findElement(By.xpath("//span[text()=\"United States of America\"]/../following-sibling::span[4]")).getText();
		
		
		System.out.println("\n country: "+cpuse+"\n gold: "+gold+"\n silver: "+silverString+"\n bronze: "+bronzeString+"\n total: "+totalString);
		
		System.out.println("********************************************************************");
		
		
		

		
		
		  
	
		
		
		
		

	}

}
