package bdd.amazon.stepDefinitions;

import org.testng.Assert;
import bdd.amazon.pageActions.AmazonSigninPageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.Assert;
import bdd.amazon.pageActions.*;
import bdd.amazon.utilities.*;

public class AmazonSigninStepDefinitions {

	AmazonSigninPageActions action = new AmazonSigninPageActions();

	@Given("User is on the Amazon Sign-in page")
	public void user_is_on_the_Amazon_Sign_in_page() {
		action.navigateToAmazonSigninPage();
		action.validateAmazonSigninPage();
	}

	@When("User enters valid email {string} in email text box")
	public void user_enters_valid_email_in_email_text_box(String email) throws InterruptedException {
		action.inputEmail(email);
		Thread.sleep(1000);
	}

	@When("User clicks on the continue button")
	public void user_clicks_on_the_continue_button() throws InterruptedException {
		action.clickContinueButton();
		Thread.sleep(1000);

	}

	@When("User enters valid password {string} in password text box")
	public void user_enters_valid_password_in_password_text_box(String password) throws InterruptedException {
		action.inputPassword(password);
		Thread.sleep(1000);

	}

	@When("User does not enter anything {string} in email in text box")
	public void user_does_not_enter_anything_in_email_in_text_box(String email) throws InterruptedException {
		action.inputEmail(email);
		Thread.sleep(1000);

	}

	@When("User clicks on the Sign-in button")
	public void user_clicks_on_the_sign_in_button() throws InterruptedException {
		action.clickSignInButton();
		Thread.sleep(3000);


	}

	@Then("User should be should be redirected to the home page of amazon")
	public void user_should_be_should_be_redirected_to_the_home_page_of_amazon() throws InterruptedException {
		Thread.sleep(1000);
		action.validateAmazonHomePage();

	}

	@When("User enters valid email {string}  in text box")
	public void user_enters_valid_email_in_text_box(String email) throws InterruptedException {
		action.inputEmail(email);
		Thread.sleep(1000);

	}

	@When("User enters invalid password {string} in password text box")
	public void user_enters_invalid_password_in_password_text_box(String password) throws InterruptedException {
		action.inputPassword(password);
		Thread.sleep(1000);

	}

	@Then("User should receive an error message {string}")
	public void user_should_receive_an_error_message(String pwErrorMsg) throws InterruptedException {
		String actualErrorMsg = action.getpwErrorMsg();
		Assert.assertEquals(actualErrorMsg, pwErrorMsg);
		System.out.println(actualErrorMsg);
		Thread.sleep(1000);

	}

	@When("User enters invalid email {string} in email text box")
	public void user_enters_invalid_email_in_email_text_box(String emailErrorMsg) throws InterruptedException {
		String actualErrorMsg = action.getemailErrorMsg();
		Assert.assertEquals(actualErrorMsg, emailErrorMsg);
		Thread.sleep(1000);

	}

	
	
	@Then("User should receive error message {string}")
	public void user_should_receive_error_message(String enterEmailErrorMsg) throws InterruptedException {
		String actualErrorMsg = action.getenterEmailErrorMsg();
		Assert.assertEquals(actualErrorMsg, enterEmailErrorMsg);
		Thread.sleep(1000);

	}
	
	@Then("User should receive message {string}")
	public void user_should_receive_message(String pwImportantMessage) throws InterruptedException {
		String actualErrorMsg = action.getenterEmailErrorMsg();
		Assert.assertEquals(actualErrorMsg, pwImportantMessage);
		Thread.sleep(1000);

	}
	
	@Then("User should not advance to homepage")
	public void user_should_not_advance_to_homepage() {
		action.validateAmazonSigninPage();


	}
	
	
}
