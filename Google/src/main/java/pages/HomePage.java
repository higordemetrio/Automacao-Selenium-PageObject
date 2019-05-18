package pages;

import org.openqa.selenium.WebDriver;

import maps.HomeMap;
import utils.Evidence;

public class HomePage extends BasePage {
	WebDriver driver;
	HomeMap homeMap;
	Evidence evidence;

	public HomePage(WebDriver driver, Evidence evidence) {
		this.driver = driver;
		this.evidence = evidence;
		homeMap = new HomeMap(driver);
	}

	/**
	 * Method to search in google for text
	 * 
	 * @param text text to search
	 * @throws Exception
	 */
	public void search(String text) throws Exception {
		homeMap.inputPesquisar.sendKeys(text);
		Evidence.takeEvidence(driver, "sendKeys");
		homeMap.buttonPesquisar.click();
		Evidence.takeEvidence(driver, "click");

	}
}
