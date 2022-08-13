package bdd.amazon.stepDefinitions;

import org.testng.Assert;

import bdd.amazon.pageActions.AmzPaymentPageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmzPaymentStepDefinition {
	AmzPaymentPageActions action = new AmzPaymentPageActions();

	
	
	@Given("User is on Amazon Cart login page")
	public void user_is_on_Amazon_Cart_login_page() throws InterruptedException {
		action.navigateToAmazonCartPage();
		Thread.sleep(1500);
	}

	@Given("clicks signInToYourAccount")
	public void clicks_signInToYourAccount() throws InterruptedException {
		action.clickSignInToYourAccBtn();
		Thread.sleep(1500);
	}

	@Given("User inputs {string} in the email field")
	public void user_inputs_in_the_email_field(String email) throws InterruptedException {
	    action.emailInput(email);
	    Thread.sleep(1500);
	}

	@Given("clicks continue")
	public void clicks_continue() throws InterruptedException {
	   action.clickContinueBtn();
	   Thread.sleep(1500);
	}

	@Given("user inputs {string} in the password field")
	public void user_inputs_in_the_password_field(String password) throws InterruptedException {
	    action.PpsswordInput(password);
	    Thread.sleep(1500);
	}

	@Given("clicks submit")
	public void clicks_submit() throws InterruptedException {
	   action.clickSignInBtn();
	   Thread.sleep(1500);
	}

	@Given("clicks proceedTOCheckout")
	public void clicks_proceedTOCheckout() throws InterruptedException {
	    action.clickProceedToCheckoutBtn();
	    Thread.sleep(1500);
	}

	@Given("clicks removeButton under the saved address")
	public void clicks_removeButton_under_the_saved_address() throws InterruptedException {
	   action.clickRemoveBtn();
	   Thread.sleep(1500);
	}
	
	@When("User inputs {string} in the Street Address field")
	public void user_inputs_in_the_Street_Address_field(String address) throws InterruptedException {
	   action.inputStreetaddress1(address);
	   Thread.sleep(1500);
	}

	@When("User inputs {string} in Apt, Suite, Unit, Building field")
	public void user_inputs_in_Apt_Suite_Unit_Building_field(String addressline2) throws InterruptedException {
	   action.inputStreetaddress2(addressline2);
	   Thread.sleep(1500);
	}

	@When("User inputs {string} in the City field")
	public void user_inputs_in_the_City_field(String cityName) throws InterruptedException {
	    action.inputCity(cityName);
	    Thread.sleep(1500);
	}

	@When("User selects {string} in the State field")
	public void user_selects_in_the_State_field(String string) throws InterruptedException {
	    action.clickStateButton();
	    Thread.sleep(1500);
	    action.clickNewYorkButton();
	    Thread.sleep(1500);
	}
	

	@When("User inputs {string} in the Zip Code field")
	public void user_inputs_in_the_Zip_Code_field(String zipcode) throws InterruptedException {
	    action.inputZipcode(zipcode);
	    Thread.sleep(1500);
	}


	@When("User clicks Use This Address")
	public void user_clicks_Use_This_Address() throws InterruptedException {
	    action.clickUseThisAddressButton();
	    Thread.sleep(1500);
	}

	@Then("User should see Select a Payment Method page")
	public void user_should_see_Select_a_Payment_Method_page() throws InterruptedException {
	    action.validatePaymentMethodPage();
	    Thread.sleep(1500);
	}
	
	@Then("User should see error message {string}")
	public void user_should_see_error_message(String reviewYourAddressMsg) {
		String actualErrorMsg = action.getReviewYourAddressMsg();
		Assert.assertEquals(actualErrorMsg, reviewYourAddressMsg);
		System.out.println(actualErrorMsg);
	}
	
	@When("user clicks on Enter a gift card, voucher or promotional code")
	public void user_clicks_on_Enter_a_gift_card_voucher_or_promotional_code() throws InterruptedException {
	   action.clickEnterAGiftCardBtn();
	   Thread.sleep(1500);
	}
	@When("user clicks in the box")
	public void user_clicks_in_the_box() throws InterruptedException {
	   action.entCodeBox();
	   Thread.sleep(1500);
	}


	@When("user input {string} in the field")
	public void user_input_in_the_field(String giftCardCode) throws InterruptedException {
	   action.giftCardCodeInput(giftCardCode);
	   Thread.sleep(1500);
	}

	@When("user clicks on Apply Button")
	public void user_clicks_on_Apply_Button() throws InterruptedException {
	    action.applyBtn();
	    Thread.sleep(1500);
	}

	@Then("user should recive an error message {string}")
	public void user_should_recive_an_error_message(String reviewYourAddressMsg) {
		String actualErrorMsg = action.getThereWasAProblemMsg();
		Assert.assertEquals(actualErrorMsg, reviewYourAddressMsg);
		System.out.println(actualErrorMsg);
	}




}
