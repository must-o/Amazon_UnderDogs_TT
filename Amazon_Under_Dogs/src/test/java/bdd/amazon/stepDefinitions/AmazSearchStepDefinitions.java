package bdd.amazon.stepDefinitions;

import org.testng.Assert;

import bdd.amazon.pageActions.AmazSearchActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazSearchStepDefinitions {

	AmazSearchActions action = new AmazSearchActions();

	@Given("User is on amazon home page")
	public void user_is_on_amazon_home_page() {
		action.openAmazonHomePage();
		action.validateAmazonHomePage();
	}

	@When("User clicks on the Search box")
	public void user_clicks_on_the_Search_box() {
		action.clickSearchBox();
	}

	@When("Enter a valid product name {string}")
	public void enter_a_valid_product_name(String Echo) {
		action.inputProductName(Echo);
	}

	@When("Click on search button")
	public void click_on_search_button() {
		action.clickSearchButton();

	}

	@Then("Links related to the Product display on {string} page")
	public void links_related_to_the_Product_display_on_page(String RESULTS) {
		String searchResults = action.getSearchResult();
		Assert.assertEquals(searchResults, RESULTS);
	}

	@When("User enters an {string} name in the search box")
	public void User_enters_an_name_in_the_search_box(String invalid_product) {
		action.inputProductName(invalid_product);
	}

	@Then("No link shows up on {string} page")
	public void no_link_shows_up_on_page(String no_results) {
		String noResult = action.getInvalidProductMsg();
		Assert.assertEquals(noResult, no_results);

	}
}
