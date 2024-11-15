package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//declaration
	@FindBy(linkText="Log in")
	private WebElement  logIn;
	@FindBy(id="Email")
	private WebElement emailTextField;
	
	@FindBy(name="Password")
	private WebElement passwordTextField;
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement loginButton;
	
	//initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//getters

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getLogIn() {
		return logIn;
	}

	public void setLogIn(WebElement logIn) {
		this.logIn = logIn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
