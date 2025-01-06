package z.SelfPractice.PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B__AlertPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

	/*	driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
		Alert alt = driver.switchTo().alert();
		alt.accept();*/ //--->To click ok button
		
	/*	driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]")).click();
		Alert alt = driver.switchTo().alert();
		//alt.accept();//--->To click ok button
		//alt.dismiss();//--->To click cancel button
		String txt = alt.getText();
		System.out.println(txt);*/ //--->fetches the alert message
		
	driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("welcome");//--->Insert value to Alert popup
		alt.accept();
	}

}
