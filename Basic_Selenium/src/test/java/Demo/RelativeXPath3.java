package Demo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RelativeXPath3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
//		driver.manage().window().fullscreen();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[contains(@title,\"Search\")]")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

//		String phName = driver.findElement(By.xpath("//div[text()=\"Apple iPhone 15 (Black, 128 GB)\"]")).getText();
//		System.out.println(phName);
		
		// //div[@class="KzDlHZ"] ----> 1 of 24
		
		int count = 0;
		 List<WebElement> names = driver.findElements(By.xpath("//div[@class=\"KzDlHZ\"]"));
		 List<WebElement> prices = driver.findElements(By.xpath("//div[@class=\"Nx9bqj _4b5DiR\"]"));
		 
//		 for (WebElement phName : Names) {
//			 
//			 	System.out.println(phName.getText());
//			 	count++;
//			
//		}
		 
		 for (int i = 0; i < names.size(); i++) {
			 
			System.out.println(names.get(i).getText()+"--------------------->"+prices.get(i).getText());
			count++;
		}
		
//		 for (int i = 0; i < listOfCollections.size(); i++) {
//			    List<String> collection = listOfCollections.get(i);
//			    for (int j = 0; j < collection.size(); j++) {
//			        String element = collection.get(j);
//			        System.out.println(element);
//			    }
//			}

		 
		 
		 System.out.println("Total no. of ph are: "+count);
		 
		 //price ---> //div[@class="Nx9bqj _4b5DiR"]
		 
		
		 
//		 for (WebElement amount : prices) {
//			 
//			 System.out.println(amount.getText());
//			
//		}

	}

}
