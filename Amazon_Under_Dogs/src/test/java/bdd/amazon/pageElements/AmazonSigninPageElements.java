package bdd.amazon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonSigninPageElements {

	@FindBy(id= "ap_email")
	public WebElement email;

	@FindBy(id = "continue")
	public WebElement continueButton;

	@FindBy(id = "ap_password")
	public WebElement password;

	@FindBy(id = "signInSubmit")
	public WebElement SignInButton;

	@FindBy(xpath="//*[@id=\"auth-error-message-box\"]/div/h4")
	public WebElement pwErrorMsg;

	@FindBy(xpath="//*[@id=\"auth-error-message-box\"]")
	public WebElement emailErrorMsg;	
	
	@FindBy(xpath="//*[contains(text(),'Enter your email or mobile phone number')]")	
	public WebElement enterEmailErrorMsg;
	}