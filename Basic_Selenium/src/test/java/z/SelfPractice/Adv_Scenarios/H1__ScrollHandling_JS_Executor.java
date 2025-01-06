package z.SelfPractice.Adv_Scenarios;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class H1__ScrollHandling_JS_Executor {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		// H1__ScrollHandling_JS_Executor:  Y-Axis

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		for (int i = 0; i < 5; i++) {

			js.executeScript("window.scrollBy(0,800)");
			Thread.sleep(1000);
		}
		for (int i = 0; i < 3; i++) {

			js.executeScript("window.scrollBy(0,-800)");
			Thread.sleep(1000);
		}
	}

}
