package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathMultipleValuesUsingAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		// SYNTAX1-  //HTMLTAG[@ATTNAME = 'ATTRIBUTEVALUE' AND @ATTNAME='ATTVALUE']
		
//		driver.findElement(By.xpath("//input[@type=\"text\" and @id=\"twotabsearchtextbox\" ]")).sendKeys("puma");
//		
//		driver.navigate().back();
		
		//SYNTAX2== //HTMLTAG[@ATTNAME='ATTVALUE' OR @ATTNAME='ATTVALUE']
//		driver.findElement(By.xpath("//input[@type=\"text\" or @aria-label=\"Search\" ]")).sendKeys("mobile");
		
		
		//SYNTAX3: //HTMLTAG[@ATTNAME='ATTVALUE' and TEXT()='VISIBLETEXT']
	//	driver.findElement(By.xpath("//a[@class=\"nav-a  \" and text()='Sell']")).click();
		
		
		///SYNTAX4: //HTMLTAG[TEXT()='VISIBLETEXT' or @ATTNAME='ATTVALUE'  ]
//		driver.findElement(By.xpath("//a[ text()=\"Mobiles\"or @class=\"nav  \"]")).click();
		//driver.findElement(By.xpath("//a[ text()=\"Mobiles\" and @class=\"nav  \"]")).click();-----> not correct syntax
		
		
		//synatx5: //htmltag[contains(@attn,'attv')] and/or contains(text(),'attv')
		//driver.findElement(By.xpath("//a[contains(@data-csa-c-type,\"link\") and contains(text(),\" Electro\")]")).click();
		
		
		//syntacx6: //htmltag[contains(@att]
		
		driver.findElement(By.xpath("//a[contains(@class,\"nav-a  \") and  contains(@data-csa-c-content-id,\"_gb\")]")).click();
		
	}

}
