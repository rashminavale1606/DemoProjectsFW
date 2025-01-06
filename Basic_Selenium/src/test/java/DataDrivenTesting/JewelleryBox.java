package DataDrivenTesting;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JewelleryBox {

	@Test
	public  void JewelleryBox() throws Throwable {
		
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Navigate to Amazon/FLipkart app ,search for jewellery box,print th first box color
		// build connection to properties file
		
		FileInputStream fis = new FileInputStream("./src/test/resources/JewelleryBox1.properties");
		
		Properties pro = new Properties();
		
		pro.setProperty("url", "https://wwwamazon.in/");
		pro.setProperty("search", "Jewellery Box");
		
		FileOutputStream fos = new FileOutputStream("./src/test/resources/JewelleryBox1.properties");
		
		pro.store(fos, "ShoppingCategory");
		
		pro.load(fis);
		
		String URL = pro.getProperty("url");
		String search = pro.getProperty("search");
		
		driver.get(URL);
		
		driver.findElement(By.cssSelector("[id=\"twotabsearchtextbox\"]")).sendKeys(search);
		
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		
		driver.findElement(By.xpath("(//u[contains(text(),\"patterns\")])[1]")).click();
		
		Robot rob = new Robot();
		
		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
//		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
//		rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		
		WebElement color = driver.findElement(By.xpath("//label[contains(text(),\"Colour\")]/following-sibling::span"));
		
		System.out.println("Color of Jewellery Box is: "+color.getText());

	}

}
