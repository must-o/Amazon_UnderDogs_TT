package bdd.amazon.utilities;

public class Helper {

	public static String getPageTitle() {
		return GetWebDriver.webdriver.getTitle();
	}
	
	public static String getPageUrl() {
		return GetWebDriver.webdriver.getCurrentUrl();
	}
	
}
