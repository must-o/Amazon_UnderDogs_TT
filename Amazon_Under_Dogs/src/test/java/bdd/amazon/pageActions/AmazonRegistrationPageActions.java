package bdd.amazon.pageActions;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import bdd.amazon.pageElements.RegistrationPageElements;
import bdd.amazon.utilities.GetWebDriver;
import bdd.amazon.utilities.Helper;

public class AmazonRegistrationPageActions {

	RegistrationPageElements elements;

	public AmazonRegistrationPageActions() {
		this.elements = new RegistrationPageElements();
		PageFactory.initElements(GetWebDriver.webdriver, this.elements);
	}
	

	public void navigateToAmazonRegistrationPage() {
		GetWebDriver.webdriver.get("https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F_encoding%3DUTF8%26ascsubtag%3Dsrctok-94e6f09ad8a7b777%26btn_ref%3Dsrctok-94e6f09ad8a7b777%26tag%3D2021_tag3-20%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		GetWebDriver.webdriver.manage().window().maximize();
		GetWebDriver.webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public void validateAmazonCreateAccountPage() {
		Assert.assertEquals(Helper.getPageTitle(), "Amazon Registration");
		System.out.println(Helper.getPageTitle());
	}
	
	public void validateAmazonCaptchaPage() {
		Assert.assertEquals(Helper.getPageTitle(), "Authentication required");
		System.out.println(Helper.getPageTitle());
	}

	public void inputName(String name) {
		this.elements.nameInput.sendKeys(name);
	}

	public void inputEmail(String email) {
		this.elements.emailInput.sendKeys(email);
	}

	public void inputPassword(String password) {
		this.elements.passwordInput.sendKeys(password);
	}
	
	public void inputPassword2(String password2) {
		this.elements.password2Input.sendKeys(password2);
	}
	
	public void clickContinueButton() {
		this.elements.continueButton.click();
	}
	
	public String getNameErrorMsg() {
		String errorMsg = this.elements.nameErrorMsg.getText();
		return errorMsg;
	}

	public String getEmailInvalidMsg() {
		String errorMsg = this.elements.emailInvalidMsg.getText();
		return errorMsg;
	}
	
	public String getPasswordInvalidMsg() {
		String errorMsg = this.elements.passwordInvalidMsg.getText();
		return errorMsg;
	}
	
	public String getPassword2MismatchMsg() {
		String errorMsg = this.elements.password2MismatchMsg.getText();
		return errorMsg;
	}
	
	
	
	
	
	
}
