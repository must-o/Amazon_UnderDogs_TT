package bdd.amazon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPageElements {

	@FindBy(id = "ap_customer_name")
	public WebElement name;

	@FindBy(id = "ap_email")
	public WebElement email;

	@FindBy(id = "ap_password")
	public WebElement password;

	@FindBy(id = "ap_password_check")
	public WebElement password2;

	@FindBy(id = "continue")
	public WebElement continueButton;

	@FindBy(id = "")
	public WebElement captchaMessage;

	@FindBy(id = "auth-customerName-missing-alert")
	public WebElement nameErrorMsg;

	@FindBy(id = "auth-email-invalid-claim-alert")
	public WebElement emailInvalidMsg;

	@FindBy(id = "auth-password-invalid-password-alert")
	public WebElement passwordInvalidMsg;

	@FindBy(id = "auth-password-mismatch-alert")
	public WebElement password2MismatchMsg;

}
