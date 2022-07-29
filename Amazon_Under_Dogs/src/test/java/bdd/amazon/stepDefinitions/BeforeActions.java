package bdd.amazon.stepDefinitions;

import bdd.amazon.utilities.GetWebDriver;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeActions {

	@Before("@chrome")
	public void beforeChromeSceanrio(Scenario scenario) {
		System.out.println("::: Chrome Driver Initialization Started :::");

		try {

			GetWebDriver.setupChromeWebDriver();
			System.out.println("::: Chrome Driver Initialized :::");
			System.out.println(scenario.getName());
		} catch (Exception e) {
			System.out.println("!!! Chrome Driver Initialization Failed !!!");
		}

	}

	@Before("@firefox")
	public void beforeFirefoxSceanrio(Scenario scenario) {
		System.out.println("::: Firefox Driver Initialization Started :::");

		try {

			GetWebDriver.setupFirefoxWebDriver();
			System.out.println("::: Firefox Driver Initialized :::");
			System.out.println(scenario.getName());
		} catch (Exception e) {
			System.out.println("!!! Firefox Driver Initialization Failed !!!");
		}
	}

}
