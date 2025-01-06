package z.SelfPractice.PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class C__FramePopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
  //3 Approach
		//1)Switching frame using Index---->index value starts from 0
		//2)Switching frame using id() nd name() value
		//3)Switching frame using WebELements
		driver.get("https://jqueryui.com/droppable/");

		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
	    Actions act = new Actions(driver);
	    act.dragAndDrop(drag, drop).perform();
	}

}
