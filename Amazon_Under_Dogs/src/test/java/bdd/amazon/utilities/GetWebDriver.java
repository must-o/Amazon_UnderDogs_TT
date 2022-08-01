package bdd.amazon.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWebDriver {

	public static WebDriver webdriver;

	public static void setupChromeWebDriver() {
		WebDriverManager.chromedriver().setup();
		webdriver = new ChromeDriver();
	}

	public static void setupFirefoxWebDriver() {
		WebDriverManager.firefoxdriver().setup();
		webdriver = new FirefoxDriver();
	}

	public static void tearDownWebDriver() {
		webdriver.quit();
	}

}
