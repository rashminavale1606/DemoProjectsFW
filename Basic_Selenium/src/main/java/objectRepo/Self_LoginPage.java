package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Self_LoginPage {
	
	public  Self_LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "user-name")
	private WebElement username;
	
	@FindBy(name = "password")
	private WebElement passwordElement;
	
	
	@FindAll({@FindBy(css = "[type=\"submit\"]"), @FindBy(className = "btn_action") })
	private WebElement loginElement;


	public WebElement getUsername() {
		return username;
	}


	public WebElement getPasswordElement() {
		return passwordElement;
	}


	public WebElement getLoginElement() {
		return loginElement;
	}

	
	// businesslogic
	
	public void loginPageInfo(String un, String pw) {
		
		username.sendKeys("standard_user");
		passwordElement.sendKeys("secret_sauce");
		loginElement.click();
	}

	
	

}
