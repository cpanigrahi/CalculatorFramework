package utillibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLib {

	public static WebDriver driver;

	static String applicationUrl = "https://www.anz.com.au/";

	public static void getBrowser(String browser) {

		if (browser.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

			driver.manage().window().maximize();

			BrowserLib.driver.get(applicationUrl);

		} else {

			WebDriverManager.chromedriver().setup();

			ChromeOptions options = new ChromeOptions();

			options.addArguments("test-type");

			options.addArguments("start-maximized");

			options.addArguments("--js-flags=--expose-gc");

			options.addArguments("--enable-precise-memory-info");

			options.addArguments("--disable-popup-blocking");

			options.addArguments("--disable-default-apps");

			options.addArguments("--disable-notifications");

			options.addArguments("disable-infobars");

			driver = new ChromeDriver(options);

			driver.manage().window().maximize();

			BrowserLib.driver.get(applicationUrl);

		}
	}

}
