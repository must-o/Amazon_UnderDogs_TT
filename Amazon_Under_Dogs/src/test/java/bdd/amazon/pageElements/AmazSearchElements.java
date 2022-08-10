package bdd.amazon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazSearchElements {
	@FindBy(id = "twotabsearchtextbox")
	public WebElement searchBox;

	@FindBy(id = "nav-search-submit-button")
	public WebElement searchButton;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[3]/div[2]/div[1]/div[1]/span[1]/div[1]/div[1]/span[1]")
	public WebElement Results;

	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement noResults;

}
