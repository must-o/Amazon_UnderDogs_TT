package bdd.amazon.pageActions;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import bdd.amazon.pageElements.AmazonSigninPageElements;
import bdd.amazon.utilities.GetWebDriver;
import bdd.amazon.utilities.Helper;

public class AmazonSigninPageActions {

	AmazonSigninPageElements elements;

	public AmazonSigninPageActions() {
		this.elements = new AmazonSigninPageElements();
		// PageFactory.initElements(driver, this.elements);
		PageFactory.initElements(GetWebDriver.webdriver, this.elements);
		// System.out.println();
	}

	public void navigateToAmazonSigninPage() {
		GetWebDriver.webdriver.get(
				"https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		GetWebDriver.webdriver.manage().window().maximize();
		GetWebDriver.webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}

	public void validateAmazonSigninPage() {
		Assert.assertEquals(Helper.getPageTitle(), "Amazon Sign-In");
		System.out.println(Helper.getPageTitle());
	}

	public void validateAmazonHomePage() {
		Assert.assertEquals(Helper.getPageTitle(), "Amazon.com. Spend less. Smile more.");
		System.out.println(Helper.getPageTitle());
	}
	
	public void inputEmail(String email) {
		this.elements.email.sendKeys(email);
	}

	public void clickContinueButton() {
		this.elements.continueButton.click();
	}

	public void inputPassword(String password) {
		this.elements.password.sendKeys(password);
	}

	public void clickSignInButton() {
		this.elements.SignInButton.click();
	}

	public String getpwErrorMsg() {
		String errorMsg = this.elements.pwErrorMsg.getText();
		return errorMsg;
	}
	public String getPwImportantMessage() {
		String errorMsg = this.elements.pwImportantMessage.getText();
		return errorMsg;
	}

	public String getemailErrorMsg() {
		String errorMsg = this.elements.emailErrorMsg.getText();
		return errorMsg;
	}

	public String getenterEmailErrorMsg() {
		String errorMsg = this.elements.enterEmailErrorMsg.getText();
		return errorMsg;
	}

}