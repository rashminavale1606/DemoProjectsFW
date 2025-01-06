package z.SelfPractice.PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D__FileUploadPopUp {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement file = driver.findElement(By.xpath("//input[@id=\"file-upload\"]"));

		file.sendKeys("D:\\QSpider\\SQL\\JOINS.txt");
		driver.findElement(By.xpath("//input[@value=\"Upload\"]")).click();

	}
}
