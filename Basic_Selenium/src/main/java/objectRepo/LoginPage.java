package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//initialization
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		PageFactory.initElements(driver, this);
		
	}
	
	//declaration 
	
	@FindBy(id = "user-name")
	private WebElement usernameTextField;
	
	@FindBy(xpath = "//input[@type=\"password\"]")
	private WebElement passwordTextField;

//	@FindBys({@FindBy(css = "[type=\"submit\"]"), @FindBy(id = "login-button")})  // curly braces 
//	private WebElement loginBtton;
//	
	
	@FindAll({@FindBy(css = "[type=\"submit\"]"), @FindBy(id = "login-button")})
	private WebElement loginBtton;
	//getters

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginBtton() {
		return loginBtton;
	}
	
	
	//business logic 
	
	public void loginToApplication(String userName, String passWord) {
		
		usernameTextField.sendKeys(userName);
		passwordTextField.sendKeys(passWord);
		loginBtton.click();
	}
	
}
