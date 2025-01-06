package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		WebElement searchIDElement = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		
		System.out.println(searchIDElement.getAccessibleName());
		System.out.println(searchIDElement.getAccessibleName());
		System.out.println(searchIDElement.getAriaRole());
		
		
		
	//	WebElement search = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		
//		System.out.println(search.getDomProperty("formAction"));
//		System.out.println(search.getTagName()); // input
//		System.out.println(search.getDomProperty("name"));
		
		
		
		
//		WebDriver driver = new FirefoxDriver();
//
//		driver.get("https://www.amazon.in");
//		
//		/*
//		 * Method: getAttribute()
//		 * Method:  getDomAttribute()
//		 * Method: getProperty()
//		 * 
//		 * */
//		
//		
//		WebElement logoelElement = driver.findElement(By.xpath("//a[@aria-label=\"Amazon.in\"]"));
//		
//		System.out.println(logoelElement.getAttribute("class"));
//		
//		System.out.println(logoelElement.getDomAttribute("id"));
		
		
//		//method: 9  isenabaled()
//		WebElement searchElement=driver.findElement(By.id("twotabsearchtextbox"));
//		if(searchElement.isEnabled()) {
//			searchElement.sendKeys("arts");
//		}
//		else {
//			System.out.println("it is not enabled");
	//	}
//		
		
//		// method8: isDisplayed()
//		WebElement linkElement = driver.findElement(By.linkText("Fashion"));
//		if(linkElement.isDisplayed()) {
//			System.out.println("linktext is diplayed");
//		
//	
//		}
//		
//		else {
//			System.out.println("it is not displayed");
//		}
		
//	

		
//		//method 5: getlocation()ki.getx() and gety()"
//		WebElement phonElement = driver.findElement(By.xpath("//a[text()=\"Mobiles\"]"));
//		System.out.println("get location: X:"+phonElement.getLocation().getX()+"=====>  Y :"+phonElement.getLocation().getY());
//		 method 6: getSize()
//		WebElement searchElement=driver.findElement(By.id("twotabsearchtextbox"));
//		System.out.println(searchElement.getSize().getHeight()+"height and width of search bar "+searchElement.getSize().getWidth());
//		
//		
//		
//		//METHOD 7: getRect()
//		System.out.println("X: "+phonElement.getRect().getX());
//		System.out.println("Y: "+phonElement.getRect().getY());
//		System.out.println("height of ph element: "+phonElement.getRect().getHeight());
//		System.out.println("width: "+phonElement.getRect().getWidth());
		
		
		
//		// METHOD 4  : getCssValue()
//		WebElement ele=driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
//		
//		System.out.println(ele.getCssValue("color"));
//		System.out.println(ele.getCssValue("font-size"));
//		
		
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.saucedemo.com/v1/");
//		
//		WebElement username = driver.findElement(By.id("user-name"));
//		username.sendKeys("standard_user");
//		Thread.sleep(2000);
//		username.clear();
//		
//		WebElement password = driver.findElement(By.name("password"));
//		password.sendKeys("secret_sauce");
//		
//		driver.findElement(By.xpath("//input[@value=\"LOGIN\"]")).click();
		
		

	}

}
