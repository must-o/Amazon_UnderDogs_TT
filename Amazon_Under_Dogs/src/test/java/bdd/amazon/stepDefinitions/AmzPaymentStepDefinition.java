package bdd.amazon.stepDefinitions;

import bdd.amazon.pageActions.AmzPaymentPageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmzPaymentStepDefinition {
	AmzPaymentPageActions action = new AmzPaymentPageActions();

	
	
	@Given("User is on Amazon Cart login page")
	public void user_is_on_Amazon_Cart_login_page() throws InterruptedException {
		action.navigateToAmazonCartPage();
		Thread.sleep(1000);
	}

	@Given("clicks signInToYourAccount")
	public void clicks_signInToYourAccount() throws InterruptedException {
		action.clickSignInToYourAccBtn();
		Thread.sleep(500);
	}

	@Given("User inputs {string} in the email field")
	public void user_inputs_in_the_email_field(String email) throws InterruptedException {
	    action.emailInput(email);
	    Thread.sleep(500);
	}

	@Given("clicks continue")
	public void clicks_continue() throws InterruptedException {
	   action.clickContinueBtn();
	   Thread.sleep(1000);
	}

	@Given("user inputs {string} in the password field")
	public void user_inputs_in_the_password_field(String password) throws InterruptedException {
	    action.PpsswordInput(password);
	    Thread.sleep(500);
	}

	@Given("clicks submit")
	public void clicks_submit() throws InterruptedException {
	   action.clickSignInBtn();
	   Thread.sleep(1000);
	}

	@Given("clicks proceedTOCheckout")
	public void clicks_proceedTOCheckout() throws InterruptedException {
	    action.clickProceedToCheckoutBtn();
	    Thread.sleep(1000);
	}

	@Given("clicks removeButton under the saved address")
	public void clicks_removeButton_under_the_saved_address() throws InterruptedException {
	   action.clickRemoveBtn();
	   Thread.sleep(1000);
	}
	
	@When("User inputs {string} in the Street Address field")
	public void user_inputs_in_the_Street_Address_field(String address) throws InterruptedException {
	   action.inputStreetaddress1(address);
	   Thread.sleep(500);
	}

	@When("User inputs {string} in Apt, Suite, Unit, Building field")
	public void user_inputs_in_Apt_Suite_Unit_Building_field(String addressline2) throws InterruptedException {
	   action.inputStreetaddress2(addressline2);
	   Thread.sleep(500);
	}

	@When("User inputs {string} in the City field")
	public void user_inputs_in_the_City_field(String cityName) throws InterruptedException {
	    action.inputCity(cityName);
	    Thread.sleep(500);
	}

	@When("User selects {string} in the State field")
	public void user_selects_in_the_State_field(String string) throws InterruptedException {
	    action.clickStateButton();
	    Thread.sleep(500);
	    action.clickNewYorkButton();
	    Thread.sleep(500);
	}
	

	@When("User inputs {string} in the Zip Code field")
	public void user_inputs_in_the_Zip_Code_field(String zipcode) throws InterruptedException {
	    action.inputZipcode(zipcode);
	    Thread.sleep(500);
	}


	@When("User clicks Use This Address")
	public void user_clicks_Use_This_Address() throws InterruptedException {
	    action.clickUseThisAddressButton();
	    Thread.sleep(500);
	}

	@Then("User should see Select a Payment Method page")
	public void user_should_see_Select_a_Payment_Method_page() throws InterruptedException {
	    action.validatePaymentMethodPage();
	    Thread.sleep(1000);
	}


}
