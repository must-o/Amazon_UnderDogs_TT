package bdd.amazon.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonPaymentPageElements {
	@FindBy(xpath = "//*[@id=\"a-autoid-0-announce\"]/span")
	public WebElement signInToYourAccBtn;

	@FindBy(id = "ap_email")
	public WebElement e_mailInput;

	@FindBy(id = "continue")
	public WebElement continueBtn;

	@FindBy(id = "ap_password")
	public WebElement passInput;

	@FindBy(id = "signInSubmit")
	public WebElement signInBtn;

	@FindBy(name = "proceedToRetailCheckout")
	public WebElement proceedCheckoutBtn;

	@FindBy(xpath = "//*[@id=\"address-book-entry-0\"]/div[3]/div[2]/div/span/a")
	public WebElement remove;

	@FindBy(id = "address-ui-widgets-enterAddressLine1")
	public WebElement street;

	@FindBy(id = "address-ui-widgets-enterAddressLine2")
	public WebElement aptSuiteBuilding;

	@FindBy(id = "address-ui-widgets-enterAddressCity")
	public WebElement city;

	@FindBy(xpath = "//*[@id=\"address-ui-widgets-enterAddressStateOrRegion\"]/span/span")
	public WebElement stateDropdown;

	@FindBy(xpath = "//*[@id=\"1_dropdown_combobox\"]/li[37]/a")
	public WebElement newYork;

	@FindBy(id = "address-ui-widgets-enterAddressPostalCode")
	public WebElement zipCode;

	@FindBy(xpath = "//*[@id=\"address-ui-widgets-form-submit-button\"]/span/input")
	public WebElement useThisAddressButton;

	@FindBy(id = "//*[@id=\"pp-xO8HRd-71\"]/div[1]/div/div/div/div/div/h4")
	public WebElement paymentMethodPage;
	
	@FindBy(xpath = "//*[@id=\"address-ui-widgets-enterAddressFormContainer\"]/div[1]/div/div/h4")
	public WebElement reviewYourAddressMsg;
	
	@FindBy(xpath = "//*[@id=\"address-ui-widgets-enterAddressFormContainer\"]/div[2]/div/div[10]/div/div/div/div/div")
	public WebElement unableToVerify;
	
	@FindBy(xpath = "//*[starts-with(@class,'a-size-base')]")
					 //*[@id=\"pp-Ekv75f-94\"]/span/span
	                 //*[@id=\"pp-VVlON0-94\"]/span/span
	                 //*[@id=\"pp-uxocYd-94\"]/span/span
					 //*[@id=\"pp-VTChQF-94\"]/span/span
	public WebElement enterAGiftCardBtn;
	
	@FindBy(xpath = "//*[@id=\"pp-RKYcCt-96\"]")
	public WebElement enterCodeBox;
	
	@FindBy(xpath = "//*[@id=\"pp-ITtwNa-96\"]")
	public WebElement inputCode;
	
	@FindBy(xpath = "//*[@id=\"pp-ITtwNa-97\"]/span/input")
	public WebElement applyButton;
	
	@FindBy(xpath = "//*[@id=\"pp-RKYcCt-95\"]/div/div/div/h4")
	public WebElement thereWasAProblemErr;
	
	
}
