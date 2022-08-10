package bdd.amazon.pageActions;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;

import bdd.amazon.pageElements.AmazonPaymentPageElements;
import bdd.amazon.utilities.GetWebDriver;
import bdd.amazon.utilities.Helper;

public class AmzPaymentPageActions {
	AmazonPaymentPageElements elements;

	public AmzPaymentPageActions() {
		this.elements = new AmazonPaymentPageElements();
		PageFactory.initElements(GetWebDriver.webdriver, this.elements);
	}

	public void navigateToAmazonCartPage() {
		GetWebDriver.webdriver.get("https://www.amazon.com/gp/cart/view.html?ref_=nav_cart");
		GetWebDriver.webdriver.manage().window().maximize();
		GetWebDriver.webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public void validateAmazonCartPage() {
		Assert.assertEquals(Helper.getPageTitle(), "Your Amazon Cart is empty");
		System.out.println(Helper.getPageTitle());
	}

	public void validatePaymentMethodPage() {
		Assert.assertEquals(Helper.getPageTitle(), "Enter the shipping address for this order");
		System.out.println(Helper.getPageTitle());
	}

	public void clickSignInToYourAccBtn() {
		this.elements.signInToYourAccBtn.click();
	}
	
	public void clickRemoveBtn() {
		this.elements.remove.click();
	}
	
	public void emailInput(String email) {
		this.elements.e_mailInput.sendKeys(email);
	}

	public void clickContinueBtn() {
		this.elements.continueBtn.click();
	}

	public void PpsswordInput(String password) {
		this.elements.passInput.sendKeys(password);
	}

	public void clickSignInBtn() {
		this.elements.signInBtn.click();
	}

	public void clickProceedToCheckoutBtn() {
		this.elements.proceedCheckoutBtn.click();
	}

	public void inputStreetaddress1(String address) {
		this.elements.street.sendKeys(address);
	}

	public void inputStreetaddress2(String addressline2) {
		this.elements.aptSuiteBuilding.sendKeys(addressline2);
	}

	public void inputCity(String cityName) {
		this.elements.city.sendKeys(cityName);
	}

	public void clickStateButton() {
		this.elements.stateDropdown.click();
	}

	public void clickNewYorkButton() {
		this.elements.newYork.click();
	}

	public void inputZipcode(String zipcode) throws InterruptedException {

		this.elements.zipCode.clear();
		Thread.sleep(1000);
		this.elements.zipCode.sendKeys(zipcode);
	}

	public void clickUseThisAddressButton() {
		this.elements.useThisAddressButton.click();
	}

	public String getPaymentMethodPage() {
		String paymentPage = this.elements.paymentMethodPage.getText();
		return paymentPage;
	}

}
