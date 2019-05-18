package scenarios;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import config.ConfigSelenium;
import pages.HomePage;

@RunWith(BlockJUnit4ClassRunner.class)
public class SimpleSearch extends ConfigSelenium {
	HomePage homePage;

	@Before
	public void pages() {
		homePage = new HomePage(driver, evidence);
	}

	@Test
	public void test() {

		try {
			// script
			homePage.search("Everis");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
