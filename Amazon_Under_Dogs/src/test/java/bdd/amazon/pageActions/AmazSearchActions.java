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
		GetWebDriver.webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public void validateAmazonHomePage() {
		Assert.assertEquals(Helper.getPageTitle(), "Amazon.com. Spend less. Smile more.");
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

	public String getInvalidProductMsg() {
		String noResultsMsg = this.elements.noResults.getText();
		return noResultsMsg;

	}
}