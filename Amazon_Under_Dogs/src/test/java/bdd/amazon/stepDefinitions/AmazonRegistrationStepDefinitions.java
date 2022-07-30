package bdd.amazon.stepDefinitions;

import org.testng.Assert;

import bdd.amazon.pageActions.AmazonRegistrationPageActions;
import bdd.amazon.utilities.Helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonRegistrationStepDefinitions {

	AmazonRegistrationPageActions action = new AmazonRegistrationPageActions();

	@Given("Customer in Amazon Create Account page")
	public void customer_in_Amazon_Create_Account_page() {
		action.navigateToAmazonCreateAccountPage();
		action.validateAmazonCreateAccountPage();
	}

	@When("User inputs {string} in the name field")
	public void user_inputs_in_the_name_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User inputs {string} in email field")
	public void user_inputs_in_email_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User inputs {string} in the password field")
	public void user_inputs_in_the_password_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User inputs {string} in the re-enter password field")
	public void user_inputs_in_the_re_enter_password_field(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks continue")
	public void user_clicks_continue() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should see name field error message {string}")
	public void user_should_see_name_field_error_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should see email field error message {string}")
	public void user_should_see_email_field_error_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should see password field error message  {string}")
	public void user_should_see_password_field_error_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should see password2 field error message {string}")
	public void user_should_see_password2_field_error_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	

}
