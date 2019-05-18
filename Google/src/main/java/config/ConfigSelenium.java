package config;

import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.Evidence;

public class ConfigSelenium {
	public static WebDriver driver;
	public static Evidence evidence;

	@BeforeClass
	public static void startDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Access URL
		driver.get("http://www.google.com");
		// Start Evidence
		evidence = new Evidence(driver);
		try {
			evidence.takeEvidence(driver, "home");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@After
	public void quitDriver() {
		driver.quit();
	}

}
