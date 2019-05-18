package scenarios;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import config.Selenium;
import pages.HomePage;

@RunWith(BlockJUnit4ClassRunner.class)
public class PesquisaSimples extends Selenium {
	HomePage homePage;

	@Before
	public void pages() {
		homePage = new HomePage(driver);
	}

	@Test
	public void teste() {
		// script
		homePage.pesquisar("Everis");
	}

}
