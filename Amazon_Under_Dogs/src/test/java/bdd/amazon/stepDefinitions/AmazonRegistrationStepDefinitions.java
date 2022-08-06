package bdd.amazon.stepDefinitions;

import org.testng.Assert;
import bdd.amazon.pageActions.AmazonRegistrationPageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.Assert;
import bdd.amazon.pageActions.*;
import bdd.amazon.utilities.*;

public class AmazonRegistrationStepDefinitions {

	AmazonRegistrationPageActions action = new AmazonRegistrationPageActions();

	@Given("Customer in Amazon Create Account page")
	public void customer_in_Amazon_Create_Account_page() {
		action.navigateToAmazonRegistrationPage();
		action.validateAmazonCreateAccountPage();

	}

	@When("User inputs {string} in the name field")
	public void user_inputs_in_the_name_field(String name) throws InterruptedException {
		action.inputName(name);
		Thread.sleep(500);

	}

	@When("User inputs {string} in email field")
	public void user_inputs_in_email_field(String email) throws InterruptedException {
		action.inputEmail(email);
		Thread.sleep(500);
	}

	@When("User inputs {string} in the password field")
	public void user_inputs_in_the_password_field(String string) throws InterruptedException {
		action.inputPassword(string);
		Thread.sleep(500);

	}

	@When("User inputs {string} in the re-enter password field")
	public void user_inputs_in_the_re_enter_password_field(String string) throws InterruptedException {
		action.inputPassword2(string);
		Thread.sleep(500);

	}

	@When("User clicks continue")
	public void user_clicks_continue() {
		action.clickContinueButton();
	}

	@Then("User should see name field error message {string}")
	public void user_should_see_name_field_error_message(String nameErrorMsg) {
		String actualErrorMsg = action.getNameErrorMsg();
		Assert.assertEquals(actualErrorMsg, nameErrorMsg);
		System.out.println(actualErrorMsg);

	}

	@Then("User should see email field error message {string}")
	public void user_should_see_email_field_error_message(String emailErrorMsg) {
		String actualErrorMsg = action.getEmailInvalidMsg();
		Assert.assertEquals(actualErrorMsg, emailErrorMsg);
		System.out.println(actualErrorMsg);

	}

	@Then("User should see password field error message  {string}")
	public void user_should_see_password_field_error_message(String passwordErrorMsg) {
		String actualErrorMsg = action.getPasswordInvalidMsg();
		Assert.assertEquals(actualErrorMsg, passwordErrorMsg);
		System.out.println(actualErrorMsg);

	}

	@Then("User should see password2 field error message {string}")
	public void user_should_see_password2_field_error_message(String password2ErrorMsg) {
		String actualErrorMsg = action.getPassword2MismatchMsg();
		Assert.assertEquals(actualErrorMsg, password2ErrorMsg);
		System.out.println(actualErrorMsg);

	}
	
	@Then("User should be redircted to the captcha puzzle page")
	public void user_should_be_redircted_to_the_captcha_puzzle_page() {
		action.validateAmazonCaptchaPage();
	}
	

}
