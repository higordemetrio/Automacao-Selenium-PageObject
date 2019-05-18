package maps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeMap {
	public WebElement inputPesquisar;
	public WebElement buttonPesquisar;

	public HomeMap(WebDriver driver) {
		inputPesquisar = driver.findElement(By.xpath("//input[@title='Pesquisar']"));
		buttonPesquisar = driver.findElement(By.xpath("(//input[@value='Pesquisa Google'])[1]"));

	}

}
