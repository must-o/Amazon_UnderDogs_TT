package bdd.amazon.stepDefinitions;

import org.testng.Assert;

import bdd.amazon.pageActions.AmazSearchActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazSearchStepDefinitions {

	AmazSearchActions action = new AmazSearchActions();

	@Given("User is on amazon home page")
	public void user_is_on_amazon_home_page() throws InterruptedException {
		action.openAmazonHomePage();
		action.validateAmazonHomePage();
		Thread.sleep(1500);

	}

	@When("User clicks on the Search box")
	public void user_clicks_on_the_Search_box() throws InterruptedException {
		action.clickSearchBox();
		Thread.sleep(1500);

	}

	@When("Enter a valid product name {string}")
	public void enter_a_valid_product_name(String Echo) throws InterruptedException {
		action.inputProductName(Echo);
		Thread.sleep(1500);

	}

	@When("Click on search button")
	public void click_on_search_button() throws InterruptedException {
		action.clickSearchButton();
		Thread.sleep(1500);

	}

	@Then("Links related to the Product display on {string} page")
	public void links_related_to_the_Product_display_on_page(String RESULTS) throws InterruptedException {
		String searchResults = action.getSearchResult();
		Assert.assertEquals(searchResults, RESULTS);
		Thread.sleep(1500);

	}

	@When("User enters an {string} name in the search box")
	public void User_enters_an_name_in_the_search_box(String invalid_product) throws InterruptedException {
		action.inputProductName(invalid_product);
		Thread.sleep(1500);

	}

	@Then("No link shows up on {string} page")
	public void no_link_shows_up_on_page(String no_results) throws InterruptedException {
		String noResult = action.getInvalidProductMsg();
		Assert.assertEquals(noResult, no_results);
		Thread.sleep(1500);


	}
	
	@When("User clicks on Echo Dot Fourth Gen")
	public void user_clicks_on_Echo_Dot_Fourth_Gen() throws InterruptedException {
	    action.clickEchoProduct();
		Thread.sleep(1500);

	}

	@Then("Echo product page opens")
	public void echo_product_page_opens() throws InterruptedException {
	    action.validateEchoPage();
		Thread.sleep(1500);

	}

	@When("User clicks add to cart")
	public void user_clicks_add_to_cart() throws InterruptedException {
	    action.clickAtcButton();
		Thread.sleep(1500);

	}

	@When("Clicks X to close pop-up window")
	public void clicks_X_to_close_pop_up_window() throws InterruptedException {
		action.clickNoThanks();
		Thread.sleep(3000);
	    
	}

	@Then("User should be redirected to Cart page")
	public void user_should_be_redirected_to_Cart_page() throws InterruptedException {
	    action.validateAmazonCartPage();
		Thread.sleep(1500);

	}

	@Then("User should see added to cart confirmation {string}")
	public void user_should_see_added_to_cart_confirmation(String confirmation) {
		String confirm = action.getAddedToCartText();
		Assert.assertEquals(confirm, confirmation);
	}
	
	
	
	
	
	
}
