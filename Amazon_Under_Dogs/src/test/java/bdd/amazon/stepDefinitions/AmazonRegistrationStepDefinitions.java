package bdd.amazon.stepDefinitions;

import org.testng.Assert;

import bdd.amazon.pageActions.AmazonRegistrationPageActions;
import bdd.amazon.utilities.Helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonRegistrationStepDefinitions {

	AmazonRegistrationPageActions action = new AmazonRegistrationPageActions();

	
	
	@Given("I am inputting new credentials")
	public void i_am_inputting_new_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I input Talen in the name field")
	public void i_input_Talen_in_the_name_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I input talentechtest@gmail.com in email field")
	public void i_input_talentechtest_gmail_com_in_email_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I input April2022 in the password field")
	public void i_input_April2022_in_the_password_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I input  in the re-enter password field")
	public void i_input_in_the_re_enter_password_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I click continue")
	public void i_click_continue() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I should be redirected to comlete puzzle captcha page")
	public void i_should_be_redirected_to_comlete_puzzle_captcha_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I input  in the password field")
	public void i_input_in_the_password_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I input April2022 in the re-enter password field")
	public void i_input_April2022_in_the_re_enter_password_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I input talentechtest in email field")
	public void i_input_talentechtest_in_email_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I input  in email field")
	public void i_input_in_email_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I input  in the name field")
	public void i_input_in_the_name_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	
	
	
	
	@Given("Customer in UPS tracking page")
	public void customer_in_UPS_tracking_page() {
		action.navigateToUpsTrackingPackagePage();
		action.validateUpsTrackingPackagePage();
	}

	@When("Customer gives an invalid tacking number {string} input")
	public void customer_gives_an_invalid_tacking_number_input(String trackingNumber) {
		action.inputTrackingNumber(trackingNumber);
	}

	@When("Customer clicks on the track button") 
	public void customer_clicks_on_the_track_button() {
		action.clickTrackButton();
	}

	@Then("Customer should receive an error message {string}")
	public void customer_should_receive_an_error_message(String expectedErrorMsg) {
		String actualErrorMsg = action.getTrackingErrorMessage_1();
		Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
	}

	@When("Customer gives a valid tracking number {string} input")
	public void customer_gives_a_valid_tracking_number_input(String trackingNumber) {
		action.inputTrackingNumber(trackingNumber);
	}

	@Then("Delivered {string} should be available for successful package delivery")
	public void delivered_should_be_available_for_successful_package_delivery(String expectedMsg) {
		String actualMsg = action.getDeliveredMessage();
		Assert.assertEquals(actualMsg, expectedMsg);
	}

}
