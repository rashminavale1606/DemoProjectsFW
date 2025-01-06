package z.SelfPractice.PopUps;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class F__WindowPopup {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		// Two Approaches
				// * Using Windows Ids----->Can handle 2 wins
				// * Using Window Title---->can handle multiple wins

				WebDriver driver = new ChromeDriver();
				driver.get("https://www.flipkart.com");
				driver.manage().window().maximize();

				Thread.sleep(1000);
				
				driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);
				
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//img[@alt=\"Apple iPhone 15 (Black, 128 GB)\"]")).click();
				
				Thread.sleep(1000);
				
				String mainId = driver.getWindowHandle();//win1
				
				
		        System.out.println(mainId);
		        
		        Thread.sleep(1000);
		        
		        Set<String> allIds = driver.getWindowHandles();//win1,win2
		        
		        System.out.println(allIds);
		        
		        Thread.sleep(1000);
		        
		        for (String id : allIds)
		        {
					if(!mainId.equals(id))//win1!=Win2
					{
						driver.switchTo().window(id);
						String phn = driver.findElement(By.xpath("//span[text()='Apple iPhone 15 (Black, 128 GB)']")).getText();
						System.out.println(phn);
						
					}
				}
	}

}
