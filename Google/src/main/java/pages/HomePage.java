package pages;

import org.openqa.selenium.WebDriver;

import maps.HomeMap;

public class HomePage extends BasePage {
	WebDriver driver;
	HomeMap homeMap;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		homeMap = new HomeMap(driver);
	}

	public void pesquisar(String text) {

		homeMap.inputPesquisar.sendKeys(text);
		homeMap.buttonPesquisar.click();
	}
}
