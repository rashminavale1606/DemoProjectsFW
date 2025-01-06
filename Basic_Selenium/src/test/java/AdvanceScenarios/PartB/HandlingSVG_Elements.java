package AdvanceScenarios.PartB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSVG_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.kayak.co.in/");
		//=================      https://www.clinique.in/
		driver.findElement(By.xpath("//*[name()='svg' and @class=\"A_8a-icon\"]")).click();
	}

}
