package bdd.amazon.pageActions;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import bdd.amazon.pageElements.AmazSearchElements;
import bdd.amazon.utilities.GetWebDriver;
import bdd.amazon.utilities.Helper;

public class AmazSearchActions {

	AmazSearchElements elements;

	public AmazSearchActions() {
		this.elements = new AmazSearchElements();
		PageFactory.initElements(GetWebDriver.webdriver, this.elements);

	}

	public void openAmazonHomePage() {
		GetWebDriver.webdriver.get("https://www.amazon.com/");
		GetWebDriver.webdriver.manage().window().maximize();
		GetWebDriver.webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void validateAmazonHomePage() {
		Assert.assertEquals(Helper.getPageTitle(), "Amazon.com. Spend less. Smile more.");
	}
	
	public void validateEchoPage() {
		Assert.assertEquals(Helper.getPageTitle(),"Amazon.com: Echo Dot (3rd Gen, 2018 release) - Smart speaker with Alexa - Charcoal : Amazon Devices & Accessories");
	}

	public void validateAmazonCartPage() {
		Assert.assertEquals(Helper.getPageTitle(), "Amazon.com Shopping Cart");
	}
	public void clickSearchBox() {
		this.elements.searchBox.click();
	}

	public void inputProductName(String Echo) {
		this.elements.searchBox.sendKeys(Echo);
	}

	public void clickSearchButton() {
		this.elements.searchButton.click();
	}

	public String getSearchResult() {
		String results = this.elements.Results.getText();
		return results;
	}
	
	public void clickEchoProduct() {
		this.elements.echoDot.click();
	}
	
	public void clickAtcButton() {
		this.elements.atcButton.click();
	}
	
	public void clickNoThanks() {
		this.elements.noThanks.click();
	}
	
	public String getAddedToCartText() {
		String confirmation = this.elements.addedToCartText.getText();
		return confirmation;
	}
	

	public String getInvalidProductMsg() {
		String noResultsMsg = this.elements.noResults.getText();
		return noResultsMsg;

	}
}