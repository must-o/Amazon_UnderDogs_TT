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

	@FindBy(css = "img[alt=\"Echo Dot (3rd Gen, 2018 release) - Smart speaker with Alexa - Charcoal\"]")
	public WebElement echoDot;
	
	@FindBy(xpath = "//input[@id=\"add-to-cart-button\"]")
	public WebElement atcButton;
	
	@FindBy(xpath = "//*[@id=\"abb-intl-pop-cta\"]/span[3]/span/input")
	public WebElement noThanks;
	
	@FindBy(xpath = "//*[@id=\"sw-atc-details-single-container\"]/div[2]/div[1]/span")
	public WebElement addedToCartText;
	
	
	
	
}