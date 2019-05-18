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

	public void search(String text) throws Exception {
		homeMap.inputPesquisar.sendKeys(text);
		evidence.takeEvidence(driver, "sendKeys");
		homeMap.buttonPesquisar.click();
		evidence.takeEvidence(driver, "click");
	}
}
