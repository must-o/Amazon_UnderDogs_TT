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
		System.out.println();
	}
	

	public void navigateToAmazonCreateAccountPage() {
		GetWebDriver.webdriver.get("shorturl.at/pwX16");
		GetWebDriver.webdriver.manage().window().maximize();
		GetWebDriver.webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public void validateAmazonCreateAccountPage() {
		Assert.assertEquals(Helper.getPageTitle(), "Amazon Registration");
	}

	public void inputName(String name) {
		this.elements.name.sendKeys(name);
	}

	public void inputEmail(String email) {
		this.elements.email.sendKeys(email);
	}

	public void inputPassword(String password) {
		this.elements.password.sendKeys(password);
	}
	
	public void inputPassword2(String password2) {
		this.elements.password2.sendKeys(password2);
	}
	
	public void clickContinueButton() {
		this.elements.continueButton.click();
	}

	

}
