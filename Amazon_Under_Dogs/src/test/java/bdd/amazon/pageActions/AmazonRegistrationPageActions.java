package bdd.amazon.pageActions;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import bdd.amazon.pageElements.AmazonRegistrationPageElements;
import bdd.amazon.utilities.GetWebDriver;
import bdd.amazon.utilities.Helper;

public class AmazonRegistrationPageActions {

	AmazonRegistrationPageElements elements;

	public AmazonRegistrationPageActions() {
		this.elements = new AmazonRegistrationPageElements();
		PageFactory.initElements(GetWebDriver.webdriver, this.elements);
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public void navigateToUpsTrackingPackagePage() {
		GetWebDriver.webdriver.get("https://www.ups.com/track?loc=en_US&requester=ST/");
		GetWebDriver.webdriver.manage().window().maximize();
		GetWebDriver.webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public void validateUpsTrackingPackagePage() {
		Assert.assertEquals(Helper.getPageTitle(), "Tracking | UPS - United States");
	}

	public void inputTrackingNumber(String trackingNumber) {
		this.elements.trackingInput.sendKeys(trackingNumber);
	}

	public void clickTrackButton() {
		this.elements.trackButton.click();
	}

	public String getTrackingErrorMessage_1() {
		String errorMsg = this.elements.errorMsg_1.getText();
		return errorMsg;
	}

	public String getDeliveredMessage() {
		String deliveredMsg = this.elements.deliveredMessage.getText();
		return deliveredMsg;
	}

}
