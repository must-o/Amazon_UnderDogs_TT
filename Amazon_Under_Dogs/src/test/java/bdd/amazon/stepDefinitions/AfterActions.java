package bdd.amazon.stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import bdd.amazon.utilities.GetWebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class AfterActions {

	@After
	public void afterChromeSceanrio(Scenario scenario) {

		System.out.println("::: Test Executed - " + scenario.getName() + " :::");
		System.out.println("::: Closing Browsers :::");

		try {
			if (scenario.isFailed()) {
				TakesScreenshot ts = (TakesScreenshot) GetWebDriver.webdriver;
				byte[] bytes = ts.getScreenshotAs(OutputType.BYTES);
				scenario.attach(bytes, "image/png", "failed_image");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		GetWebDriver.tearDownWebDriver();
		System.out.println("::: Driver Closed :::");

	}

}
